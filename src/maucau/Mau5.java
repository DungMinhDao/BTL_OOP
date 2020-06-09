package maucau;

import thongtin.MaChungKhoan;

import java.util.ArrayList;

public class Mau5 extends MauCau {
    private static String tag = "Nhóm VN30";
    private ArrayList<MaChungKhoan> VN30Tang, VN30Giam;

    public Mau5(ArrayList<MaChungKhoan> VN30Tang, ArrayList<MaChungKhoan> Vn30Giam){
        this.VN30Tang = VN30Tang;
        this.VN30Giam = Vn30Giam;
    }

    @Override
    public void thuThapCau() {
        cau1();
    }

    public void cau1(){
        if(VN30Tang.size() <= 5){
            String s = "Trong nhóm VN30 có " + VN30Tang.size() + " ma tang gia la ";
            for(int i = 0; i < VN30Tang.size(); ++i){
                s += VN30Tang.get(i).getTenMa() + "(tăng " + (VN30Tang.get(i).getGia().getThayDoiDiem() * 1000) + " đồng), ";
            }
            s += "còn lại đa số đều mất điểm.";
            tapCau.add(s);
        }
        else if(VN30Giam.size() <= 5){
            String s = "Trong nhóm VN30 có " + VN30Giam.size() + " ma giam gia la ";
            for(int i = 0; i < VN30Giam.size(); ++i){
                s += VN30Giam.get(i).getTenMa() + "(giảm " + (- VN30Giam.get(i).getGia().getThayDoiDiem() * 1000) + " đồng), ";
            }
            s += "còn lại đa số đều tăng điểm.";
            tapCau.add(s);
        }
    }

    public String getTag() {
        return tag;
    }

    public ArrayList<MaChungKhoan> getVN30Tang() {
        return VN30Tang;
    }

    public ArrayList<MaChungKhoan> getVN30Giam() {
        return VN30Giam;
    }
}
