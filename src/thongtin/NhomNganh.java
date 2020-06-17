package thongtin;

import java.util.ArrayList;

/**
 * Lớp NhomNganh lưu trữ dữ liệu về các nhóm ngành trên thị trường chứng khoán.
 *
 * @author
 */
public class NhomNganh {
    private ArrayList<String> tenMa;
    private String tenNhomNganh;
    private float tongThayDoi = 0;
    private long tongVonHoa = 0;
    public NhomNganh(String tenMaDauTien, String tenNhomNganh) {
        this.tenMa = new ArrayList<String>();
        addMa(tenMaDauTien);
        this.tenNhomNganh = tenNhomNganh;
    }

    /**
     * Phương thức addMa() thêm từng mã vào danh sách các mã trong nhóm ngành
     * và cập nhật lại thông tin về nhóm ngành đó.
     * @param ma Mã chứng khoán được thêm.
     */
    public void addMa(String ma){
        tenMa.add(ma);
        TinhChatMa tinhChatMa = new TinhChatMa(ThongTin.maChungKhoanHashMap.get(ma));
        if(tinhChatMa.giamGia()){
            tongThayDoi -= ThongTin.maChungKhoanHashMap.get(ma).getGia().getThayDoi();
        }
        else if(tinhChatMa.tangGia()) {
            tongThayDoi += ThongTin.maChungKhoanHashMap.get(ma).getGia().getThayDoi();
        }
        tongVonHoa += ThongTin.maChungKhoanHashMap.get(ma).getVonHoaThiTruong();
    }

    public ArrayList<String> getTenMa() {
        return tenMa;
    }

    public String getTenNhomNganh() {
        return tenNhomNganh;
    }

    public float getTongThayDoi() {
        return tongThayDoi;
    }

    public long getTongVonHoa() {
        return tongVonHoa;
    }
}
