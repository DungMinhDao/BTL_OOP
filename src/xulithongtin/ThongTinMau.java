package xulithongtin;

import maucau.Mau1;
import maucau.MauCau;

public abstract class ThongTinMau {
    public MauCau khoiTaoMau(){
        return null;
    };
    public void inCau(){
        System.out.println(khoiTaoMau().layCau());
    }
}
