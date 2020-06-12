package main;

import laydulieu.LayDuLieuVeCongTi;
import laydulieu.LayDuLieuVeMa;
import thongtin.ThongTin;
import xulithongtin.*;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        LayDuLieuVeMa.layMa(new File("D:\\Java\\Practise\\BTL\\src\\laydulieu\\test3.csv"));
        LayDuLieuVeCongTi.layThongTinCongTi(new File("D:\\Java\\Practise\\BTL\\src\\laydulieu\\TenCongTi.csv"));
        ThongTinMau1 thongTinMau1 = new ThongTinMau1();
        thongTinMau1.inCau();
        ThongTinMau7 thongTinMau7 = new ThongTinMau7();
        thongTinMau7.inCau();
        ThongTinMau6 thongTinMau6 = new ThongTinMau6();
        thongTinMau6.inCau();
        ThongTinMau2 thongTinMau2 = new ThongTinMau2();
        thongTinMau2.inCau();
        ThongTinMau8 thongTinMau8 = new ThongTinMau8();
        thongTinMau8.inCau();
        ThongTinMau9 thongTinMau9 = new ThongTinMau9();
        thongTinMau9.inCau();
        ThongTinMau10 thongTinMau10 = new ThongTinMau10();
        thongTinMau10.inCau();
        ThongTinMau3 thongTinMau3 = new ThongTinMau3();
        thongTinMau3.inCau();
        ThongTinMau4 thongTinMau4 = new ThongTinMau4();
        thongTinMau4.inCau();
        ThongTinMau5 thongTinMau5 = new ThongTinMau5();
        thongTinMau5.inCau();
    }
}