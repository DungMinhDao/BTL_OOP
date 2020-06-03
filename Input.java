package input;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import thongtin.*;

public class Input {
    private static final String COMMA = ","; // Split by comma
    private Ma [] ma = new Ma[31];
    public static void main(String[] args) throws Exception {
        DuLieu duLieu = new DuLieu();
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("VNIndex1.csv"));
            while (true) {
                line = br.readLine();
                if (line != null) {
                    int stt;
                    String date;
                    Gia gia;
                    String[] splitData = line.split(COMMA);
                    String s = splitData[0];
                    System.out.println(Integer.parseInt(s));
                }
                else break;
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