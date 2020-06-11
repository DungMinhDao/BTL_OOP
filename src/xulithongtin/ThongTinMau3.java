package xulithongtin;

import java.util.ArrayList;

import maucau.Mau3;
import maucau.MauCau;

import thongtin.MaChungKhoan;
import thongtin.ThongTin;

public class ThongTinMau3 extends ThongTinMau{
    @Override
    public MauCau khoiTaoMau(){
        ArrayList<MaChungKhoan> nhomNganHangTang = new ArrayList<MaChungKhoan>();
        ArrayList<MaChungKhoan> nhomNganHangGiam = new ArrayList<MaChungKhoan>();

        MaChungKhoan ma;
        int i, length = ThongTin.nhomNganhHashMap.get("Nhóm Ngân Hàng").getTenMa().size();
        for (i = 0; i < length; i++) {
            ma = ThongTin.maChungKhoanHashMap.get(ThongTin.nhomNganhHashMap.get("Nhóm Ngân Hàng").getTenMa().get(i));
            TinhChatMa tinhChatMa = new TinhChatMa(ma);
            if (tinhChatMa.tangGia()) {
                nhomNganHangTang.add(ma);
            }
            else if(tinhChatMa.giamGia()){
                nhomNganHangGiam.add(ma);
            }
        }
        return new Mau3(nhomNganHangTang,nhomNganHangGiam);
    }
}
