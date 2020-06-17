package xulithongtin;

import maucau.Mau3;
import maucau.MauCau;
import thongtin.MaChungKhoan;
import thongtin.ThongTin;
import thongtin.TinhChatMa;

import java.util.ArrayList;

public class ThongTinMau3 extends ThongTinMau{

    @Override
    public MauCau khoiTaoMau() {
        ArrayList<MaChungKhoan> nhomNganHangTang = new ArrayList<MaChungKhoan>();
        ArrayList<MaChungKhoan> nhomNganHangGiam = new ArrayList<MaChungKhoan>();
        ArrayList<String> tenMa = ThongTin.nhomNganhHashMap.get("Ngân hàng").getTenMa();
        for(int i = 0; i < tenMa.size(); ++i){
            MaChungKhoan ma = ThongTin.maChungKhoanHashMap.get(tenMa.get(i));
            TinhChatMa tinhChatMa = new TinhChatMa(ma);
            if(tinhChatMa.giamGia()){
                nhomNganHangGiam.add(ma);
            }
            else if(tinhChatMa.tangGia()){
                nhomNganHangTang.add(ma);
            }
        }
        return new Mau3(nhomNganHangTang, nhomNganHangGiam);
    }
}
