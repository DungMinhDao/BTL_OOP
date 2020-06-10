package xulithongtin;

import maucau.Mau1;
import maucau.MauCau;
import thongtin.MaChungKhoan;
import thongtin.ThongTin;

public class ThongTinMau1 extends ThongTinMau {
    @Override
    public MauCau khoiTaoMau() {
        int soMaTang, soMaGiam, soMaDungGia, soMaTangTran, soMaGiamSan;
        soMaTang = soMaGiam = soMaDungGia = soMaTangTran = soMaGiamSan = 0;
        for (MaChungKhoan ma: ThongTin.maChungKhoanHashMap.values()) {
            TinhChatMa tinhChatMa = new TinhChatMa(ma);
            if(tinhChatMa.tangGia()) {
                soMaTang ++;
            }
            if(tinhChatMa.giamGia()) {
                soMaGiam ++;
            }
            if(tinhChatMa.dungGia()) {
                soMaDungGia ++;
            }
            if(tinhChatMa.tangTran()) {
                soMaTangTran ++;
            }
            if(tinhChatMa.giamGia()) {
                soMaGiamSan ++;
            }
        }
        return new Mau1(soMaTang, soMaGiam, soMaDungGia, soMaTangTran, soMaGiamSan);
    }

}
