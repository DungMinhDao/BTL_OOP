package thongtin;

import java.time.LocalDate;
import java.util.HashMap;

/**
 * Lớp ThongTin lưu trữ dữ liệu hiện thời của chương trình về các mã chứng khoán,
 * các nhóm ngành và nhóm VN30. Các dữ liệu này được cập nhật từ các lớp trong
 * package laydulieu
 *
 * @author
 */
public class ThongTin {
    public static HashMap<String, MaChungKhoan> maChungKhoanHashMap = new HashMap<String, MaChungKhoan>();
    public static HashMap<String, NhomNganh> nhomNganhHashMap = new HashMap<String, NhomNganh>();
    public static HashMap<LocalDate, VNIndex> vnIndexHashMap = new HashMap<LocalDate, VNIndex>();
}
