package thongtin;

import java.util.Date;

public class ChiSo {
    private String tenChiSo;
    private Gia gia;
    private GiaoDich giaoDich;
    private Date thoiGian;

    public ChiSo(Gia gia, GiaoDich giaoDich, Date thoiGian, String tenChiSo) {
        this.gia = gia;
        this.giaoDich = giaoDich;
        this.thoiGian = thoiGian;
        this.tenChiSo = tenChiSo;
    }

    public String getTenChiSo() {
        return tenChiSo;
    }

    public Gia getGia() {
        return gia;
    }

    public void setGia(Gia gia) {
        this.gia = gia;
    }

    public GiaoDich getGiaoDich() {
        return giaoDich;
    }

    public void setGiaoDich(GiaoDich giaoDich) {
        this.giaoDich = giaoDich;
    }

    public Date getThoi_gian() {
        return thoiGian;
    }

    public void setThoi_gian(Date thoi_gian) {
        this.thoiGian = thoi_gian;
    }
}

