package maucau;

import thongtin.MaChungKhoan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Lớp Mau7 mô hình các câu mô tả dữ liệu về các cổ phiếu nhóm giảm giá
 *
 * @see MauCau
 * @author
 */
public class Mau7 extends MauCau {
    private static String tag = "Nhóm giảm giá";
    private ArrayList<MaChungKhoan> nhomGiamGia;

    public Mau7(final ArrayList<MaChungKhoan> nhomGiamGia){
        this.nhomGiamGia = nhomGiamGia;
        Collections.sort(this.nhomGiamGia, new Comparator<MaChungKhoan>() {
            @Override
            public int compare(final MaChungKhoan m1, final MaChungKhoan m2){
                if(m1.getGia().getTiLeThayDoi() < m2.getGia().getTiLeThayDoi()) return 1;
                else if(m1.getGia().getTiLeThayDoi() > m2.getGia().getTiLeThayDoi()) return -1;
                else return 0;
            }
        });
    }

    @Override
    public void thuThapCau(){
        cau1();
        cau2();
        cau3();
    }

    public void cau1(){
        String s = "Phía giảm giá, dẫn đầu là ";
        s = s + nhomGiamGia.get(0).getTenMa() + " của " + nhomGiamGia.get(0).getTenCongTi() + ", giảm "
                + nhomGiamGia.get(0).getGia().getTiLeThayDoi() + "% xuống "
                + nhomGiamGia.get(0).getGia().getDongCua() + " nghìn đồng.";
        tapCau.add(s);
    }

    public void cau2(){
        String s = "Nhóm giảm giá cũng có sự góp mặt của một số mã đáng chú khác như ";
        int length = Math.min(nhomGiamGia.size(), 6), i;

        for(i = 1; i < length - 1; i++){
            s = s + nhomGiamGia.get(i).getTenMa() + ", ";
        }
        s = s + nhomGiamGia.get(length-1).getTenMa() + "....";
        tapCau.add(s);
    }

    public void cau3(){
        String s = "Phía giảm giá, mã có lượng giảm thấp nhất là ";
        int length = nhomGiamGia.size();
        s = s + nhomGiamGia.get(length-1).getTenMa() + " của " + nhomGiamGia.get(length-1).getTenCongTi() + ", giảm "
                + nhomGiamGia.get(length-1).getGia().getTiLeThayDoi() + "% xuống "
                + nhomGiamGia.get(length-1).getGia().getDongCua() + " nghìn đồng.";
        tapCau.add(s);
    }
    public static String getTag() {
        return tag;
    }

    public ArrayList<MaChungKhoan> getNhomGiamGia() {
        return nhomGiamGia;
    }
}