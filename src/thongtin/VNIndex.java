package thongtin;

import java.time.LocalDate;
import java.util.HashMap;

/**
 * Lóp VNIndex lưu trữ dữ liệu về VNIndex theo ngày
 *
 * @see Gia
 * @see GiaoDich
 * @see java.time.LocalDate
 * @author
 */
public class VNIndex {
    private Gia gia;
    private GiaoDich giaoDich;
    private LocalDate thoiGian;
    private boolean tang, dungGia, giam;

    public VNIndex(Gia gia, GiaoDich giaoDich, LocalDate thoiGian) {
        this.gia = gia;
        this.giaoDich = giaoDich;
        this.thoiGian = thoiGian;
        if (this.gia.getDongCua() > this.gia.getThamChieu()){
            this.tang = true;
            this.dungGia = false;
            this.giam = false;
        }
        else if (this.gia.getDongCua() == this.gia.getThamChieu()){
            this.tang = false;
            this.dungGia = true;
            this.giam = false;
        }
        else {
            this.tang = false;
            this.dungGia = false;
            this.giam = true;
        }
    }

    public Gia getGia() {
        return gia;
    }

    public void setGia(Gia gia) {
        this.gia = gia;
    }

    public GiaoDich getGiaoDich() {
        return giaoDich;
    }

    public void setGiaoDich(GiaoDich giaoDich) {
        this.giaoDich = giaoDich;
    }

    public LocalDate getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(LocalDate thoiGian) {
        this.thoiGian = thoiGian;
    }

    public boolean getTang(){
        return this.tang;
    }

    public boolean getDungGia(){
        return this.dungGia;
    }

    public boolean getGiam(){
        return this.giam;
    }

    public int getNgay(){
        return this.thoiGian.getDayOfMonth();
    }

    public int getThang(){
        return this.thoiGian.getMonthValue();
    }

    public int getNam(){
        return this.thoiGian.getYear();
    }

    public String getThu(){
        return this.thoiGian.getDayOfWeek().name();
    }

    public String inThoiGian1(){
        return this.getNgay() + "/" + this.getThang() + "/" + this.getNam();
    }

    public String inThoiGian2(){
        return this.getNgay() + "/" + this.getThang();
    }

    public String inThu(){
        HashMap<String, String> thu = new HashMap<>();
        thu.put("MONDAY", "thứ hai");
        thu.put("TUESDAY", "thứ ba");
        thu.put("WEDNESDAY", "thứ tư");
        thu.put("THURSDAY", "thứ năm");
        thu.put("FRIDAY", "thứ sáu");
        thu.put("SATURDAY", "thứ bảy");
        thu.put("SUNDAY", "chủ nhật");
        return thu.get(this.getThu());
    }
}
