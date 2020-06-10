package maucau;

import thongtin.MaChungKhoan;

import java.util.ArrayList;

public class Mau2 extends MauCau {
    private static String tag = "Một số mã";
    ArrayList<MaChungKhoan> maChungKhoanTang, maChungKhoanGiam, maChungKhoanThamChieu;

    public Mau2(ArrayList<MaChungKhoan> maChungKhoanTang, ArrayList<MaChungKhoan> maChungKhoanGiam,
                ArrayList<MaChungKhoan> maChungKhoanThamChieu) {
        this.maChungKhoanTang = maChungKhoanTang;
        this.maChungKhoanGiam = maChungKhoanGiam;
        this.maChungKhoanThamChieu = maChungKhoanThamChieu;
    }

    public void mau1(){

    }

    public static String getTag() {
        return tag;
    }

    public ArrayList<MaChungKhoan> getMaChungKhoanTang() {
        return maChungKhoanTang;
    }

    public ArrayList<MaChungKhoan> getMaChungKhoanGiam() {
        return maChungKhoanGiam;
    }

    public ArrayList<MaChungKhoan> getMaChungKhoanThamChieu() {
        return maChungKhoanThamChieu;
    }
}
