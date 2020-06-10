package laydulieu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import thongtin.ThongTin;

import java.time.LocalDate;
import java.util.Date;

import thongtin.*;

public class LayDuLieuVeMa {
    private static final String COMMA = ","; // Split by comma
    public static void layMa(File fn) {
        BufferedReader br = null;
        try {
            String line;
            SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
            br = new BufferedReader(new FileReader(fn));
            while (true) {
                line = br.readLine();
                if (line != null) {
                    String[] splitData = line.split(COMMA);
                    Date date = formatter1.parse(splitData[1]);
                    String tenMa = splitData[2];
                    float thamChieu = Float.parseFloat(splitData[3]);
                    float moCua = Float.parseFloat(splitData[4]);
                    float dongCua = Float.parseFloat(splitData[5]);
                    float caoNhat = Float.parseFloat(splitData[6]);
                    float thapNhat = Float.parseFloat(splitData[7]);
                    float thayDoiGia = Float.parseFloat(splitData[9]);
                    float tiLeThayDoiGia = Float.parseFloat(splitData[10]);
                    long khoiLuongKhopLenh = Long.parseLong(splitData[11]);
                    long giaTriKhopLenh = Long.parseLong(splitData[12]);
                    long khoiLuongThoaThuan = Long.parseLong(splitData[13]);
                    long giaTriThoaThuan =Long.parseLong(splitData[14]);
                    long vonHoaThiTruong = Long.parseLong(splitData[15]);

                    MaChungKhoan maChungKhoan = new MaChungKhoan( tenMa,new Gia(thamChieu, moCua, dongCua, caoNhat, thapNhat, thayDoiGia, tiLeThayDoiGia)
                            , new GiaoDich(khoiLuongKhopLenh, khoiLuongThoaThuan, giaTriKhopLenh, giaTriThoaThuan)
                            , date,vonHoaThiTruong);
                    ThongTin.maChungKhoanHashMap.put(tenMa,maChungKhoan);
                } else break;
            }

        } catch (IOException | ParseException e) {
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