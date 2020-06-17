package xulithongtin;

import maucau.MauCau;
import maucau.VNIndexTheoTuan;
import thongtin.ThongTin;
import thongtin.VNIndex;

import java.time.LocalDate;
import java.util.ArrayList;

public class ThongTinVNIndexTheoTuan extends ThongTinVNIndex{

    private static final int SONGAY = 5;
    private static final float MUCDANHGIA = 1;

    public ThongTinVNIndexTheoTuan(LocalDate ngayBatDau) {
        super(ngayBatDau);
    }

    @Override
    public MauCau khoiTaoMau(LocalDate ngayBatDau) {
        ArrayList<LocalDate> chuoiNgay = new ArrayList<>();
        for (int i = 0; i < SONGAY; i++){
            if (ThongTin.vnIndexHashMap.containsKey(ngayBatDau.plusDays(i))){
                chuoiNgay.add(ngayBatDau.plusDays(i));
            }
        }

        int soNgayTang = 0, soNgayGiam = 0;
        for (LocalDate ngay: chuoiNgay){
            if (ThongTin.vnIndexHashMap.get(ngay).getTang()){
                soNgayTang += 1;
            }
            if (ThongTin.vnIndexHashMap.get(ngay).getGiam()){
                soNgayGiam += 1;
            }
        }

        LocalDate ngayTangManhNhat = null, ngayGiamManhNhat = null;
        float min = 0, max = 0;

        for (LocalDate ngay: chuoiNgay){
            VNIndex vnIndex = ThongTin.vnIndexHashMap.get(ngay);
            if ((vnIndex.getGia().getTiLeThayDoi() > max) && (vnIndex.getTang())){
                ngayTangManhNhat = ngay;
            }
            if ((vnIndex.getGia().getTiLeThayDoi() > min) && (vnIndex.getGiam())){
                ngayGiamManhNhat = ngay;
            }
            max = 0;
            min = 0;
        }
        return new VNIndexTheoTuan(chuoiNgay,soNgayTang, soNgayGiam, ngayTangManhNhat, ngayGiamManhNhat);
    }
}
