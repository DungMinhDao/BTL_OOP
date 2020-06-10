package maucau;

import thongtin.MaChungKhoan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Mau6 extends MauCau {
    private static String tag = "Nhóm tăng giá";
    private ArrayList<MaChungKhoan> nhomTangGia;

    public Mau6(ArrayList<MaChungKhoan> nhomTangGia){
        this.nhomTangGia = nhomTangGia;
        Collections.sort(nhomTangGia, new Comparator<T>() {
            @Override
            public int compare(MaChungKhoan m1, MaChungKhoan m2){
                if(m1.getGia().getTiLeThayDoi() < m2.getGia().getTiLeThayDoi()) return 1;
                else if(m1.getGia().getTiLeThayDoi() > m2.getGia().getTiLeThayDoi()) return -1;
                else return 0;
            }
        });
    }

    @Override
    public void thuThapCau(){
        Cau1();
        Cau2();
        Cau3();
        Cau4();
    }

    public void Cau1(){
        String s = "Phía tăng giá, dẫn đầu là ";
        s = s + nhomTangGia.get(0).getTenMa() + " của " + nhomTangGia.get(0).getTenCongTi() + ", tăng " + nhomTangGia.get(0).getGia().getTiLeThayDoi() + " lên đến " + nhomTangGia.get(0).getGia().getDongCua();
        tapCau.add(s);
    }

    public void Cau2(){
        String s = " Nhóm tăng giá cũng có sự góp mặt của một số mã đáng chú khác như ";
        int length = nhomTangGia.size(), i;
        length = Math.min(length, 5);
        for(i = 1; i < length; i++){
            s = s + ", " + nhomTangGia.get(i).getTenMa();
        }
        s = s + ",...";
        tapCau.add(s);
    }

    public void Cau3(){
        String s = "Phía tăng giá, mã có lượng tăng thấp nhất là ";
        int length = nhomTangGia.size();
        s = s + nhomTangGia.get(length-1).getTenMa() + " của " + nhomTangGia.get(length-1).getTenCongTi() + ", tăng " + nhomTangGia.get(length-1).getGia().getTiLeThayDoi() + " lên " + nhomTangGia.get(length-1).getGia().getDongCua();
        tapCau.add(s);
    }

    public void Cau4(){
        String s = "Trong nhóm mã tăng có ";
        String s1 = " mã tăng trần:";
        int count = 0, i;
		int length = nhomTangGia.size();
        for(i = 0; i < length; i++){
            if(nhomTangGia.get(i).getGia().getTran() == nhomTangGia.get(i).getGia().getDongCua()){
                count++;
                if(count < 10){
                    s1 = s1 + " " + nhomTangGia.get(i).getTenMa() + ",";
                }
            }
        }
        s = s + s1 + "...";
        tapCau.add(s);
    }

    public static String getTag() {
        return tag;
    }

    public String getTag(){
        return Mau6.tag;
    }

    public ArrayList<MaChungKhoan> getNhomTangGia(){
        return this.nhomTangGia;
    }
}