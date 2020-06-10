package xulithongtin;

import thongtin.MaChungKhoan;
import thongtin.ThongTin;

public class TinhChatMa {
    private MaChungKhoan ma;

    public TinhChatMa(MaChungKhoan ma) {
        this.ma = ma;
    }

    public boolean tangTran(){
        if(ma.getGia().getTran() == ma.getGia().getDongCua()){
            return true;
        }
        return false;
    }

    public boolean giamSan(){
        if (ma.getGia().getDongCua()==ma.getGia().getSan()){
            return true;
        }
        return false;
    }
    public boolean tangGia(){
        if(ma.getGia().getThayDoiDiem() > 0) {
            return true;
        }
        return false;
    }
    public boolean giamGia(){
        if(ma.getGia().getThayDoiDiem() < 0) {
            return true;
        }
        return false;
    }
    public boolean dungGiaThamChieu(){
        if(ma.getGia().getDongCua() == ma.getGia().getThamChieu()) {
            return true;
        }
        return false;
    }

}
