package thongtin;

import java.util.ArrayList;

/**
 * Lớp NhomVN30 lưu trữ dữ liệu về nhóm VN30 trên thị trường chứng khoán.
 *
 * @author
 */
public class NhomVN30 {
    public static ArrayList<String> tenMA = new ArrayList<String>();
    private int soMaGiam = 0;
    private int soMaTang = 0;
    private int soMaThamChieu = 0;
    private float tongDiemThayDoi = 0;

    public NhomVN30(){
        for(int i = 0; i < tenMA.size(); ++i){
            MaChungKhoan ma = ThongTin.maChungKhoanHashMap.get(tenMA.get(i));
            TinhChatMa tinhChatMa = new TinhChatMa(ma);
            if(tinhChatMa.giamGia()) {
                soMaGiam += 1;
                tongDiemThayDoi -= ma.getGia().getThayDoi();
            }
            else if(tinhChatMa.tangGia()){
                soMaTang += 1;
                tongDiemThayDoi += ma.getGia().getThayDoi();
            }
            else {
                soMaThamChieu += 1;
            }
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