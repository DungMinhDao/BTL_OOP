package maucau;

import java.util.ArrayList;
import thongtin.MaChungKhoan;
import thongtin.ThongTin;

/**
 * Lớp Mau9 mô hình các câu mô tả dữ liệu về top 5 các cổ phiếu tăng, giảm giá
 *
 * @see MauCau
 * @author 
 */
public class Mau9 extends MauCau{

    private static String tag = "Top 5 tăng giảm";
    ArrayList<String> top5Tang = new ArrayList<>();
    ArrayList<String> top5Giam = new ArrayList<>();
    private static final int MAX = 5;

    public Mau9(ArrayList<String> top5Tang, ArrayList<String> top5Giam){
        this.top5Tang = top5Tang;
        this.top5Giam = top5Giam;
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
        cau10();
        cau11();
        cau12();
        cau13();
        cau14();
    }
    // Câu tăng top 1 loại 1
    public void cau1() {
        if (top5Tang.size() > 1) {
            MaChungKhoan ma = ThongTin.maChungKhoanHashMap.get(top5Tang.get(0));
            tapCau.add("Đứng ở vị trí đầu tiên là cổ phiếu " + ma.getTenMa() + " của " + ma.getTenCongTi()
                    + " với mức tăng " + ma.getGia().getTiLeThayDoi() + "%.");
        }
    }

    // Câu tăng top 1 loại 2
    public void cau2() {
        if (top5Tang.size() > 1) {
            MaChungKhoan ma = ThongTin.maChungKhoanHashMap.get(top5Tang.get(0));
            tapCau.add("Đứng đầu bảng xếp hạng là " + ma.getTenMa() + " của " + ma.getTenCongTi()
                    + " với mức tăng trưởng " + ma.getGia().getTiLeThayDoi() + "%.");
        }
    }

    // Câu tăng thứ tự bất kỳ 1-5 loại 1
    public void cau3(){
        if(top5Tang.size() > 0) {
            for (int i = 0; i < MAX; i++) {
                MaChungKhoan ma = ThongTin.maChungKhoanHashMap.get(top5Tang.get(i));
                tapCau.add("Đứng thứ " + (i + 1) + " là cổ phiếu " + ma.getTenMa() + " của " + ma.getTenCongTi()
                        + " với mức tăng " + ma.getGia().getTiLeThayDoi() + " %.");
            }
        }
    }

    // Câu tăng thứ tự bất kỳ 1-5 loại 2
    public void cau4(){
        if(top5Tang.size() > 0) {
            for (int i = 0; i < MAX; i++) {
                MaChungKhoan ma = ThongTin.maChungKhoanHashMap.get(top5Tang.get(i));
                tapCau.add("Trong đó, " + ma.getTenMa() + " của " + ma.getTenCongTi() + " đứng ở vị trí thứ " + (i + 1)
                        + " với mức tăng " + ma.getGia().getTiLeThayDoi() + "%.");
            }
        }
    }

    // Câu tăng thứ tự bất kỳ 1-5 loại 3
    public void cau5(){
        if(top5Tang.size() > 0) {
            for (int i = 0; i < MAX; i++) {
                MaChungKhoan ma = ThongTin.maChungKhoanHashMap.get(top5Tang.get(i));
                tapCau.add("Vị trí thứ " + (i + 1) + " là cổ phiếu " + ma.getTenMa() + " của " + ma.getTenCongTi()
                        + " với mức tăng trưởng " + ma.getGia().getTiLeThayDoi() + "%.");
            }
        }
    }

    // Câu tăng thứ tự bất kỳ 1-5 loại 4
    public void cau6(){
        if(top5Tang.size() > 0) {
            for (int i = 0; i < MAX; i++) {
                MaChungKhoan ma = ThongTin.maChungKhoanHashMap.get(top5Tang.get(i));
                tapCau.add("Vị trí thứ " + (i + 1) + " thuộc về cổ phiếu " + ma.getTenMa() + " của " + ma.getTenCongTi()
                        + " với mức tăng trưởng " + ma.getGia().getTiLeThayDoi() + "%.");
            }
        }
    }

