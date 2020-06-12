package xulithongtin;

import java.util.ArrayList;
import maucau.Mau9;
import maucau.MauCau;
import thongtin.MaChungKhoan;
import thongtin.ThongTin;

public class ThongTinMau9 extends ThongTinMau{

    private static final int MAX = 5;

    @Override
    public MauCau khoiTaoMau() {
        ArrayList<String> top5Tang = new ArrayList<String>();
        ArrayList<String> top5Giam = new ArrayList<String>();
        float min = 0, max = 0;
        String tenMaTangTop = null, tenMaGiamTop = null;
        for (int i = 0; i < MAX; i++) {
            for (String tenMa : ThongTin.maChungKhoanHashMap.keySet()) {
                if((!top5Tang.contains(tenMa)) && (max < ThongTin.maChungKhoanHashMap.get(tenMa).getGia().getTiLeThayDoi())){
                    max = ThongTin.maChungKhoanHashMap.get(tenMa).getGia().getTiLeThayDoi();
                    tenMaTangTop = tenMa;
                }
                if((!top5Giam.contains(tenMa)) && (min > ThongTin.maChungKhoanHashMap.get(tenMa).getGia().getTiLeThayDoi())) {
                    min = ThongTin.maChungKhoanHashMap.get(tenMa).getGia().getTiLeThayDoi();
                    tenMaGiamTop = tenMa;
                }
            }
            top5Tang.add(tenMaTangTop);
            top5Giam.add(tenMaGiamTop);
            min = 0;
            max = 0;
        }
        return new Mau9(top5Tang, top5Giam);
    }
}
