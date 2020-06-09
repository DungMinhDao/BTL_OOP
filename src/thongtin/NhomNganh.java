package thongtin;

import java.util.ArrayList;

public class NhomNganh {
    private ArrayList<String> tenMa;
    private String tenNhomNganh;
    private float tongThayDoi = 0;

    public NhomNganh(ArrayList<String> tenMa, String tenNhomNganh) {
        this.tenMa = tenMa;
        this.tenNhomNganh = tenNhomNganh;
    }

    public void addMa(String ma){
        tenMa.add(ma);
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
}
