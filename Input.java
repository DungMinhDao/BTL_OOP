package input;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import thongtin.*;

public class Input {
    private static final String COMMA = ","; // Split by comma
    private ArrayList<Ma> danhSachMa;
    public static Input layMa() {
        Input input = new Input();
        input.danhSachMa = new ArrayList<>();
        BufferedReader br = null;
        try {
            String line;
            SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
            br = new BufferedReader(new FileReader("test.csv"));
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
                    float thayDoiDiem = Float.parseFloat(splitData[9]);
                    float tiLeThayDoi = Float.parseFloat(splitData[10]);
                    float khoiLuongKhopLenh = Float.parseFloat(splitData[11]);
                    float giaTriKhopLenh = Float.parseFloat(splitData[12]);
                    float khoiLuongThoaThuan = Float.parseFloat(splitData[13]);
                    float giaTriThoaThuan = Float.parseFloat(splitData[14]);
                    input.danhSachMa.add(
                            new Ma(new Gia(thamChieu, moCua, dongCua, caoNhat, thapNhat, thayDoiDiem, tiLeThayDoi)
                                    , new Giao_dich(khoiLuongKhopLenh, giaTriKhopLenh, khoiLuongThoaThuan, giaTriThoaThuan)
                                    , date, tenMa));
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
        return input;
    }

    public static void main(String[] args) {
    }
}