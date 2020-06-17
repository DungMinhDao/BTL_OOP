package xulithongtin;

import maucau.Mau2;
import maucau.MauCau;
import thongtin.MaChungKhoan;
import thongtin.ThongTin;
import thongtin.TinhChatMa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
        Collections.sort(maChungKhoanTang, new Comparator<MaChungKhoan>() {
            @Override
            public int compare(MaChungKhoan n1, MaChungKhoan n2){
                if(n1.getGia().getThayDoi() < n2.getGia().getThayDoi()) {
                    return 1;
                }
                else if(n1.getGia().getThayDoi() > n2.getGia().getThayDoi()) {
                    return -1;
                }
                else {
                    return 0;
                }
            }
        });

        Collections.sort(maChungKhoanGiam, new Comparator<MaChungKhoan>() {
            @Override
            public int compare(MaChungKhoan n1, MaChungKhoan n2){
                if(n1.getGia().getThayDoi() < n2.getGia().getThayDoi()) {
                    return 1;
                }
                else if(n1.getGia().getThayDoi() > n2.getGia().getThayDoi()) {
                    return -1;
                }
                else {
                    return 0;
                }
            }
        });
        return new Mau2(maChungKhoanTang, maChungKhoanGiam, maChungKhoanThamChieu);
    }
}
