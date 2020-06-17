package xulithongtin;

import maucau.MauCau;
import java.time.LocalDate;

public abstract class ThongTinVNIndex {

    private LocalDate ngayBatDau;

    public ThongTinVNIndex(LocalDate ngayBatDau){
        this.ngayBatDau = ngayBatDau;
    }

    public abstract MauCau khoiTaoMau(LocalDate ngayBatDau);

    public void inCau(){
        System.out.println(khoiTaoMau(ngayBatDau).layCau());
    }
}
