package xulithongtin;
import thongtin.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

        Collections.sort(nhomNganhTang, new Comparator<NhomNganh>() {
            @Override
            public int compare(NhomNganh n1, NhomNganh n2){
                if(n1.getTongThayDoi() < n2.getTongThayDoi()){
                    return 1;
                }
                else if(n1.getTongThayDoi() > n2.getTongThayDoi()){
                    return -1;
                }
                else{
                    return 0;
                }
            }
        });

        Collections.sort(nhomNganhGiam, new Comparator<NhomNganh>(){
            @Override
            public int compare(NhomNganh n1, NhomNganh n2){
                if(n1.getTongThayDoi() < n2.getTongThayDoi()){
                    return 1;
                }
                else if(n1.getTongThayDoi() > n2.getTongThayDoi()){
                    return -1;
                }
                else{
                    return 0;
                }
            }
        });
        return new Mau8(nhomNganhGiam, nhomNganhTang);
    }
}