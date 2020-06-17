package xulithongtin;

import maucau.MauCau;
import maucau.VNIndexTheoThang;
import thongtin.ThongTin;
import thongtin.VNIndex;
import java.time.LocalDate;
import java.util.ArrayList;


public class ThongTinVNIndexTheoThang extends ThongTinVNIndex{

    private static final int SONGAY = 31;

    public ThongTinVNIndexTheoThang(LocalDate ngayBatDau) {
        super(ngayBatDau);
    }

    @Override
    public MauCau khoiTaoMau(LocalDate ngayBatDau) {
        ArrayList<LocalDate> tapNgay = new ArrayList<>();
        int thang = ngayBatDau.getMonthValue();
        for (int i = 0; i < 31; i++){
            if (ThongTin.vnIndexHashMap.containsKey(ngayBatDau.plusDays(i))) {
                if (ThongTin.vnIndexHashMap.get(ngayBatDau.plusDays(i)).getThang() == thang) {
                    tapNgay.add(ngayBatDau.plusDays(i));
                }
            }
        }

        float giaThamChieuThang = ThongTin.vnIndexHashMap.get(tapNgay.get(0)).getGia().getThamChieu();
        float giaDongCuaThang = ThongTin.vnIndexHashMap.get(tapNgay.get(tapNgay.size() - 1)).getGia().getDongCua();
        LocalDate ngayTangManhNhat = null, ngayGiamManhNhat = null, ngayDongCuaCaoNhat = null;
        float min = 0, max = 0, dongCua = 0;

        for (LocalDate ngay: tapNgay){
            VNIndex vnIndex = ThongTin.vnIndexHashMap.get(ngay);
            if ((vnIndex.getGia().getTiLeThayDoi() > max) && (vnIndex.getTang())){
                ngayTangManhNhat = ngay;
                max = vnIndex.getGia().getTiLeThayDoi();
            }
            if ((vnIndex.getGia().getTiLeThayDoi() > min) && (vnIndex.getGiam())){
                ngayGiamManhNhat = ngay;
                min = vnIndex.getGia().getTiLeThayDoi();
            }
            if (vnIndex.getGia().getDongCua() > dongCua){
                ngayDongCuaCaoNhat = ngay;
                dongCua = vnIndex.getGia().getDongCua();
            }
            max = 0;
            min = 0;
        }
        return new VNIndexTheoThang(tapNgay, giaThamChieuThang, giaDongCuaThang, ngayTangManhNhat, ngayGiamManhNhat,
                ngayDongCuaCaoNhat);
    }
}
