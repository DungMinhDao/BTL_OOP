package thongtin;

public class GiaoDich {
    private float khoiLuongKhopLenh, khoiLuongThoaThuan, giaTriKhopLenh, giaTriThoaThuan;

    public GiaoDich(float khoiLuongKhopLenh, float khoiLuongThoaThuan, float giaTriKhopLenh, float giaTriThoaThuan){
        this.setKhopLenh(khoiLuongKhopLenh, giaTriKhopLenh);
        this.setThoaThuan(khoiLuongThoaThuan, giaTriThoaThuan);
    }

    public void setKhopLenh(float khoi_luong_khop_lenh, float gia_tri_khop_lenh){
        this.khoiLuongKhopLenh = khoi_luong_khop_lenh;
        this.giaTriKhopLenh = gia_tri_khop_lenh;
    }
    public void setThoaThuan(float khoi_luong_thoa_thuan, float gia_tri_thoa_thuan) {
        this.khoiLuongThoaThuan = khoi_luong_thoa_thuan;
        this.giaTriThoaThuan = gia_tri_thoa_thuan;
    }

    public float getKhoiLuongKhopLenh(){
        return khoiLuongKhopLenh;
    }
    public float getGiaTriKhopLenh(){
        return giaTriKhopLenh;
    }
    public float getKhoiLuongThoaThuan(){
        return khoiLuongThoaThuan;
    }
    public float getGiaTriThoaThuan(){
        return giaTriThoaThuan;
    }

    public float tongKhoiLuong(){
        return getKhoiLuongKhopLenh() + getKhoiLuongThoaThuan();
    }
    public float tongGiaTri(){
        return getGiaTriKhopLenh() + getGiaTriThoaThuan();
    }
}