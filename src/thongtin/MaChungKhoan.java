package thongtin;

import java.time.LocalDate;

public class MaChungKhoan {
    private String tenMa, tenCongTi;
    LocalDate thoiGian;
    Gia gia;
    GiaoDich giaoDich;

    public MaChungKhoan(String tenMa, String tenCongTi, Gia gia, GiaoDich giaoDich, LocalDate thoiGian){
        this.tenMa = tenMa;
        this.gia = gia;package thongtin;

import java.time.LocalDate;
import java.util.Date;

public class MaChungKhoan {
    private String tenMa, tenCongTi;
    private Date thoiGian;
    private Gia gia;
    private GiaoDich giaoDich;
    private long vonHoaThiTruong;

    public MaChungKhoan(String tenMa, Gia gia, GiaoDich giaoDich,Date thoiGian,long vonHoaThiTruong){
        this.tenMa = tenMa;
        this.gia = gia;
        this.giaoDich = giaoDich;
        this.thoiGian = thoiGian;
        this.vonHoaThiTruong = vonHoaThiTruong;
    }

    public long getVonHoaThiTruong() {
        return vonHoaThiTruong;
    }

    public String getTenMa() {
        return tenMa;
    }

    public String getTenCongTi() {
        return tenCongTi;
    }

    public Date getThoiGian() {
        return thoiGian;
    }

    public Gia getGia() {
        return gia;
    }

    public GiaoDich getGiaoDich() {
        return giaoDich;
    }

    public void setTenCongTi(String tenCongTi) {
        this.tenCongTi = tenCongTi;
    }
}

        this.giaoDich = giaoDich;
        this.thoiGian = thoiGian;
    }

    public String getTenMa() {
        return tenMa;
    }

    public String getTenCongTi() {
        return tenCongTi;
    }

    public LocalDate getThoiGian() {
        return thoiGian;
    }

    public Gia getGia() {
        return gia;
    }

    public GiaoDich getGiaoDich() {
        return giaoDich;
    }

    public void setTenCongTi(String tenCongTi) {
        this.tenCongTi = tenCongTi;
    }
}
