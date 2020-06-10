package main;

import laydulieu.LayDuLieuVeCongTi;
import laydulieu.LayDuLieuVeMa;
import thongtin.ThongTin;
import xulithongtin.ThongTinMau;
import xulithongtin.ThongTinMau1;
import xulithongtin.ThongTinMau6;
import xulithongtin.ThongTinMau7;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        LayDuLieuVeMa.layMa(new File("D:\\Java\\Practise\\BTL\\src\\laydulieu\\test3.csv"));
        LayDuLieuVeCongTi.layThongTinCongTi(new File("D:\\Java\\Practise\\BTL\\src\\laydulieu\\TestCongTi.csv"));
        ThongTinMau1 thongTinMau1 = new ThongTinMau1();
        thongTinMau1.inCau();
        ThongTinMau7 thongTinMau7 = new ThongTinMau7();
        thongTinMau7.inCau();
        ThongTinMau6 thongTinMau6 = new ThongTinMau6();
        thongTinMau6.inCau();
    }
}