package xulithongtin;

import java.util.ArrayList;
import maucau.Mau10;
import maucau.MauCau;
import thongtin.MaChungKhoan;
import thongtin.ThongTin;

public class ThongTinMau10 extends ThongTinMau{

    private static String[] danhSachThoaiVon = {"BMI", "FPT", "SMA", "BVH", "PPC", "TRA", "DMC", "BMP"};
    private static float mucDanhGia = 3;

    @Override
    public MauCau khoiTaoMau(){
        ArrayList<String> danhSachTangManh = new ArrayList<>();
        ArrayList<String> danhSachTang = new ArrayList<>();
        ArrayList<String> danhSachGiamSau = new ArrayList<>();
        ArrayList<String> danhSachGiam = new ArrayList<>();
        for (String tenMa: danhSachThoaiVon){
            float tiLeThayDoi = ThongTin.maChungKhoanHashMap.get(tenMa).getGia().getTiLeThayDoi();
            if (tiLeThayDoi >= mucDanhGia){
                danhSachTangManh.add(tenMa);
            }
            else if (tiLeThayDoi > 0){
                danhSachTang.add(tenMa);
            }
            else if (tiLeThayDoi <= -mucDanhGia){
                danhSachGiamSau.add(tenMa);
            }
            else if (tiLeThayDoi < 0){
                danhSachGiam.add(tenMa);
            }
        }
        return new Mau10(danhSachTangManh, danhSachTang, danhSachGiamSau, danhSachGiam);
    }
}
