package maucau;

import thongtin.MaChungKhoan;
import thongtin.NhomVN30;
import thongtin.ThongTin;

import java.util.ArrayList;

public class Mau5 extends MauCau {
    private static String tag = "Nhóm VN30";
    private NhomVN30 VN30;

    public Mau5(NhomVN30 VN30) {
        this.VN30 = VN30;
    }

    @Override
    public void thuThapCau() {
        cau1();
        cau2();
        cau3();
        cau4();
    }

    public void cau1(){
        if(VN30.getSoMaTang() <= 5){
            String s = "Trong nhóm VN30 có " + VN30.getSoMaTang() + " ma tang gia la ";
            for(int i = 0; i < VN30.getSoMaTang(); ++i) {
                MaChungKhoan ma = ThongTin.maChungKhoanHashMap.get(NhomVN30.tenMA.get(i));
                if (ma.getGia().getThayDoiDiem() > 0) {
                    s += ma.getTenMa() + "(tăng " + (ma.getGia().getThayDoiDiem() * 1000) + " đồng), ";
                }
            }
            s += "còn lại đa số đều mất điểm.";
            tapCau.add(s);
        }
        else if(VN30.getSoMaGiam() <= 5){
            String s = "Trong nhóm VN30 có " + VN30.getSoMaGiam() + " ma giam gia la ";
            for(int i = 0; i < VN30.getSoMaGiam(); ++i) {
                MaChungKhoan ma = ThongTin.maChungKhoanHashMap.get(NhomVN30.tenMA.get(i));
                if (ma.getGia().getThayDoiDiem() < 0) {
                    s += ma.getTenMa() + "(giảm " + (- ma.getGia().getThayDoiDiem() * 1000) + " đồng), ";
                }
            }
            s += "còn lại đa số đều tăng điểm.";
            tapCau.add(s);
        }
    }

    public void cau2(){
        String s = "";
        if(VN30.getSoMaThamChieu() > VN30.getSoMaGiam() && VN30.getSoMaThamChieu() > VN30.getSoMaTang()){
            s = "Rổ VN30 đóng cửa chỉ có " + VN30.getSoMaTang() + " mã tăng và " + VN30.getSoMaGiam()
                    + " mã giảm, còn lại là tham chiếu.";
            tapCau.add(s);
        }
        else if(VN30.getSoMaTang() > VN30.getSoMaGiam() && VN30.getSoMaTang() > VN30.getSoMaThamChieu()){
            s = "Rổ VN30 đóng cửa chỉ có " + VN30.getSoMaGiam() + " mã giảm và " + VN30.getSoMaThamChieu()
                    + " mã tham chiếu, còn lại là tăng.";
            tapCau.add(s);
        }
        else if(VN30.getSoMaGiam() > VN30.getSoMaThamChieu() &&VN30.getSoMaGiam() >  VN30.getSoMaTang()){
            s = "Rổ VN30 đóng cửa chỉ có " + VN30.getSoMaTang() + " mã giảm và " + VN30.getSoMaThamChieu()
                    + " mã tham chiếu, còn lại là giảm";
            tapCau.add(s);
        }
    }

    public void cau3(){
        String s = "";
        if(VN30.getSoMaTang() > 15){
            s = "Các cổ phiếu trong nhóm VN30 ghi nhận sự tăng giá trên diện rộng với " + VN30.getSoMaTang()
                    + " mã tăng giá.";
            tapCau.add(s);
        }
        else if(VN30.getSoMaGiam() > 15){
            s = "Các cổ phiếu trong nhóm VN30 ghi nhận sự giảm giá trên diện rộng với " + VN30.getSoMaGiam()
                    + " mã giảm giá.";
            tapCau.add(s);
        }
    }

    public void cau4(){
        String s = "";
        if(VN30.getSoMaGiam() > VN30.getSoMaTang()){
            s = "Số mã giảm giá trong VN30 có phần vượt trội hơn số mã xanh.";
            tapCau.add(s);
        }
        else if(VN30.getSoMaTang() > VN30.getSoMaGiam()){
            s = "Số mã xanh trong VN30 có phần vượt trội hơn số mã giảm giá.";
            tapCau.add(s);
        }

    }

    public String getTag() {
        return tag;
    }

    public NhomVN30 getVN30() {
        return VN30;
    }
}
