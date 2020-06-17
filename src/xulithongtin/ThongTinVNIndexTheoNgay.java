package xulithongtin;

import maucau.MauCau;
import maucau.VNIndexTheoNgay;
import thongtin.ThongTin;
import thongtin.VNIndex;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class ThongTinVNIndexTheoNgay extends ThongTinVNIndex{

    public ThongTinVNIndexTheoNgay(LocalDate ngayBatDau) {
        super(ngayBatDau);
    }

    @Override
    public MauCau khoiTaoMau(LocalDate ngayBatDau) {
        VNIndex vnIndex = ThongTin.vnIndexHashMap.get(ngayBatDau);
        int canTrenThayDoi = (int) Math.ceil(vnIndex.getGia().getThayDoi());
        int canDuoiThayDoi = (int) Math.floor(vnIndex.getGia().getThayDoi());
        int canTrenDongCua = (int) Math.ceil(vnIndex.getGia().getDongCua());
        int canDuoiDongCua = (int) Math.floor(vnIndex.getGia().getDongCua());
        return new VNIndexTheoNgay(vnIndex, canTrenThayDoi, canDuoiThayDoi, canTrenDongCua, canDuoiDongCua);
    }
}
