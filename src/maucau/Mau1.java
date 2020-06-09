package maucau;

import java.util.ArrayList;

public class Mau1 extends MauCau {
    private static String tag = "Toàn thị trường";
    int soMaTang, soMaGiam, soMaDungGia, soMaTangTran, soMaGiamSan, soMa;

    public Mau1(int soMaTang, int soMaGiam, int soMaDungGia, int soMaTangTran, int soMaGiamSan){
        this.soMaTang = soMaTang;
        this.soMaGiam = soMaGiam;
        this.soMaDungGia = soMaDungGia;
        this.soMaTangTran = soMaTangTran;
        this.soMaGiamSan = soMaGiamSan;
        this.soMa = soMaTang + soMaGiam + soMaDungGia;
    }

    @Override
    public void thuThapCau() {
        cau1();
        cau2();
        cau3();
    }

    public void cau1(){
        String s = "Thị trường đóng cửa với " + soMaTang + " mã tăng giá trong đó có "
                + soMaTangTran + " mã tăng trần; " + soMaDungGia + " mã đứng giá, "
                + soMaGiam + " mã giảm giá trong đó có " + soMaGiamSan + " mã giảm sàn.";
        tapCau.add(s);
    }

    public void cau2(){
        String s = "Toàn thị trường hiện đang có " + soMaTang + " mã tăng giá, " + soMaGiam
                + " mã giảm giá và " + soMaDungGia + " mã đứng giá.";
        tapCau.add(s);
    }

    public void cau3(){
        if(soMaDungGia > soMa / 2){
            String s = "Hiện tại hầu hết các mã đều đứng giá, có " + soMaTang + " mã tăng và "
                    + soMaGiam + " mã giảm.";
            tapCau.add(s);
        }
        else if(soMaTang > soMa / 2){
            String s = "Hiện tại hầu hết các mã đều tăng, có " + soMaGiam + " mã giảm và "
                    + soMaDungGia + " mã đứng giá.";
            tapCau.add(s);
        }
        else if(soMaGiamSan > soMa / 2) {
            String s = "Hiện tại hầu hết các mã đều giảm, có " + soMaTang + " mã tăng và "
                    + soMaDungGia + " mã đứng giá.";
            tapCau.add(s);
        }
    }


    public String getTag() {
        return tag;
    }

    public int getSoMaTang() {
        return soMaTang;
    }

    public int getSoMaGiam() {
        return soMaGiam;
    }

    public int getSoMaDungGia() {
        return soMaDungGia;
    }

    public int getSoMaTangTran() {
        return soMaTangTran;
    }

    public int getSoMaGiamSan() {
        return soMaGiamSan;
    }
}
