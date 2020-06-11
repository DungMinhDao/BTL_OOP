package maucau;
import java.util.*;

import thongtin.NhomNganh;

public class Mau8 extends MauCau{
    private static String tag = "Tổng quan về các nhóm ngành";
    private ArrayList<NhomNganh> nhomNganhGiam, nhomNganhTang;
    
    public Mau8(ArrayList<NhomNganh> nhomNganhGiam, ArrayList<NhomNganh> nhomNganhTang){
        this.nhomNganhGiam = nhomNganhGiam;
        this.nhomNganhTang = nhomNganhTang;

        Collections.sort(this.nhomNganhTang, new Comparator<NhomNganh>() {
            @Override
            public int compare(NhomNganh n1, NhomNganh n2){
                if(n1.getTongThayDoi() < n2.getTongThayDoi()) return 1;
                else if(n1.getTongThayDoi() > n2.getTongThayDoi()) return -1;
                else return 0;
            }
        });

        Collections.sort(this.nhomNganhGiam, new Comparator<NhomNganh>() {
            @Override
            public int compare(NhomNganh n1, NhomNganh n2){
                if(n1.getTongThayDoi() < n2.getTongThayDoi()) return -1;
                else if(n1.getTongThayDoi() > n2.getTongThayDoi()) return 1;
                else return 0;
            }
        });
    }

    public void thuThapCau(){
        cau1();
        cau2();
        cau3();
        cau4();
    }

    public void cau1(){
        String s = new String();
        if(nhomNganhGiam.size() >= nhomNganhTang.size()*3){
            s = "Hầu hết các nhóm ngành trên thị trường đều giảm điểm.";
        }
        else if(nhomNganhTang.size() >= nhomNganhGiam.size()*3){
            s = "Hầu hết các nhóm ngành trên thị trường đều tăng điểm.";
        }

        tapCau.add(s);
    }

    public void cau2(){
        String s = "Nhóm ngành giảm mạnh nhất là nhóm ngành ";
        s = s + nhomNganhGiam.get(0).getTenNhomNganh() + " với mức giảm " + (-nhomNganhGiam.get(0).getTongThayDoi()) + " điểm.";
        
        tapCau.add(s);
    }

    public void cau3(){
        String s = "Nhóm ngành tăng mạnh nhất là nhóm ngành ";
        s = s + nhomNganhTang.get(0).getTenNhomNganh() + " với mức tăng " + nhomNganhTang.get(0).getTongThayDoi() + " điểm.";
        
        tapCau.add(s);
    }

    public void cau4(){
        int i;
        String s = "Các cổ phiếu có tính thị trường hơn như " + nhomNganhTang.get(1).getTenNhomNganh();
        int length = Math.min(nhomNganhTang.size(), 6);
        for(i = 2; i < length; i++){
            s = s + ", " + nhomNganhTang.get(i).getTenNhomNganh();
        }
        s = s + ",... cũng thu hút dòng tiền khá mạnh.";
        tapCau.add(s);
    }

    public String getTag(){
        return Mau8.tag;
    }
}
