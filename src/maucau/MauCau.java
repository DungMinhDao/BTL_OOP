package maucau;

import java.util.ArrayList;
import java.util.Random;

/**
 * Lớp MauCau lưu trữ tập các câu đã được mô hình và đưa ra các câu một cách ngẫu nhiên
 *
 * @author
 */
public abstract class MauCau {
    protected ArrayList<String> tapCau = new ArrayList<String>();

    /**
     * Phương thức layCau() được dùng để chọn ngẫu nhiên một câu trong tập câu đã có
     *
     * @return Trả về một câu ngẫu nhiên trong tapCau
     */
    public String layCau(){
        thuThapCau();
        Random rd = new Random();
        return tapCau.get(rd.nextInt(tapCau.size()));
    }

    public abstract void thuThapCau();

    public ArrayList<String> getTapCau() {
        return tapCau;
    }
}
