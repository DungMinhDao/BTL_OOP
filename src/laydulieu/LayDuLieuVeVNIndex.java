package laydulieu;

import thongtin.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Lớp LayDuLieuVeVNIndex lấy dữ liệu về VNIndex trong một tháng
 * từ file CSV.
 *
 * @author Đoàn Ngọc Khánh
 */
public class LayDuLieuVeVNIndex {
    private static final String COMMA = ","; // Split by comma

    /**
     * Phương thức layVNIndex lấy dữ liệu VNIndex theo đường dẫn fn và lưu thông tin
     * vào một HasMap trong lớp ThongTin thuộc package thongtin.
     * @param fn Đường dẫn tới file CSV chứa thông tin cần đọc.
     *
     * @see ThongTin
     */
    public static void layVNIndex(File fn) {
        BufferedReader br = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            String line;
            br = new BufferedReader(new FileReader(fn));
            while (true) {
                line = br.readLine();
                if (line != null) {
                    String[] splitData = line.split(COMMA);
                    LocalDate thoiGian = LocalDate.parse(splitData[1], formatter);
                    float thamChieu = Float.parseFloat(splitData[3]);
                    float moCua = Float.parseFloat(splitData[4]);
                    float dongCua = Float.parseFloat(splitData[5]);
                    float tran = Float.parseFloat(splitData[6]);
                    float san = Float.parseFloat(splitData[7]);
                    float thayDoiDiem = Math.abs(Float.parseFloat(splitData[9]));
                    float tiLeThayDoi = Math.abs(Float.parseFloat(splitData[10]));
                    long khoiLuongKhopLenh = Long.parseLong(splitData[11]);
                    long giaTriKhopLenh = Long.parseLong(splitData[12]);
                    long khoiLuongThoaThuan = Long.parseLong(splitData[13]);
                    long giaTriThoaThuan = Long.parseLong(splitData[14]);

                    ThongTin.vnIndexHashMap.put(thoiGian, new VNIndex(new Gia(thamChieu, moCua, dongCua, tran, san,
                            thayDoiDiem, tiLeThayDoi), new GiaoDich(khoiLuongKhopLenh, khoiLuongThoaThuan,
                            giaTriKhopLenh, giaTriThoaThuan), thoiGian));
                } else break;
            }

        } catch (IOException /*| ParseException*/ e) {
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
