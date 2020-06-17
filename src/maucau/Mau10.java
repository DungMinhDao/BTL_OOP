package maucau;

import thongtin.ThongTin;

import java.util.ArrayList;

/**
 * Lớp Mau10  mô hình các câu mô tả dữ liệu về nhóm cổ phiếu trong danh mục thoái vốn
 *
 * @see MauCau
 * @author
 */
public class Mau10 extends MauCau{

    private static String tag = "Nhóm cố phiếu trong danh mục thoái vốn";
    private static String[] danhSachThoaiVon = {"BMI", "FPT", "SMA", "BVH", "PPC", "TRA", "DMC", "BMP"};
    private ArrayList<String> danhSachTangManh;
    private ArrayList<String> danhSachTang;
    private ArrayList<String> danhSachGiamSau;
    private ArrayList<String> danhSachGiam;

    public Mau10(ArrayList<String> danhSachTangManh, ArrayList<String> danhSachTang, ArrayList<String> danhSachGiamSau,
                 ArrayList<String> danhSachGiam){
        this.danhSachTangManh = danhSachTangManh;
        this.danhSachTang = danhSachTang;
        this.danhSachGiamSau = danhSachGiamSau;
        this.danhSachGiam = danhSachGiam;
    }

    public void thuThapCau(){
        cau1();
        cau2();
        cau3();
        cau4();
        cau5();
        cau6();
        cau7();
        cau8();
        cau9();
    }

    public String getDanhSachThoaiVon(){
        String s = "";
        int i = danhSachThoaiVon.length;
        for (String tenMa: danhSachThoaiVon){
            s = s + tenMa;
            if (i > 1){
                s = s + ", ";
                i = i - 1;
            }
        }
        return s;
    }

    public String getDanhSachTangManh(){
        String s = "";
        int i;
        for (i = 0; i < danhSachTangManh.size() - 1; i++){
            s = s + danhSachTangManh.get(i) + ", ";
        }
        s = s + danhSachTangManh.get(i);
        return s;
    }

    public String getDanhSachTang(){
        String s = "";
        int i;
        for (i = 0; i < danhSachTang.size() - 1; i++){
            s = s + danhSachTang.get(i) + ", ";
        }
        s = s + danhSachTang.get(i);
        return s;
    }

    public String getDanhSachGiamSau(){
        String s = "";
        int i;
        for (i = 0; i < danhSachGiamSau.size() - 1; i++){
            s = s + danhSachGiamSau.get(i) + ", ";
        }
        s = s + danhSachGiamSau.get(i);
        return s;
    }

    public String getDanhSachGiam(){
        String s = "";
        int i;
        for (i = 0; i < danhSachGiam.size() - 1; i++){
            s = s + danhSachGiam.get(i) + ", ";
        }
        s = s + danhSachGiam.get(i);
        return s;
    }

    public String getDanhSachKhongTangManh(){
        String s = "";
        int i;
        int j = danhSachThoaiVon.length - danhSachTangManh.size() - 1;
        if (j == 0) return s;
        for (i = 0; i < danhSachThoaiVon.length; i++){
            if (!danhSachTangManh.contains(danhSachThoaiVon[i])) {
                s = s + danhSachThoaiVon[i];
                if (j > 0) {
                    s = s + ", ";
                    j = j - 1;
                }
            }
        }
        return s;
    }

    public String getDanhSachKhongGiamSau(){
        String s = "";
        int i;
        int j = danhSachThoaiVon.length - danhSachGiamSau.size() - 1;
        if (j == 0) return s;
        for (i = 0; i < danhSachThoaiVon.length; i++){
            if (!danhSachGiamSau.contains(danhSachThoaiVon[i])) {
                s = s + danhSachThoaiVon[i];
                if (j > 0) {
                    s = s + ", ";
                    j = j - 1;
                }
            }
        }
        return s;
    }

    public void cau1(){
        if (danhSachTangManh.size() > 1) {
            tapCau.add("Các cổ phiếu trong danh mục thoái vốn của SCIC như " + getDanhSachTangManh()
                    + " vẫn tiếp tục tăng mạnh.");
        }
    }

    public void cau2(){
        if (danhSachGiamSau.size() > 1) {
            tapCau.add("Các cổ phiếu trong danh mục thoái vốn của SCIC như " + getDanhSachGiamSau()
                    + " vẫn tiếp tục giảm sâu.");
        }
    }

    public void cau3(){
        if (danhSachThoaiVon.length - danhSachTang.size() == 1) {
            String tenMaKhongTang = "";
            for (int i = 0; i < danhSachThoaiVon.length; i++){
                if (danhSachTang.contains(danhSachThoaiVon[i])){
                    tenMaKhongTang = danhSachThoaiVon[i];
                    break;
                }
            }
            tapCau.add("Các cổ phiếu trong danh mục SCIC thoái vốn như " + getDanhSachTang()
                    + " tiếp tục tăng điểm, chỉ có " + tenMaKhongTang + " giảm "
                    + ThongTin.maChungKhoanHashMap.get(tenMaKhongTang).getGia().getThayDoi() + " đồng.");
        }
    }

    public void cau4(){
        if (danhSachThoaiVon.length - danhSachGiam.size() == 1) {
            String tenMaKhongGiam = "";
            for (int i = 0; i < danhSachThoaiVon.length; i++){
                if (danhSachGiam.contains(danhSachThoaiVon[i])){
                    tenMaKhongGiam = danhSachThoaiVon[i];
                    break;
                }
            }
            tapCau.add("Các cổ phiếu trong danh mục SCIC thoái vốn như " + getDanhSachGiam()
                    + " tiếp tục giảm điểm, chỉ có " + tenMaKhongGiam + " tăng "
                    + (ThongTin.maChungKhoanHashMap.get(tenMaKhongGiam).getGia().getThayDoi() * 1000) + " đồng.");
        }
    }

    public void cau5(){
        if ((danhSachTangManh.size() > 1) && (danhSachTangManh.size() < danhSachThoaiVon.length)){
            tapCau.add("Ngoài ra, các cổ phiếu trong danh mục thoái vốn của SCIC như " + getDanhSachTangManh()
                    + " cũng tăng mạnh, ngoại trừ " + getDanhSachKhongTangManh() + ".");
        }
    }

    public void cau6(){
        if ((danhSachGiamSau.size() > 1) && (danhSachGiamSau.size() < danhSachThoaiVon.length)){
            tapCau.add("Ngoài ra, các cổ phiếu trong danh mục thoái vốn của SCIC như " + getDanhSachGiam()
                    + " cũng giảm sâu, ngoại trừ " + getDanhSachKhongGiamSau() + ".");
        }
    }

    public void cau7(){
        if (danhSachTangManh.size() > 1){
            tapCau.add("Tương tự, các cổ phiếu trong danh mục thoái vốn Nhà nước như " + getDanhSachTangManh()
                    + " cũng tăng mạnh.");
        }
    }

    public void cau8(){
        if (danhSachGiamSau.size() > 1){
            tapCau.add("Tương tự, các cổ phiếu trong danh mục thoái vốn Nhà nước như " + getDanhSachGiamSau()
                    + " cũng giảm sâu.");
        }
    }

    public void cau9(){
        tapCau.add("Các cổ phiếu tâm điểm thoái vốn 2020 có thể kể tới như " + getDanhSachThoaiVon() + " ...");
    }
}