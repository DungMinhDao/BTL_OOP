package xulithongtin;

import java.util.ArrayList;
import maucau.Mau8;
import maucau.MauCau;
import thongtin.MaChungKhoan;
import thongtin.ThongTin;

public class ThongTinMau8 extends ThongTinMau{

    private static final int MAX = 5;

    @Override
    public MauCau khoiTaoMau() {
        ArrayList<String> top5Tang = new ArrayList<String>();
        ArrayList<String> top5Giam = new ArrayList<String>();
        float min = 0, max = 0;
        String tenMaTangTop = null, tenMaGiamTop = null;
        for (int i = 0; i < MAX; i++) {
            for (String tenMa : maChungKhoanHashMap.keys()) {
                if((!top5Tang.contains(tenMa)) && (max < maChungKhoanHashMap.get(tenMa).getGia().getTyLeThayDoi())){
                    max = maChungKhoanHashMap.get(tenMa).getGia().getTyLeThayDoi();
                    tenMaTangTop = tenMa;
                }
                if((!top5Giam.contains(tenMa)) && (min < maChungKhoanHashMap.get(tenMa).getGia().getTyLeThayDoi())) {
                    min = maChungKhoanHashMap.get(tenMa).getGia().getTyLeThayDoi();
                    tenMaGiamTop = tenMa;
                }
            }
            top5Tang.add(tenMaTangTop);
            top5Giam.add(tenMaGiamTop);
        }
        return new Mau8(top5Tang, top5Giam);
    }
}
