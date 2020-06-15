package laydulieu;

import thongtin.NhomNganh;
import thongtin.NhomVN30;
import thongtin.ThongTin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.util.HashMap;

public class LayDuLieuVeCongTi {
    private static final String COMMA = ","; // Split by comma
    public static void layThongTinCongTi(File fn){
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader(fn));
            br.readLine();
            while (true) {
                line = br.readLine();
                if (line != null) {
                    String[] splitData = line.split(COMMA);
                    String tenMa = splitData[1];
                    String tenCongTi = splitData[2];
                    String tenNhomNganh = splitData[3];
                    String vn30 = splitData[4];
                    if(ThongTin.maChungKhoanHashMap.containsKey(tenMa)) {
                        ThongTin.maChungKhoanHashMap.get(tenMa).setTenCongTi(tenCongTi);
                        if (ThongTin.nhomNganhHashMap.containsKey(tenNhomNganh)) {
                            ThongTin.nhomNganhHashMap.get(tenNhomNganh).addMa(tenMa);
                        } else {
                            ThongTin.nhomNganhHashMap.put(tenNhomNganh, new NhomNganh(tenMa, tenNhomNganh));
                        }
                    }
                    if(vn30.equals("1")){
                        NhomVN30.tenMA.add(tenMa);
                    }
                } else break;
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }
}
