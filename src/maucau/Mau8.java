package maucau;

import java.util.ArrayList;

public class Mau8 extends MauCau{

    private static String tag = "Top 5 tăng giảm";
    ArrayList<String> top5Tang = new ArrayList<>();
    ArrayList<String> top5Giam = new ArrayList<>();
    private static final int MAX = 5;

    public Mau8(ArrayList<String> top5Tang, ArrayList<String> top5Giam){
        this.top5Tang = top5Tang;
        this.top5Giam = top5Giam;
    }

    // Câu tăng top 1 loại 1
    public void cauTangTop1_Loai1(){
        MaChungKhoan ma = maChungKhoanHashMap.get(top5Tang[0]);
        tapCau.add("Đứng ở vị trí đầu tiên là cổ phiếu " + ma.getTenMa() + " của " + ma.getTenCongTy() + " với mức tăng " + ma.getThayDoiTyLe() + "%.");
    }

    // Câu tăng top 1 loại 2
    public void cauTangTop1_Loai2(){
        MaChungKhoan ma = maChungKhoanHashMap.get(top5Tang[0]);
        tapCau.add("Đứng đầu bảng xếp hạng là " + ma.getTenMa() + " của " + ma.getTenCongTy() + " với mức tăng trưởng " ma.getThayDoiTyLe() + "%.");
    }

    // Câu tăng thứ tự bất kỳ 1-5 loại 1
    public void cauTang_Loai1(){
        for (int i = 0; i < MAX; i++) {
            MaChungKhoan ma = maChungKhoanHashMap.get(top5Tang[i]);
            tapCau.add("Đứng thứ " + (i + 1) + " là cổ phiếu " + ma.getTenMa() + "của " + ma.getTenCongTy() + "với mức tăng hơn " + ma.getThayDoiTyLe() + " %.");
        }
    }

    // Câu tăng thứ tự bất kỳ 1-5 loại 2
    public void cauTang_Loai2(){
        for (int i = 0; i < MAX; i++) {
            MaChungKhoan ma = maChungKhoanHashMap.get(top5Tang[i]);
            tapCau.add("Trong đó, " + ma.getTenMa()+ " của" + ma.getTenCongTy() + " đứng ở vị trí thứ " + (i + 1) + " với mức tăng " ma.getThayDoiTyLe() + "%.");
        }
    }

    // Câu tăng thứ tự bất kỳ 1-5 loại 3
    public void cauTang_Loai3(){
        for (int i = 0; i < MAX; i++) {
            MaChungKhoan ma = maChungKhoanHashMap.get(top5Tang[i]);
            tapCau.add("Vị trí thứ " + (i + 1) + " là cổ phiếu " + ma.getTenMa() + " của " + ma.getTenCongTy() + "với mức tăng trưởng đạt gần " + ma.getThayDoiTyLe() + "%.");
        }
    }

    // Câu tăng thứ tự bất kỳ 1-5 loại 4
    public void cauTang_Loai4(){
        for (int i = 0; i < MAX; i++) {
            MaChungKhoan ma = maChungKhoanHashMap.get(top5Tang[i]);
            tapCau.add("Vị trí thứ " + (i + 1) + " thuộc về cổ phiếu " + ma.getTenMa() + " của " + ma.getTenCongTy() + " với mức tăng trưởng " ma.getThayDoiTyLe() + "%.");
        }
    }

    // Câu tăng thứ tự bất kỳ 1-5 loại 5
    public void cauTang_Loai5(){
        for (int i = 0; i < MAX; i++) {
            MaChungKhoan ma = maChungKhoanHashMap.get(top5Tang[i]);
            tapCau.add("Đứng thứ " + (i + 1) + " là " + ma.getTenMa() + " của " + ma.getTenCongTy() + " với mức tăng trưởng " + ma.getThayDoiTyLe() + "%.");
        }
    }

    // Câu giảm top 1 loại 1
    public void cauGiamTop1_Loai1(){
        MaChungKhoan ma = maChungKhoanHashMap.get(top5Giam[0]);
        tapCau.add("Đứng ở vị trí cuối cùng là cổ phiếu " + ma.getTenMa() + " của " + ma.getTenCongTy() + " với mức giảm " + ma.getThayDoiTyLe() + "%.");

    }

    // Câu giảm top 1 loại 2
    public void cauGiamTop1_Loai2(){
        MaChungKhoan ma = maChungKhoanHashMap.get(top5Giam[0]);
        tapCau.add("Đứng cuối bảng xếp hạng là " + ma.getTenMa() + " của " + ma.getTenCongTy() + " với mức tăng trưởng " ma.getThayDoiTyLe() + "%.");
    }

    // Câu giảm thứ tự bất kỳ 1-5 loại 1
    public void cauGiam_Loai1(){
        for ( int i = 0; i < MAX ; i++) {
            MaChungKhoan ma = maChungKhoanHashMap.get(top5Giam[i]);
            tapCau.add("Đứng thứ " + (i + 1) + " là cổ phiếu " + ma.getTenMa() + "của " + ma.getTenCongTy() + "với mức tăng hơn " ma.getThayDoiTyLe() + " %.");
        }
    }

    // Câu giảm thứ tự bất kỳ 1-5 loại 2
    public void cauGiam_Loai2(){
        for (int i = 0; i < MAX; i++) {
            MaChungKhoan ma = maChungKhoanHashMap.get(top5Giam[i]);
            tapCau.add("Trong đó, " + ma.getTenMa() + " của" + ma.getTenCongTy() + " đứng ở vị trí thứ " + (i + 1) + " với mức tăng " + ma.getThayDoiTyLe() + "%.");
        }
    }

    // Câu giảm thứ tự bất kỳ 1-5 loại 3
    public void cauGiam_Loai3(){
        for (int i = 0; i < MAX; i++) {
            MaChungKhoan ma = maChungKhoanHashMap.get(top5Giam[i]);
            tapCau.add("Vị trí thứ " + (i + 1) + " là cổ phiếu " + ma.getTenMa() + " của " + ma.getTenCongTy() + "với mức tăng trưởng đạt gần " + ma.getThayDoiTyLe() + "%.");
        }
    }

    // Câu giảm thứ tự bất kỳ 1-5 loại 4
    public void cauGiam_Loai4(){
        for (int i = 0; i < MAX; i++) {
            MaChungKhoan ma = maChungKhoanHashMap.get(top5Giam[i]);
            tapCau.add("Vị trí thứ " + (i + 1) + " thuộc về cổ phiếu " + ma.getTenMa() + " của " + ma.getTenCongTy() + " với mức tăng trưởng " + ma.getThayDoiTyLe() + "%.");
        }
    }

    // Câu giảm thứ tự bất kỳ 1-5 loại 5
    public void cauTang_Loai5(){
        for (int i = 0; i < MAX; i++) {
            MaChungKhoan ma = maChungKhoanHashMap.get(top5Giam[i]);
            tapCau.add("Đứng thứ " + (i + 1) + " là " + ma.getTenMa() + " của " + ma.getTenCongTy() + " với mức tăng trưởng " + ma.getThayDoiTyLe() + "%.");
        }
    }

    public ArrayList<String> getTop5Tang(){
        return this.top5Tang;
    }

    public ArrayList<String> getTop5Giam(){
        return this.top5Giam;
    }
}
