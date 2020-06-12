package xulithongtin;

import maucau.Mau5;
import maucau.MauCau;
import thongtin.NhomVN30;

public class ThongTinMau5 extends ThongTinMau {
    @Override
    public MauCau khoiTaoMau() {
        return new Mau5( new NhomVN30());
    }
}
