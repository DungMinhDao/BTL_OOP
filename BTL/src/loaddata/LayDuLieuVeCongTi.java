package loaddata;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.util.HashMap;

public class LayDuLieuVeCongTi {
    private static final String COMMA = ","; // Split by comma
    HashMap<String,String> hm ;
    public void layMaCongTi(File fn){
        this.hm = new HashMap<String, String>();
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader(fn));
            while (true) {
                line = br.readLine();
                if (line != null) {
                    String[] splitData = line.split(COMMA);
                    String tenMa = splitData[1];
                    String tenCongTi = splitData[2];
                    this.hm.put(tenMa,tenCongTi);
                } else break;
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

//    public static void main(String[] args) {
//        LayDuLieuVeCongTi layDuLieuVeCongTi = new LayDuLieuVeCongTi();
//        layDuLieuVeCongTi. layMaCongTi(new File ("test4.csv"));
//        layDuLieuVeCongTi.hm.forEach((keyString, valueString) -> System.out.println(
//                "Key = " + keyString + ", value = " + valueString));
//    }

}
