package xulithongtin;

import thongtin.MaChungKhoan;
import thongtin.ThongTin;

public class TinhChatMa {
    private MaChungKhoan ma;
    private boolean tangTran, tang, dungGiaThamChieu, giam, giamSan;

    public TinhChatMa(MaChungKhoan ma) {
        this.ma = ma;

        if (ma.getGia().getTran() == ma.getGia().getSan()){
            if (ma.getGia().getThamChieu() < ma.getGia().getTran()){
                this.tangTran = true;
                this.tang = true;
                this.dungGiaThamChieu = false;
                this.giam = false;
                this.giamSan = false;
            }
            else if (ma.getGia().getThamChieu() > ma.getGia().getTran()){
                this.tangTran = false;
                this.tang = false;
                this.dungGiaThamChieu = false;
                this.giam = true;
                this.giamSan = true;
            }
            else {
                this.tangTran = false;
                this.tang = false;
                this.dungGiaThamChieu = true;
                this.giam = false;
                this.giamSan = false;
            }
        }
        else {
            if (ma.getGia().getDongCua() == ma.getGia().getTran()){
                this.tangTran = true;
                this.tang = true;
                this.dungGiaThamChieu = false;
                this.giam = false;
                this.giamSan = false;
            }
            else if (ma.getGia().getDongCua() > ma.getGia().getThamChieu()){
                this.tangTran = false;
                this.tang = true;
                this.dungGiaThamChieu = false;
                this.giam = false;
                this.giamSan = false;
            }
            else if (ma.getGia().getDongCua() == ma.getGia().getThamChieu()){
                this.tangTran = false;
                this.tang = false;
                this.dungGiaThamChieu = true;
                this.giam = false;
                this.giamSan = false;
            }
            else if (ma.getGia().getDongCua() == ma.getGia().getSan()){
                this.tangTran = false;
                this.tang = false;
                this.dungGiaThamChieu = false;
                this.giam = true;
                this.giamSan = true;
            }
            else {
                this.tangTran = false;
                this.tang = false;
                this.dungGiaThamChieu = false;
                this.giam = true;
                this.giamSan = false;
            }
        }
    }

    public boolean tangTran(){
        return this.tangTran;
    }

    public boolean giamSan(){
        return this.giamSan;
    }

    public boolean tangGia(){
        return this.tang;
    }

    public boolean giamGia(){
        return this.giam;
    }

    public boolean dungGiaThamChieu(){
        return this.dungGiaThamChieu;
    }

}