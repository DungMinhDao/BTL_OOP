package xulithongtin;

import maucau.Mau8;
import maucau.MauCau;
import thongtin.NhomNganh;
import thongtin.ThongTin;

import java.util.ArrayList;

public class ThongTinMau8 extends ThongTinMau {

    @Override
    public MauCau khoiTaoMau() {
        ArrayList<NhomNganh> nhomNganhTang, nhomNganhGiam;
        nhomNganhTang = new ArrayList<NhomNganh>();
        nhomNganhGiam = new ArrayList<NhomNganh>();
        for(NhomNganh nhomNganh: ThongTin.nhomNganhHashMap.values()){
            if(nhomNganh.getTongThayDoi() > 0){
                nhomNganhTang.add(nhomNganh);
            }
            else if(nhomNganh.getTongThayDoi() < 0){
                nhomNganhGiam.add(nhomNganh);
            }
        }
        return new Mau8(nhomNganhGiam, nhomNganhTang);
    }
}
