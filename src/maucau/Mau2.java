package maucau;

import thongtin.MaChungKhoan;

import java.util.ArrayList;

public class Mau2 extends MauCau {
    private static String tag = "Một số mã";
    ArrayList<MaChungKhoan> maChungKhoans;

    public Mau2(ArrayList<MaChungKhoan> maChungKhoans){
        this.maChungKhoans = maChungKhoans;
    }

    public void cau1(){
        
    }

    public String getTag() {
        return tag;
    }

    public ArrayList<MaChungKhoan> getMaChungKhoans() {
        return maChungKhoans;
    }

    public ArrayList<String> getTapCau(){
        return tapCau;
    }
}