    // Câu tăng thứ tự bất kỳ 1-5 loại 5
    public void cau7(){
        if(top5Tang.size() > 0) {
            for (int i = 0; i < MAX; i++) {
                MaChungKhoan ma = ThongTin.maChungKhoanHashMap.get(top5Tang.get(i));
                tapCau.add("Đứng thứ " + (i + 1) + " là " + ma.getTenMa() + " của " + ma.getTenCongTi()
                        + " với mức tăng trưởng " + ma.getGia().getTiLeThayDoi() + "%.");
            }
        }
    }

    // Câu giảm top 1 loại 1
    public void cau8(){
        if(top5Giam.size() > 0) {
            MaChungKhoan ma = ThongTin.maChungKhoanHashMap.get(top5Giam.get(0));
            tapCau.add("Đứng ở vị trí cuối cùng là cổ phiếu " + ma.getTenMa() + " của " + ma.getTenCongTi()
                    + " với mức giảm " + ma.getGia().getTiLeThayDoi() + "%.");
        }
    }

    // Câu giảm top 1 loại 2
    public void cau9() {
        if (top5Giam.size() > 0) {
            MaChungKhoan ma = ThongTin.maChungKhoanHashMap.get(top5Giam.get(0));
            tapCau.add("Đứng cuối bảng xếp hạng là " + ma.getTenMa() + " của " + ma.getTenCongTi()
                    + " với mức giảm " + ma.getGia().getTiLeThayDoi() + "%.");
        }
    }

    // Câu giảm thứ tự bất kỳ 1-5 loại 1
    public void cau10() {
        if (top5Giam.size() > 0) {
            for (int i = 0; i < MAX; i++) {
                MaChungKhoan ma = ThongTin.maChungKhoanHashMap.get(top5Giam.get(i));
                tapCau.add("Đứng thứ " + (i + 1) + " là cổ phiếu " + ma.getTenMa() + " của " + ma.getTenCongTi()
                        + " với mức giảm " + ma.getGia().getTiLeThayDoi() + " %.");
            }
        }
    }

    // Câu giảm thứ tự bất kỳ 1-5 loại 2
    public void cau11() {
        if (top5Giam.size() > 0) {
            for (int i = 0; i < MAX; i++) {
                MaChungKhoan ma = ThongTin.maChungKhoanHashMap.get(top5Giam.get(i));
                tapCau.add("Trong đó, " + ma.getTenMa() + " của " + ma.getTenCongTi() + " đứng ở vị trí thứ "
                        + (i + 1) + " với mức giảm " + ma.getGia().getTiLeThayDoi() + "%.");
            }
        }
    }

    // Câu giảm thứ tự bất kỳ 1-5 loại 3
    public void cau12() {
        if (top5Giam.size() > 0) {
            for (int i = 0; i < MAX; i++) {
                MaChungKhoan ma = ThongTin.maChungKhoanHashMap.get(top5Giam.get(i));
                tapCau.add("Vị trí thứ " + (i + 1) + " là cổ phiếu " + ma.getTenMa() + " của "
                        + ma.getTenCongTi() + " với mức giảm " + ma.getGia().getTiLeThayDoi() + "%.");
            }
        }
    }

    // Câu giảm thứ tự bất kỳ 1-5 loại 4
    public void cau13() {
        if (top5Giam.size() > 0) {
            for (int i = 0; i < MAX; i++) {
                MaChungKhoan ma = ThongTin.maChungKhoanHashMap.get(top5Giam.get(i));
                tapCau.add("Vị trí thứ " + (i + 1) + " thuộc về cổ phiếu " + ma.getTenMa() + " của "
                        + ma.getTenCongTi() + " với mức giảm " + ma.getGia().getTiLeThayDoi() + "%.");
            }
        }
    }

    // Câu giảm thứ tự bất kỳ 1-5 loại 5
    public void cau14() {
        if (top5Giam.size() > 0) {
            for (int i = 0; i < MAX; i++) {
                MaChungKhoan ma = ThongTin.maChungKhoanHashMap.get(top5Giam.get(i));
                tapCau.add("Đứng thứ " + (i + 1) + " là " + ma.getTenMa() + " của " + ma.getTenCongTi()
                        + " với mức giảm " + ma.getGia().getTiLeThayDoi() + "%.");
            }
        }
    }

    public ArrayList<String> getTop5Tang(){
        return this.top5Tang;
    }

    public ArrayList<String> getTop5Giam(){
        return this.top5Giam;
    }
}