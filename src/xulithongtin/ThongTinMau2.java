package xulithongtin;

import maucau.Mau2;
import maucau.MauCau;
import thongtin.MaChungKhoan;
import thongtin.ThongTin;

import java.util.ArrayList;

public class ThongTinMau2 extends ThongTinMau {

    @Override
    public MauCau khoiTaoMau() {
        ArrayList<MaChungKhoan> maChungKhoanTang, maChungKhoanGiam, maChungKhoanThamChieu;
        maChungKhoanTang = new ArrayList<MaChungKhoan>();
        maChungKhoanGiam = new ArrayList<MaChungKhoan>();
        maChungKhoanThamChieu = new ArrayList<MaChungKhoan>();
        for(MaChungKhoan ma: ThongTin.maChungKhoanHashMap.values()){
            TinhChatMa tinhChatMa = new TinhChatMa(ma);
            if(tinhChatMa.tangGia()){
                maChungKhoanTang.add(ma);
            }
            if(tinhChatMa.giamGia()){
                maChungKhoanGiam.add(ma);
            }
            if(tinhChatMa.dungGiaThamChieu()){
                maChungKhoanThamChieu.add(ma);
            }
        }
        return new Mau2(maChungKhoanTang, maChungKhoanGiam, maChungKhoanThamChieu);
    }
}
