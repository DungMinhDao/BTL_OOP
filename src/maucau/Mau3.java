package maucau;

import thongtin.MaChungKhoan;

import java.util.ArrayList;

public class Mau3 extends MauCau {
    private static String tag = "Nhóm ngân hàng";
    private ArrayList<MaChungKhoan> nhomNganHangTang, nhomNganHangGiam, nhomNganHangDungGia;

    public Mau3(ArrayList<MaChungKhoan> nhomNganHangTang, ArrayList<MaChungKhoan> nhomNganHangGiam){
        this.nhomNganHangTang = nhomNganHangTang;
        this.nhomNganHangGiam = nhomNganHangGiam;
    }

    public void cau1(){
        String s = "Nhóm ngân hàng suy yếu với";
    }

    public String getTag() {
        return tag;
    }

    public ArrayList<MaChungKhoan> getNhomNganHangTang() {
        return nhomNganHangTang;
    }

    public ArrayList<MaChungKhoan> getNhomNganHangGiam() {
        return nhomNganHangGiam;
    }

}
