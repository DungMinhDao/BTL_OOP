package xulithongtin;

import maucau.Mau1;
import maucau.MauCau;

public abstract class ThongTinMau {
    public abstract MauCau khoiTaoMau();
    public void inCau(){
        System.out.println(khoiTaoMau().layCau());
    }
}
