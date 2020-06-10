package xulithongtin;

import maucau.Mau7;
import maucau.MauCau;
import thongtin.MaChungKhoan;
import thongtin.ThongTin;

import java.util.ArrayList;

public class ThongTinMau7 extends ThongTinMau{
    @Override
    public MauCau khoiTaoMau() {
        ArrayList<MaChungKhoan> nhomGiamGia = new ArrayList<MaChungKhoan>();
        for (MaChungKhoan ma: ThongTin.maChungKhoanHashMap.values()) {
            TinhChatMa tinhChatMa = new TinhChatMa(ma);
            if (tinhChatMa.giamGia()) {
                nhomGiamGia.add(ma);
            }

        }
        return new Mau7(nhomGiamGia);
    }
}
