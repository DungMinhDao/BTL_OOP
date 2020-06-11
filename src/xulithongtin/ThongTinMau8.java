package xulithongtin;
import thongtin.*;
import java.util.ArrayList;
import maucau.Mau8;
import maucau.MauCau;

public class ThongTinMau8 extends ThongTinMau{
    @Override
    public MauCau khoiTaoMau(){
        ArrayList<NhomNganh> nhomNganhGiam = new ArrayList<NhomNganh>();
        ArrayList<NhomNganh> nhomNganhTang = new ArrayList<NhomNganh>();
        for (final NhomNganh nhom : ThongTin.nhomNganhHashMap.values()) {
            if(nhom.getTongThayDoi() > 0){
                nhomNganhTang.add(nhom);
            }
            else{
                nhomNganhGiam.add(nhom);
            }
        }
        return new Mau8(nhomNganhGiam, nhomNganhTang);
    }    
}
