package thongtin;

import java.util.ArrayList;

public class NhomNganh {
    private ArrayList<String> tenMa;
    private String tenNhomNganh;
    private float tongThayDoi = 0;

    public NhomNganh(String tenMaDauTien, String tenNhomNganh) {
        this.tenMa = new ArrayList<String>();
        addMa(tenMaDauTien);
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
