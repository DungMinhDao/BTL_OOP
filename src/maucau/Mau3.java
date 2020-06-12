package maucau;

import thongtin.MaChungKhoan;

import java.util.ArrayList;

public class Mau3 extends MauCau {
    private static String tag = "Nhóm ngân hàng";
    private ArrayList<MaChungKhoan> nhomNganHangTang, nhomNganHangGiam;

    public Mau3(ArrayList<MaChungKhoan> nhomNganHangTang, ArrayList<MaChungKhoan> nhomNganHangGiam){
        this.nhomNganHangTang = nhomNganHangTang;
        this.nhomNganHangGiam = nhomNganHangGiam;
    }

    @Override
    public void thuThapCau(){
        cau1();
        cau2();
    }

    public void cau1() {
        String s = "Nhóm ngân hàng suy yếu với ";
        int i, length = Math.min(nhomNganHangGiam.size(), 6);
        if(length != 1){
            float minGiam = nhomNganHangGiam.get(0).getGia().getThayDoiDiem();
            float maxGiam = minGiam;
            s = s + nhomNganHangGiam.get(0).getTenMa();
            for (i = 1; i < length; i++) {
                if (minGiam > nhomNganHangGiam.get(i).getGia().getThayDoiDiem()) {
                    minGiam = nhomNganHangGiam.get(i).getGia().getThayDoiDiem();
                }
                if (maxGiam < nhomNganHangGiam.get(i).getGia().getThayDoiDiem()) {
                    maxGiam = nhomNganHangGiam.get(i).getGia().getThayDoiDiem();
                }
                s = s + ", " + nhomNganHangGiam.get(i).getTenMa();
            }

            s = s + " trượt giá " + (-minGiam) + "-" + (-maxGiam) + " đồng.";
            tapCau.add(s);
        }
    }

    public void cau2(){
        String s = "Nhóm ngân hàng có các mã ";
        int i, length = nhomNganHangTang.size();
        float minTang = nhomNganHangTang.get(0).getGia().getThayDoiDiem();
        float maxTang = minTang;
        s = s + nhomNganHangTang.get(0).getTenMa();
        for(i = 1; i < length; i++){
            if(minTang > nhomNganHangTang.get(i).getGia().getThayDoiDiem()){
                minTang = nhomNganHangTang.get(i).getGia().getThayDoiDiem();
            }
            if(maxTang < nhomNganHangTang.get(i).getGia().getThayDoiDiem()){
                maxTang = nhomNganHangTang.get(i).getGia().getThayDoiDiem();
            }
            s = s + ", " + nhomNganHangTang.get(i).getTenMa();
        }
        s = s + " xanh giá, tăng " + minTang + "-" + maxTang + "đồng.";
        tapCau.add(s);
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