package maucau;

import thongtin.ThongTin;
import thongtin.VNIndex;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

/**
 * Lớp VNIndexTheoThang mô hình các câu mô tả dữ liệu về VNIndex theo tháng
 *
 * @see MauCau
 * @author Đoàn Ngọc Khánh
 */
public class VNIndexTheoThang extends MauCau{

    private int thang;
    private ArrayList<LocalDate> tapNgay;
    private float giaThamChieuThang;
    private float giaDongCuaThang;
    private LocalDate ngayTangManhNhat, ngayGiamManhNhat, ngayDongCuaCaoNhat;
    private ArrayList<String> tapCauTrongThang, tapCauNoiBat, tapCauKetThucThang, tapCauBinhLuan;

    public VNIndexTheoThang(ArrayList<LocalDate> tapNgay, float giaThamChieuThang, float giaDongCuaThang,
                            LocalDate ngayTangManhNhat, LocalDate ngayGiamManhNhat, LocalDate ngayDongCuaCaoNhat) {
        this.tapNgay = tapNgay;
        this.giaThamChieuThang = giaThamChieuThang;
        this.giaDongCuaThang = giaDongCuaThang;
        this.ngayTangManhNhat = ngayTangManhNhat;
        this.ngayGiamManhNhat = ngayGiamManhNhat;
        this.ngayDongCuaCaoNhat = ngayDongCuaCaoNhat;
        this.thang = tapNgay.get(0).getMonthValue();
        this.tapCauTrongThang = new ArrayList<>();
        this.tapCauNoiBat = new ArrayList<>();
        this.tapCauKetThucThang = new ArrayList<>();
        this.tapCauBinhLuan = new ArrayList<>();
    }

    @Override
    public void thuThapCau() {
        Random random = new Random();
        cau1();
        cau2();
        cau3();
        cau4();
        String a = null, b = null, c = null, d = null;
        a = tapCauTrongThang.get(random.nextInt(tapCauTrongThang.size()));
        b = tapCauNoiBat.get(random.nextInt(tapCauNoiBat.size()));
        c = tapCauKetThucThang.get(random.nextInt(tapCauKetThucThang.size()));
        d = tapCauBinhLuan.get(random.nextInt(tapCauBinhLuan.size()));
        tapCau.add(a + " " + b + " " + c + " " + d);
    }

    //Trong tháng
    public void cau1(){
        ArrayList<LocalDate> cacThuHai = new ArrayList<>();
        for (int i = 0; i < tapNgay.size(); i++){
            if (tapNgay.get(i).getDayOfWeek().name().equals("MONDAY")){
                cacThuHai.add(tapNgay.get(i));
            }
        }
        float dongCuaThuHai = 0;
        LocalDate thuHaiCaoNhat = null;
        for (LocalDate thuHai: cacThuHai){
            if (ThongTin.vnIndexHashMap.get(thuHai).getGia().getDongCua() > dongCuaThuHai){
                thuHaiCaoNhat = thuHai;
                dongCuaThuHai = ThongTin.vnIndexHashMap.get(thuHai).getGia().getDongCua();
            }
        }
        if (thuHaiCaoNhat != null){
            String thuTu = null;
            switch (cacThuHai.indexOf(thuHaiCaoNhat)){
                case 0:{
                    thuTu = "đầu tiên"; break;
                }
                case 1:{
                    thuTu = "thứ hai"; break;
                }
                case 2:{
                    thuTu = "thứ ba"; break;
                }
                case 3:{
                    thuTu = "thứ tư"; break;
                }
                case 4:{
                    thuTu = "thứ năm"; break;
                }
            }
            VNIndex vnIndex = ThongTin.vnIndexHashMap.get(thuHaiCaoNhat);
            tapCauTrongThang.add("Trong ngày đầu tuần " + thuTu +" của tháng " + vnIndex.getThang()
                    + ", VN-Index đã chạm mốc " + vnIndex.getGia().getDongCua() + " điểm.");
        }

        float mucDanhGia = 50;
        int j = 0;
        VNIndex vnIndex1 = ThongTin.vnIndexHashMap.get(tapNgay.get(j));
        while (Math.abs(vnIndex1.getGia().getDongCua() - giaThamChieuThang) < mucDanhGia){
            j += 1;
            vnIndex1 = ThongTin.vnIndexHashMap.get(tapNgay.get(j));
        }
        if (tapNgay.contains(vnIndex1.getNgay())){
            int k = (int) Math.ceil(j/5);
            if (vnIndex1.getGia().getDongCua() > giaThamChieuThang){
                tapCauTrongThang.add("Tính đến phiên giao dịch (" + vnIndex1.inThoiGian2() + "), VN-Index đã tăng "
                        + (vnIndex1.getGia().getDongCua() - giaThamChieuThang) + " điểm sau " + k
                        + " tuần điều chỉnh mạnh.");
            }
            else {
                tapCauTrongThang.add("Tính đến phiên giao dịch (" + vnIndex1.inThoiGian2() + "), VN-Index đã mất "
                        + (giaThamChieuThang - vnIndex1.getGia().getDongCua()) + " điểm sau " + k
                        + " tuần điều chỉnh mạnh.");
            }
        }
    }

