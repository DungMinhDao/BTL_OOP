package maucau;

import thongtin.MaChungKhoan;
import thongtin.ThongTin;

import java.util.ArrayList;

public class Mau4 extends MauCau  {
    private static String tag = "Nhóm bluechips";
    private ArrayList<MaChungKhoan> nhomBlueChipsGiam, nhomBlueChipsTang, nhomBlueChipsDungGia;

    public Mau4(ArrayList<MaChungKhoan> nhomBlueChipsGiam, ArrayList<MaChungKhoan> nhomBlueChipsTang,
                ArrayList<MaChungKhoan> nhomBlueChipsDungGia) {
        this.nhomBlueChipsGiam = nhomBlueChipsGiam;
        this.nhomBlueChipsTang = nhomBlueChipsTang;
        this.nhomBlueChipsDungGia = nhomBlueChipsDungGia;
    }

    @Override
    public void thuThapCau() {
        cau1();
        cau2();
        cau3();
    }

    public void cau1(){
        String s = "Trong nhóm bluechips, ";
        for(int i = 0; i < nhomBlueChipsTang.size(); ++i){
            if(i == 3) {
                break;
            }
            s += nhomBlueChipsTang.get(i).getTenMa() + " tăng "
                    + nhomBlueChipsTang.get(i).getGia().getThayDoiDiem() * 1000 + " đồng, ";
        }

        for(int i = 0; i < nhomBlueChipsGiam.size(); ++i){
            if(i == 3) {
                break;
            }
            s += nhomBlueChipsGiam.get(i).getTenMa() + " giảm "
                    + (- nhomBlueChipsGiam.get(i).getGia().getThayDoiDiem() * 1000) + " đồng, ";
        }

        for(int i = 0; i < nhomBlueChipsDungGia.size(); ++i){
            if(i == 3){
                break;
            }
            s += nhomBlueChipsDungGia.get(i) + ", ";
        }
        s += "đứng giá";
        tapCau.add(s);
    }

    public void cau2(){
        String s = "";
        if(nhomBlueChipsTang.size() > nhomBlueChipsGiam.size()
                && nhomBlueChipsTang.size() > nhomBlueChipsDungGia.size()){
            s = "Hàng loạt bluechips đều tăng điểm mạnh như ";
            for(int i = 1; i < nhomBlueChipsTang.size(); ++i){
                if (i == 4){
                    break;
                }
                s += nhomBlueChipsTang.get(i).getTenMa() + " tang "
                        + nhomBlueChipsTang.get(i).getGia().getThayDoiDiem() * 1000 + " đồng, ";
            }
            s += "...";
        }
        else if(nhomBlueChipsGiam.size() > nhomBlueChipsTang.size()
                && nhomBlueChipsGiam.size() > nhomBlueChipsDungGia.size()){
            s = "Hàng loạt bluechips đều tăng điểm mạnh như ";
            for(int i = 1; i < nhomBlueChipsGiam.size(); ++i){
                if (i == 4){
                    break;
                }
                s += nhomBlueChipsGiam.get(i).getTenMa() + " tang "
                        + nhomBlueChipsGiam.get(i).getGia().getThayDoiDiem() * 1000 + " đồng, ";
            }
            s += "...";
        }
        tapCau.add(s);
    }

    public void cau3(){
        if(nhomBlueChipsTang.size() >= 3 || nhomBlueChipsGiam.size() >= 3){
            return;
        }
        String s = "Nhóm cổ phiếu bluechips không đột biến, ";
        for(int i = 0; i < nhomBlueChipsTang.size(); ++i){
            float thaydoigia = nhomBlueChipsTang.get(i).getGia().getThayDoiDiem();
            if(thaydoigia * 1000 <= 1000){
                s += nhomBlueChipsTang.get(i).getTenMa() + " tăng nhẹ " + thaydoigia + " đồng, ";
            }
        }

        for(int i = 0; i < nhomBlueChipsDungGia.size(); ++i){
            s += nhomBlueChipsDungGia.get(i).getTenMa() + ", ";
        }
        s += " đứng giá";

        for(int i = 0; i < nhomBlueChipsGiam.size(); ++i){
            float thaydoigia = - nhomBlueChipsGiam.get(i).getGia().getThayDoiDiem();
            if(thaydoigia * 1000 <= 1000) {
                s += ", " + nhomBlueChipsGiam.get(i).getTenMa() + " giảm nhẹ " + thaydoigia + " đồng";
            }
        }
        s += ".";
        tapCau.add(s);
    }

    public static String getTag() {
        return tag;
    }

    public ArrayList<MaChungKhoan> getNhomBlueChipsGiam() {
        return nhomBlueChipsGiam;
    }

    public ArrayList<MaChungKhoan> getNhomBlueChipsTang() {
        return nhomBlueChipsTang;
    }

    public ArrayList<MaChungKhoan> getNhomBlueChipsDungGia() {
        return nhomBlueChipsDungGia;
    }
}
