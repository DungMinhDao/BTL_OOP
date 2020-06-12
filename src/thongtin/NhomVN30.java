package thongtin;

import java.util.ArrayList;
public class NhomVN30 {
    public static ArrayList<String> tenMA = new ArrayList<String>();
    private int soMaGiam = 0;
    private int soMaTang = 0;
    private int soMaThamChieu = 0;
    private float tongDiemThayDoi = 0;

    public NhomVN30(){
        for(int i = 0; i < tenMA.size(); ++i){
            MaChungKhoan ma = ThongTin.maChungKhoanHashMap.get(tenMA.get(i));
            if(ma.getGia().getThayDoiDiem() < 0) {
                soMaGiam += 1;
            }
            else if(ma.getGia().getThayDoiDiem() > 0){
                soMaTang += 1;
            }
            else {
                soMaThamChieu += 1;
            }
            tongDiemThayDoi += ma.getGia().getThayDoiDiem();
        }
    }

    public int getSoMaGiam() {
        return soMaGiam;
    }

    public int getSoMaTang() {
        return soMaTang;
    }

    public int getSoMaThamChieu() {
        return soMaThamChieu;
    }

    public float getTongDiemThayDoi() {
        return tongDiemThayDoi;
    }
}
