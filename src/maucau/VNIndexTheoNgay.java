package maucau;

import thongtin.VNIndex;

import java.util.Random;

/**
 * Lớp VNIndexTheoNgay mô hình các câu mô tả dữ liệu về VNIndex theo ngày
 *
 * @see MauCau
 * @author Đoàn Ngọc Khánh
 */
public class VNIndexTheoNgay extends MauCau{

    private VNIndex vnIndex;
    private int canTrenThayDoi, canDuoiThayDoi;
    private int canTrenDongCua, canDuoiDongCua;

    public VNIndexTheoNgay(VNIndex vnIndex, int canTrenThayDoi, int canDuoiThayDoi, int canTrenDongCua,
                           int canDuoiDongCua) {
        this.vnIndex = vnIndex;
        this.canTrenThayDoi = canTrenThayDoi;
        this.canDuoiThayDoi = canDuoiThayDoi;
        this.canTrenDongCua = canTrenDongCua;
        this.canDuoiDongCua = canDuoiDongCua;
    }

    public void thuThapCau(){
        cau1();
        cau2();
        cau3();
        cau4();
        cau5();
        cau6();
        cau7();
        cau8();
        cau9();
    }

    public void inCau(){
        thuThapCau();
        Random rd = new Random();
        System.out.println(tapCau.get(rd.nextInt(tapCau.size())));
    }

    public void cau1(){
        String s = "";
        if (canDuoiThayDoi >= 1) {
            if (vnIndex.getTang()) {
                s = "Phiên giao dịch " + vnIndex.inThoiGian1() + ", VN-Index tăng hơn " + canDuoiThayDoi
                        + " điểm lên " + vnIndex.getGia().getDongCua() + " điểm.";
            } else if (vnIndex.getGiam()) {
                s = "Phiên giao dịch " + vnIndex.inThoiGian1() + ", VN-Index giảm hơn " + canDuoiThayDoi
                        + " điểm xuống " + vnIndex.getGia().getDongCua() + " điểm.";
            }
        }
        tapCau.add(s);
    }

    public void cau2(){
        String s = "";
        float mucDanhGia = 3;
        if (vnIndex.getGia().getThayDoi() < mucDanhGia) {
            if (vnIndex.getTang()) {
                s = "Kết thúc phiên giao dịch ngày " + vnIndex.inThoiGian2() + ", VN-Index đóng cửa tăng nhẹ "
                        + vnIndex.getGia().getThayDoi() + " điểm (tương đương " + vnIndex.getGia().getTiLeThayDoi()
                        + "%) lên mức " + vnIndex.getGia().getDongCua() + " điểm.";
            } else if (vnIndex.getGiam()) {
                s = "Kết thúc phiên giao dịch ngày " + vnIndex.inThoiGian2() + ", VN-Index đóng cửa giảm nhẹ "
                        + vnIndex.getGia().getThayDoi() + " điểm (tương đương " + vnIndex.getGia().getTiLeThayDoi()
                        + "%) xuống mức " + vnIndex.getGia().getDongCua() + " điểm.";
            }
        }
        tapCau.add(s);
    }

    public void cau3(){
        if (vnIndex.getTang()){
            String s = "Chốt phiên giao dịch ngày " + vnIndex.inThoiGian2() + ", Vn-Index tăng "
                    + vnIndex.getGia().getThayDoi() + " điểm, lên " + vnIndex.getGia().getDongCua()
                    + " điểm, chuyển nhượng " + (vnIndex.getGiaoDich().getTongKhoiLuong()/1e6)
                    + " triệu cổ phiếu, tương đương " + (vnIndex.getGiaoDich().getTongGiaTri()/1e9) + " tỷ đồng.";
            tapCau.add(s);
        }
        else if (vnIndex.getGiam()){
            String s = "Chốt phiên giao dịch ngày " + vnIndex.inThoiGian2() + ", Vn-Index giảm "
                    + vnIndex.getGia().getThayDoi() + " điểm, xuống " + vnIndex.getGia().getDongCua()
                    + " điểm, chuyển nhượng " + (vnIndex.getGiaoDich().getTongKhoiLuong()/1e6)
                    + " triệu cổ phiếu, tương đương " + (vnIndex.getGiaoDich().getTongGiaTri()/1e9) + " tỷ đồng.";
            tapCau.add(s);
        }
    }

