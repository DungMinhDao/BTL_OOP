package maucau;

import java.util.ArrayList;

public class TestMau1 {
    public static void main(String[] args) {
        int soMaTang, soMaGiam, soMaDungGia, soMaTangTran, soMaGiamSan;
        soMaTang = 100;
        soMaDungGia = 10;
        soMaGiam = 40;
        soMaTangTran = 20;
        soMaGiamSan = 70;
        Mau1 maucau = new Mau1(soMaTang, soMaDungGia, soMaGiam, soMaTangTran, soMaGiamSan);
        maucau.thuThapCau();
        ArrayList<String> t = maucau.getTapCau();
        System.out.println(t.get(0));
    }
}