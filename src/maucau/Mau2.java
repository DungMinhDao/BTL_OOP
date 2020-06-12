package maucau;

import thongtin.MaChungKhoan;

import java.util.ArrayList;

public class Mau2 extends MauCau {
    private static String tag = "Một số mã";
    ArrayList<MaChungKhoan> maChungKhoanTang, maChungKhoanGiam, maChungKhoanThamChieu;

    public Mau2(final ArrayList<MaChungKhoan> maChungKhoanTang, final ArrayList<MaChungKhoan> maChungKhoanGiam,
                final ArrayList<MaChungKhoan> maChungKhoanThamChieu) {
        this.maChungKhoanTang = maChungKhoanTang;
        this.maChungKhoanGiam = maChungKhoanGiam;
        this.maChungKhoanThamChieu = maChungKhoanThamChieu;
    }

    public void thuThapCau() {
        cau1();
        cau2();
        cau3();
    }

    public void cau1(){
        int i;
        String s = new String();
        String s1 = new String();
        float minTang = maChungKhoanTang.get(0).getGia().getThayDoiDiem();
        float maxTang = minTang;
        int count1 = 0, count2 = 0;
        s = s + maChungKhoanTang.get(0).getTenMa();
        final int length = maChungKhoanTang.size();
        for(i = 1; i < length; i++){
            if(maChungKhoanTang.get(i).getGia().getThayDoiDiem() > maxTang){
                maxTang = maChungKhoanTang.get(i).getGia().getThayDoiDiem();
            }
            if(maChungKhoanTang.get(i).getGia().getThayDoiDiem() < minTang){
                minTang = maChungKhoanTang.get(i).getGia().getThayDoiDiem();
            }

            if(maChungKhoanTang.get(i).getGia().getDongCua() == maChungKhoanTang.get(i).getGia().getTran()){
                if(count2 < 5){
                    s1 = s1 + ", " + maChungKhoanTang.get(i).getTenMa();
                    count2++;
                }
            }
            else{
                if(count1 < 5){
                    s = s + ", " + maChungKhoanTang.get(i).getTenMa();
                    count1++;
                }
            }
        }

        s = s + "lần lượt tăng " + minTang + "-" + maxTang + "đồng một cổ phiếu" + s1 + " thi tăng trần.";
        tapCau.add(s);
    }

    public void cau2(){
        String s = new String("Các mã ");
        int i;
        s = s + maChungKhoanThamChieu.get(0).getTenMa();
        int length = Math.min(maChungKhoanThamChieu.size(), 6);
        for(i = 1; i < length; i++){
            s = s + ", " + maChungKhoanThamChieu.get(i).getTenMa();
        }

        s = s + "đứng mức tham chiếu.";
        tapCau.add(s);
    }

    public void cau3(){
        int i;
        String s = new String();
        float minTang = maChungKhoanTang.get(0).getGia().getThayDoiDiem();
        float maxTang = minTang;
        s = s + maChungKhoanTang.get(0).getTenMa();
        int length = Math.min(maChungKhoanTang.size(), 6);
        for(i = 1; i < length; i++){
            if(maChungKhoanTang.get(i).getGia().getThayDoiDiem() > maxTang){
                maxTang = maChungKhoanTang.get(i).getGia().getThayDoiDiem();
            }
            if(maChungKhoanTang.get(i).getGia().getThayDoiDiem() < minTang){
                minTang = maChungKhoanTang.get(i).getGia().getThayDoiDiem();
            }

            s = s + ", " + maChungKhoanTang.get(i).getTenMa();
        }

        s = s +  "lần lượt tăng " + minTang + "-" + maxTang + "đồng một cổ phiếu trong khi ";
        length = Math.min(maChungKhoanThamChieu.size(), 6);
        for(i = 0; i < length; i++){
            s = s + ", " + maChungKhoanThamChieu.get(i).getTenMa();
        }

        s = s + " đi ngang.";
        tapCau.add(s);
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