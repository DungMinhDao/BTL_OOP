import thongtin.Giao_dich;

import java.util.Date;

public class Ma {

    private Gia gia;
    private Giao_dich giao_dich;
    private Date thoi_gian;
    private String ten_ma;
    
    public Ma(Gia gia, Giao_dich giao_dich, Date thoi_gian, String ten_ma) {
        this.gia = gia;
        this.giao_dich = giao_dich;
        this.thoi_gian = thoi_gian;
        this.ten_ma = ten_ma
    }

    public String getTen_ma() {
        return ten_ma;
    }
    
    public Gia getGia() {
        return gia;
    }

    public void setGia(Gia gia) {
        this.gia = gia;
    }

    public Giao_dich getGiao_dich() {
        return giao_dich;
    }

    public void setGiao_dich(Giao_dich giao_dich) {
        this.giao_dich = giao_dich;
    }

    public Date getThoi_gian() {
        return thoi_gian;
    }

    public void setThoi_gian(Date thoi_gian) {
        this.thoi_gian = thoi_gian;
    }
}
