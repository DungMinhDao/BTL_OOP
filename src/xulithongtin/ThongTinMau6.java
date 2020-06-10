package xulithongtin;

import maucau.Mau6;
import maucau.Mau7;
import maucau.MauCau;
import thongtin.MaChungKhoan;
import thongtin.ThongTin;

import java.util.ArrayList;

public class ThongTinMau6 extends ThongTinMau{
    @Override
    public MauCau khoiTaoMau() {
        ArrayList<MaChungKhoan> nhomTangGia = new ArrayList<MaChungKhoan>();
        for (MaChungKhoan ma: ThongTin.maChungKhoanHashMap.values()) {
            TinhChatMa tinhChatMa = new TinhChatMa(ma);
            if (tinhChatMa.tangGia()) {
                nhomTangGia.add(ma);
            }

        }
        return new Mau6(nhomTangGia);
    }
}