    public void cau4(){
        if (vnIndex.getTang()){
            String s = "Vn-Index tăng tổng cộng " + vnIndex.getGia().getThayDoi() + " điểm và bật lên "
                    + vnIndex.getGia().getDongCua() + " điểm.";
            tapCau.add(s);
        }
        else if (vnIndex.getGiam()){
            String s = "Vn-Index giảm tổng cộng " + vnIndex.getGia().getThayDoi() + " điểm và tụt xuống "
                    + vnIndex.getGia().getDongCua() + " điểm.";
            tapCau.add(s);
        }
    }

    public void cau5(){
        if (vnIndex.getTang()){
            tapCau.add("Trong đó Vn-Index tăng " + vnIndex.getGia().getThayDoi() + " điểm, tương đương "
                    + vnIndex.getGia().getTiLeThayDoi() + "%, lên " + vnIndex.getGia().getDongCua() + " điểm.");
        }
        else if (vnIndex.getGiam()){
            tapCau.add("Trong đó Vn-Index giảm " + vnIndex.getGia().getThayDoi() + " điểm, tương đương "
                    + vnIndex.getGia().getTiLeThayDoi() + "%, xuống " + vnIndex.getGia().getDongCua() + " điểm.");
        }
    }

    public void cau6(){
        if (vnIndex.getTang()){
            tapCau.add("Chốt phiên giao dịch hôm nay (" + vnIndex.inThoiGian2() + "), VN-Index tăng gần "
                    + canTrenThayDoi + " điểm, tương đương " + vnIndex.getGia().getTiLeThayDoi() + "% lên "
                    + vnIndex.getGia().getDongCua() + " điểm.");
        }
        else if (vnIndex.getGiam()){
            tapCau.add("Chốt phiên giao dịch hôm nay (" + vnIndex.inThoiGian2() + "), VN-Index giảm gần "
                    + canTrenThayDoi + " điểm, tương đương " + vnIndex.getGia().getTiLeThayDoi() + "% xuống "
                    + vnIndex.getGia().getDongCua() + " điểm.");
        }
    }

    public void cau7(){
        if (vnIndex.getTang()){
            tapCau.add("Vn-Index cộng thêm " + vnIndex.getGia().getTiLeThayDoi() + "%, tương đương "
                    + vnIndex.getGia().getThayDoi() + " điểm, và mốc tham chiếu cho phiên tiếp theo sẽ là "
                    + vnIndex.getGia().getDongCua() + " điểm.");
        }
        else if (vnIndex.getGiam()){
            tapCau.add("Vn-Index bị trừ " + vnIndex.getGia().getTiLeThayDoi() + "%, tương đương "
                    + vnIndex.getGia().getThayDoi() + " điểm, và mốc tham chiếu cho phiên tiếp theo sẽ là "
                    + vnIndex.getGia().getDongCua() + " điểm.");
        }
    }

    public void cau8(){
        if (vnIndex.getThu().equals("MONDAY")) {
            if (vnIndex.getTang()) {
                tapCau.add("Chốt phiên giao dịch đầu tuần, VN-Index tăng gần " + canTrenThayDoi + " điểm, tương đương "
                        + vnIndex.getGia().getTiLeThayDoi() + "% lên gần " + canTrenDongCua + " điểm.");
            } else if (vnIndex.getGiam()) {
                tapCau.add("Chốt phiên giao dịch đầu tuần, VN-Index giảm gần " + canTrenThayDoi + " điểm, tương đương "
                        + vnIndex.getGia().getTiLeThayDoi() + "% xuống gần " + canDuoiDongCua + " điểm.");
            }
        }
    }

    public void cau9() {
        if (vnIndex.getThu().equals("FRIDAY")) {
            if (vnIndex.getTang()) {
                tapCau.add("Chốt phiên giao dịch cuối tuần, VN-Index tăng gần " + canTrenThayDoi + " điểm, tương đương "
                        + vnIndex.getGia().getTiLeThayDoi() + "% lên gần " + canTrenDongCua + " điểm.");
            } else if (vnIndex.getGiam()) {
                tapCau.add("Chốt phiên giao dịch cuối tuần, VN-Index giảm gần " + canTrenThayDoi + " điểm, tương đương "
                        + vnIndex.getGia().getTiLeThayDoi() + "% xuống gần " + canDuoiDongCua + " điểm.");
            }
        }
    }
}