    //Nổi bật
    public void cau2(){
        VNIndex vnIndex;
        if (ngayTangManhNhat != null){
            vnIndex = ThongTin.vnIndexHashMap.get(ngayTangManhNhat);
            tapCauNoiBat.add("Phiên giao dịch tăng mạnh nhất tính theo %: phiên giao dịch ngày " + vnIndex.inThoiGian1()
                    + ", Vn-Index tăng " + vnIndex.getGia().getTiLeThayDoi() + "%, tương ứng mức tăng "
                    + vnIndex.getGia().getThayDoi() + " điểm để leo lên mức " + vnIndex.getGia().getDongCua()
                    + " điểm.");
        }
        if (ngayGiamManhNhat != null){
            vnIndex = ThongTin.vnIndexHashMap.get(ngayGiamManhNhat);
            tapCauNoiBat.add("Phiên giao dịch giảm mạnh nhất tính theo %: phiên giao dịch ngày " + vnIndex.inThoiGian1()
                    + ", Vn-Index giảm " + vnIndex.getGia().getTiLeThayDoi() + "%, tương ứng mức tăng "
                    + vnIndex.getGia().getThayDoi() + " điểm để leo lên mức " + vnIndex.getGia().getDongCua()
                    + " điểm.");
        }
        if (ngayDongCuaCaoNhat != null){
            vnIndex = ThongTin.vnIndexHashMap.get(ngayDongCuaCaoNhat);
            tapCauNoiBat.add("Kết thúc giao dịch " + vnIndex.inThu() + " ngày " + vnIndex.inThoiGian2()
                    + ", VN-Index tăng " + vnIndex.getGia().getTiLeThayDoi() + "% lên "
                    + vnIndex.getGia().getDongCua() + " điểm và là mức điểm cao nhất đạt được trong 1 tháng qua.");
        }
    }

    //Kết thúc tháng
    public void cau3(){
        VNIndex vnIndex1 = ThongTin.vnIndexHashMap.get(tapNgay.get(tapNgay.size() - 1));
        long khoiLuongGD = 0;
        long giaTriGD = 0;
        for (LocalDate ngay: tapNgay){
            VNIndex vnIndex = ThongTin.vnIndexHashMap.get(ngay);
            khoiLuongGD += vnIndex.getGiaoDich().getTongKhoiLuong();
            giaTriGD += vnIndex.getGiaoDich().getTongGiaTri();
        }
        float thayDoiDiem = Math.abs(giaDongCuaThang - giaThamChieuThang);
        float tiLeThayDoi = thayDoiDiem/giaThamChieuThang;
        int thangTruocDo = ((thang - 2) % 12) + 1;
        if (giaDongCuaThang > giaThamChieuThang){
            tapCauKetThucThang.add("Kết thúc phiên giao dịch tháng " + vnIndex1.getThang() +
                    ", chỉ số VN-Index đóng cửa ở mốc " + giaDongCuaThang + " điểm, tăng " + tiLeThayDoi +
                    "%, khối lượng giao dịch (KLGD) đạt " + khoiLuongGD + " cổ phiếu ứng với giá trị giao dịch đạt "
                    + (giaTriGD/1000) + " tỷ đồng.");
            tapCauKetThucThang.add("Chốt lại vào ngày " + vnIndex1.inThoiGian2() + ", VN-Index tăng " + thayDoiDiem +
                    " điểm, tương đương " + tiLeThayDoi + "% so với cuối tháng " + thangTruocDo + ".");
        }
        if (giaDongCuaThang < giaThamChieuThang){
            tapCauKetThucThang.add("Kết thúc phiên giao dịch tháng " + vnIndex1.getThang()
                    + ", chỉ số VN-Index đóng cửa ở mốc " + giaDongCuaThang + " điểm, giảm " + tiLeThayDoi
                    + "%, khối lượng giao dịch (KLGD) đạt " + khoiLuongGD + " cổ phiếu ứng với giá trị giao dịch đạt "
                    + (giaTriGD/1000) + " tỷ đồng.");
            tapCauKetThucThang.add("Chốt lại vào ngày " + vnIndex1.inThoiGian2() + ", VN-Index giảm " + thayDoiDiem
                    + " điểm, tương đương " + tiLeThayDoi + "% so với cuối tháng " + thangTruocDo + ".");
        }
    }

    //Bình luân
    public void cau4(){
        int thangKeTiep = (thang % 12) + 1;
        int kyVongDiemThangToi =
                (int) (Math.ceil(ThongTin.vnIndexHashMap.get(ngayDongCuaCaoNhat).getGia().getDongCua()/100)*100);
        tapCauBinhLuan.add("Liệu VN-Index có vượt qua được mốc " + kyVongDiemThangToi + " điểm trong tháng "
                + thangKeTiep +" hay không, vấn đề phụ thuộc vào dòng tiền và mức độ chịu rủi ro của nhà đầu tư.");
    }
}