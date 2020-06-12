package xulithongtin;
import maucau.Mau4;
import maucau.MauCau;
import thongtin.*;
import java.util.ArrayList;

public class ThongTinMau4 extends ThongTinMau{
    @Override
    public MauCau khoiTaoMau(){
        ArrayList<MaChungKhoan> nhomBlueChipsTang = new ArrayList<MaChungKhoan>();
        ArrayList<MaChungKhoan> nhomBlueChipsGiam = new ArrayList<MaChungKhoan>();
        ArrayList<MaChungKhoan> nhomBlueChipsDungGia = new ArrayList<MaChungKhoan>();
        for(int i = 0; i < NhomVN30.tenMA.size(); ++i){
            String tenMa = NhomVN30.tenMA.get(i);
            MaChungKhoan ma = ThongTin.maChungKhoanHashMap.get(tenMa);
            TinhChatMa tinhChatMa = new TinhChatMa(ma);
            if(tinhChatMa.tangGia()){
                nhomBlueChipsTang.add(ma);
            }
            else if(tinhChatMa.giamGia()){
                nhomBlueChipsGiam.add(ma);
            }
            else if(tinhChatMa.dungGiaThamChieu()){
                nhomBlueChipsDungGia.add(ma);
            }
        }
        return new Mau4(nhomBlueChipsGiam, nhomBlueChipsTang, nhomBlueChipsDungGia);
    }
}