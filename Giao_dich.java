package thongtin;

import java.util.Hashtable;

public class Giao_dich {
    private float khoi_luong_khop_lenh, khoi_luong_thoa_thuan, gia_tri_khop_lenh, gia_tri_thoa_thuan;

    public Giao_dich(float khoi_luong_khop_lenh, float khoi_luong_thoa_thuan, float gia_tri_khop_lenh, float gia_tri_thoa_thuan){
        this.setKhopLenh(khoi_luong_khop_lenh, gia_tri_khop_lenh);
        this.setThoaThuan(khoi_luong_thoa_thuan, gia_tri_thoa_thuan);
    }

    public void setKhopLenh(float khoi_luong_khop_lenh, float gia_tri_khop_lenh){
        this.khoi_luong_khop_lenh = khoi_luong_khop_lenh;
        this.gia_tri_khop_lenh = gia_tri_khop_lenh;
    }
    public void setThoaThuan(float khoi_luong_thoa_thuan, float gia_tri_thoa_thuan) {
        this.khoi_luong_thoa_thuan = khoi_luong_thoa_thuan;
        this.gia_tri_thoa_thuan = gia_tri_thoa_thuan;
    }

    public float getKhoiLuongKhopLenh(){
        return khoi_luong_khop_lenh;
    }
    public float getGiaTriKhopLenh(){
        return gia_tri_khop_lenh;
    }
    public float getKhoiLuongThoaThuan(){
        return khoi_luong_thoa_thuan;
    }
    public float getGiaTriThoaThuan(){
        return gia_tri_thoa_thuan;
    }

    public float tongKhoiLuong(){
        return getKhoiLuongKhopLenh() + getKhoiLuongThoaThuan();
    }
    public float tongGiaTri(){
        return getGiaTriKhopLenh() + getGiaTriThoaThuan();
    }
}