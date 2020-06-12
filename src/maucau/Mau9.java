package maucau;

import java.util.ArrayList;
import thongtin.MaChungKhoan;
import thongtin.ThongTin;

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
        cauTangTop1Loai1();
        cauTangTop1Loai2();
        cauTangLoai1();
        cauTangLoai2();
        cauTangLoai3();
        cauTangLoai4();
        cauTangLoai5();
        cauGiamTop1Loai1();
        cauGiamTop1Loai2();
        cauGiamLoai1();
        cauGiamLoai2();
        cauGiamLoai3();
        cauGiamLoai4();
        cauGiamLoai5();
    }
    // Câu tăng top 1 loại 1
    public void cauTangTop1Loai1(){
        MaChungKhoan ma = ThongTin.maChungKhoanHashMap.get(top5Tang.get(0));
        tapCau.add("Đứng ở vị trí đầu tiên là cổ phiếu " + ma.getTenMa() + " của " + ma.getTenCongTi() + " với mức tăng " + ma.getGia().getTiLeThayDoi() + "%.");
    }

    // Câu tăng top 1 loại 2
    public void cauTangTop1Loai2(){
        MaChungKhoan ma = ThongTin.maChungKhoanHashMap.get(top5Tang.get(0));
        tapCau.add("Đứng đầu bảng xếp hạng là " + ma.getTenMa() + " của " + ma.getTenCongTi() + " với mức tăng trưởng " + ma.getGia().getTiLeThayDoi() + "%.");
    }

    // Câu tăng thứ tự bất kỳ 1-5 loại 1
    public void cauTangLoai1(){
        for (int i = 0; i < MAX; i++) {
            MaChungKhoan ma = ThongTin.maChungKhoanHashMap.get(top5Tang.get(i));
            tapCau.add("Đứng thứ " + (i + 1) + " là cổ phiếu " + ma.getTenMa() + " của " + ma.getTenCongTi() + " với mức tăng " + ma.getGia().getTiLeThayDoi() + " %.");
        }
    }

    // Câu tăng thứ tự bất kỳ 1-5 loại 2
    public void cauTangLoai2(){
        for (int i = 0; i < MAX; i++) {
            MaChungKhoan ma = ThongTin.maChungKhoanHashMap.get(top5Tang.get(i));
            tapCau.add("Trong đó, " + ma.getTenMa()+ " của " + ma.getTenCongTi() + " đứng ở vị trí thứ " + (i + 1) + " với mức tăng " + ma.getGia().getTiLeThayDoi() + "%.");
        }
    }

    // Câu tăng thứ tự bất kỳ 1-5 loại 3
    public void cauTangLoai3(){
        for (int i = 0; i < MAX; i++) {
            MaChungKhoan ma = ThongTin.maChungKhoanHashMap.get(top5Tang.get(i));
            tapCau.add("Vị trí thứ " + (i + 1) + " là cổ phiếu " + ma.getTenMa() + " của " + ma.getTenCongTi() + " với mức tăng trưởng " + ma.getGia().getTiLeThayDoi() + "%.");
        }
    }

    // Câu tăng thứ tự bất kỳ 1-5 loại 4
    public void cauTangLoai4(){
        for (int i = 0; i < MAX; i++) {
            MaChungKhoan ma = ThongTin.maChungKhoanHashMap.get(top5Tang.get(i));
            tapCau.add("Vị trí thứ " + (i + 1) + " thuộc về cổ phiếu " + ma.getTenMa() + " của " + ma.getTenCongTi() + " với mức tăng trưởng " + ma.getGia().getTiLeThayDoi() + "%.");
        }
    }

    // Câu tăng thứ tự bất kỳ 1-5 loại 5
    public void cauTangLoai5(){
        for (int i = 0; i < MAX; i++) {
            MaChungKhoan ma = ThongTin.maChungKhoanHashMap.get(top5Tang.get(i));
            tapCau.add("Đứng thứ " + (i + 1) + " là " + ma.getTenMa() + " của " + ma.getTenCongTi() + " với mức tăng trưởng " + ma.getGia().getTiLeThayDoi() + "%.");
        }
    }

    // Câu giảm top 1 loại 1
    public void cauGiamTop1Loai1(){
        MaChungKhoan ma = ThongTin.maChungKhoanHashMap.get(top5Giam.get(0));
        tapCau.add("Đứng ở vị trí cuối cùng là cổ phiếu " + ma.getTenMa() + " của " + ma.getTenCongTi() + " với mức giảm " + ma.getGia().getTiLeThayDoi() + "%.");

    }

    // Câu giảm top 1 loại 2
    public void cauGiamTop1Loai2(){
        MaChungKhoan ma = ThongTin.maChungKhoanHashMap.get(top5Giam.get(0));
        tapCau.add("Đứng cuối bảng xếp hạng là " + ma.getTenMa() + " của " + ma.getTenCongTi() + " với mức giảm " + ma.getGia().getTiLeThayDoi() + "%.");
    }

    // Câu giảm thứ tự bất kỳ 1-5 loại 1
    public void cauGiamLoai1(){
        for ( int i = 0; i < MAX ; i++) {
            MaChungKhoan ma = ThongTin.maChungKhoanHashMap.get(top5Giam.get(i));
            tapCau.add("Đứng thứ " + (i + 1) + " là cổ phiếu " + ma.getTenMa() + " của " + ma.getTenCongTi() + " với mức giảm " + ma.getGia().getTiLeThayDoi() + " %.");
        }
    }

    // Câu giảm thứ tự bất kỳ 1-5 loại 2
    public void cauGiamLoai2(){
        for (int i = 0; i < MAX; i++) {
            MaChungKhoan ma = ThongTin.maChungKhoanHashMap.get(top5Giam.get(i));
            tapCau.add("Trong đó, " + ma.getTenMa() + " của " + ma.getTenCongTi() + " đứng ở vị trí thứ " + (i + 1) + " với mức giảm " + ma.getGia().getTiLeThayDoi() + "%.");
        }
    }

    // Câu giảm thứ tự bất kỳ 1-5 loại 3
    public void cauGiamLoai3(){
        for (int i = 0; i < MAX; i++) {
            MaChungKhoan ma = ThongTin.maChungKhoanHashMap.get(top5Giam.get(i));
            tapCau.add("Vị trí thứ " + (i + 1) + " là cổ phiếu " + ma.getTenMa() + " của " + ma.getTenCongTi() + " với mức giảm " + ma.getGia().getTiLeThayDoi() + "%.");
        }
    }

    // Câu giảm thứ tự bất kỳ 1-5 loại 4
    public void cauGiamLoai4(){
        for (int i = 0; i < MAX; i++) {
            MaChungKhoan ma = ThongTin.maChungKhoanHashMap.get(top5Giam.get(i));
            tapCau.add("Vị trí thứ " + (i + 1) + " thuộc về cổ phiếu " + ma.getTenMa() + " của " + ma.getTenCongTi() + " với mức giảm " + ma.getGia().getTiLeThayDoi() + "%.");
        }
    }

    // Câu giảm thứ tự bất kỳ 1-5 loại 5
    public void cauGiamLoai5(){
        for (int i = 0; i < MAX; i++) {
            MaChungKhoan ma = ThongTin.maChungKhoanHashMap.get(top5Giam.get(i));
            tapCau.add("Đứng thứ " + (i + 1) + " là " + ma.getTenMa() + " của " + ma.getTenCongTi() + " với mức giảm " + ma.getGia().getTiLeThayDoi() + "%.");
        }
    }

    public ArrayList<String> getTop5Tang(){
        return this.top5Tang;
    }

    public ArrayList<String> getTop5Giam(){
        return this.top5Giam;
    }
}