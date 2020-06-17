package maucau;

import thongtin.ThongTin;
import thongtin.VNIndex;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

/**
 * Lớp VNIndexTheoTuan mô hình các câu mô tả dữ liệu về VNIndex theo tuần
 *
 * @see MauCau
 * @author Đoàn Ngọc Khánh
 */
public class VNIndexTheoTuan extends MauCau{

    private static final float MUCDANHGIATILE = 2;
    private ArrayList<LocalDate> chuoiNgay;
    private float giaThamChieuTuan, giaDongCuaTuan;
    private int soNgayTang, soNgayGiam;
    private LocalDate  ngayTangManhNhat, ngayGiamManhNhat;
    private ArrayList<String> tapCauDauTuan, tapCauTrongTuan, tapCauCuoiTuan, tapCauNoiBat;

    public VNIndexTheoTuan(ArrayList<LocalDate> chuoiNgay, int soNgayTang, int soNgayGiam, LocalDate ngayTangManhNhat,
                           LocalDate ngayGiamManhNhat) {
        this.chuoiNgay = chuoiNgay;
        this.giaThamChieuTuan = ThongTin.vnIndexHashMap.get(chuoiNgay.get(0)).getGia().getThamChieu();
        this.giaDongCuaTuan = ThongTin.vnIndexHashMap.get(chuoiNgay.get(chuoiNgay.size() - 1)).getGia().getDongCua();
        this.soNgayTang = soNgayTang;
        this.soNgayGiam = soNgayGiam;
        this.ngayTangManhNhat = ngayTangManhNhat;
        this.ngayGiamManhNhat = ngayGiamManhNhat;
        this.tapCauDauTuan = new ArrayList<>();
        this.tapCauTrongTuan = new ArrayList<>();
        this.tapCauNoiBat = new ArrayList<>();
        this.tapCauCuoiTuan = new ArrayList<>();
    }

    @Override
    public void thuThapCau() {
        cau1();
        cau2();
        cau3();
        cau4();
        String a = null, b = null, c = null, d = null;
        Random random = new Random();
        try {
            a = tapCauDauTuan.get(random.nextInt(tapCauDauTuan.size()));
            b = tapCauTrongTuan.get(random.nextInt(tapCauTrongTuan.size()));
            c = tapCauNoiBat.get(random.nextInt(tapCauNoiBat.size()));
            d = tapCauCuoiTuan.get(random.nextInt(tapCauCuoiTuan.size()));
        } catch (IllegalArgumentException e){
            e.printStackTrace();
        } finally {
            tapCau.add(a + " " + b + " " + c + " " + d);
        }
    }

    //Đầu tuần
    public void cau1(){
        VNIndex vnIndex = ThongTin.vnIndexHashMap.get(chuoiNgay.get(0));
        if (vnIndex.getGiam()){
            tapCauDauTuan.add("Kết thúc phiên đầu tuần, Vn-Index chốt tại " + vnIndex.getGia().getDongCua()
                    + ", giảm thêm " + vnIndex.getGia().getThayDoi() + " điểm (" + vnIndex.getGia().getTiLeThayDoi()
                    + "%) so với tuần trước.");
            tapCauDauTuan.add("Cho đến hết phiên giao dịch ngày đầu tuần, Vn-Index chỉ còn "
                    + vnIndex.getGia().getDongCua() + " điểm với khối lượng giao dịch "
                    + vnIndex.getGiaoDich().getTongKhoiLuong() + " triệu đơn vị.");
            tapCauDauTuan.add("Chốt phiên giao dịch đầu tiên của tuần mới: VN-Index mất "
                    + vnIndex.getGia().getTiLeThayDoi() + "%.");
        }
        if (vnIndex.getTang()){
            tapCauDauTuan.add("Kết thúc phiên đầu tuần, Vn-Index chốt tại " + vnIndex.getGia().getDongCua()
                    + ", tăng thêm " + vnIndex.getGia().getThayDoi() + " điểm ("
                    + vnIndex.getGia().getTiLeThayDoi() + "%) so với tuần trước.");
            tapCauDauTuan.add("Chốt phiên giao dịch đầu tiên của tuần mới: VN-Index nhận thêm "
                    + vnIndex.getGia().getTiLeThayDoi() + "%.");
            tapCauDauTuan.add("Phiên giao dịch đầu tuần diễn ra tương đối tích cực khi Vn-Index đã vượt cản tâm lý "
                    + vnIndex.getGia().getDongCua() + " điểm.");
        }
    }

    //Trong tuần
    public void cau2(){
        Random random = new Random();
        VNIndex vnIndex = ThongTin.vnIndexHashMap.get(chuoiNgay.get(random.nextInt(chuoiNgay.size() - 2) + 1));
        float thayDoi = vnIndex.getGia().getDongCua() - giaThamChieuTuan;
        if (thayDoi > 0){
            tapCauTrongTuan.add("Tính đến hết phiên giao dịch ngày " + vnIndex.inThoiGian2() + ", VN-Index đã tăng "
                    + Math.abs(thayDoi) + " điểm tương ứng " + (Math.abs(thayDoi)/giaThamChieuTuan) + "% xuống chỉ còn "
                    + vnIndex.getGia().getDongCua() + " điểm.");
        }
        if (thayDoi < 0){
            tapCauTrongTuan.add("Tính đến hết phiên giao dịch ngày " + vnIndex.inThoiGian2() + ", VN-Index đã giảm "
                    + Math.abs(thayDoi) + " điểm tương ứng " + (Math.abs(thayDoi)/giaThamChieuTuan) + "% xuống chỉ còn "
                    + vnIndex.getGia().getDongCua() + " điểm.");
        }
        if (vnIndex.getTang()){
            tapCauTrongTuan.add("Phiên giữa tuần (" + vnIndex.inThoiGian2() + "), sau khi tăng thêm "
                    + vnIndex.getGia().getThayDoi() + " điểm, VN-Index có " + vnIndex.getGia().getDongCua()
                    + " điểm.");
        }
        if (vnIndex.getGiam()){
            tapCauTrongTuan.add("Phiên giữa tuần (" + vnIndex.inThoiGian2() + "), sau khi mất đi thêm "
                    + vnIndex.getGia().getThayDoi() + " điểm, VN-Index chỉ còn " + vnIndex.getGia().getDongCua()
                    + " điểm.");
        }
    }

    //Nổi bật
    public void cau3(){
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
                    + ", Vn-Index giảm " + vnIndex.getGia().getTiLeThayDoi() + "%, tương ứng mức giảm "
                    + vnIndex.getGia().getThayDoi() + " điểm và tụt xuống mức " + vnIndex.getGia().getDongCua()
                    + " điểm.");
        }
        if(ngayGiamManhNhat != null && ngayTangManhNhat != null) {
            if (ThongTin.vnIndexHashMap.get(ngayTangManhNhat).getGia().getTiLeThayDoi()
                    > ThongTin.vnIndexHashMap.get(ngayGiamManhNhat).getGia().getTiLeThayDoi()) {
                vnIndex = ThongTin.vnIndexHashMap.get(ngayTangManhNhat);
                tapCauNoiBat.add("Trong suốt tuần qua, trừ phiên tăng mạnh hôm " + vnIndex.inThu()
                        + " thì VN-Index chủ yếu dao động trong biên độ hẹp.");
            } else {
                vnIndex = ThongTin.vnIndexHashMap.get(ngayTangManhNhat);
                tapCauNoiBat.add("Trong suốt tuần qua, trừ phiên giảm mạnh hôm " + vnIndex.inThu()
                        + " thì VN-Index chủ yếu dao động trong biên độ hẹp.");
            }
        }
    }

    //Cuối tuần
    public void cau4(){
        float giaThayDoi = Math.abs(giaDongCuaTuan - giaThamChieuTuan);
        float tiLeThayDoi = giaThayDoi/giaThamChieuTuan;
        VNIndex vnIndex1 = ThongTin.vnIndexHashMap.get(chuoiNgay.get(0));
        VNIndex vnIndex2 = ThongTin.vnIndexHashMap.get(chuoiNgay.get(chuoiNgay.size() - 1));
        if (giaDongCuaTuan < giaThamChieuTuan){
            tapCauCuoiTuan.add("Kết thúc tuần giao dịch, VN-Index tụt " + giaThayDoi + " điểm (" + tiLeThayDoi
                    + "%) so với tuần trước.");
            tapCauCuoiTuan.add("Tuần qua là một tuần giao dịch đầy ảm đạm của thị trường với việc VN-Index giảm "
                    + giaThayDoi + " điểm xuống " + giaDongCuaTuan + " điểm.");
            tapCauCuoiTuan.add("Khép lại tuần giao dịch vừa qua, chỉ số Vn-Index trên sàn TP.HCM đã tụt " + tiLeThayDoi
                    + "% xuống mức " + giaDongCuaTuan + " điểm.");
        }
        if (giaDongCuaTuan > giaThamChieuTuan){
            tapCauCuoiTuan.add("Kết thúc tuần giao dịch, VN-Index nhích lên " + giaThayDoi + " điểm (" + tiLeThayDoi
                    + "%) so với tuần trước.");
            tapCauCuoiTuan.add("Khép lại tuần giao dịch vừa qua, chỉ số Vn-Index trên sàn TP.HCM đã tăng " + tiLeThayDoi
                    + "% lên mức " + giaDongCuaTuan + " điểm.");
            tapCauCuoiTuan.add("Tuần giao dịch " + vnIndex1.inThoiGian2() + "-" + vnIndex2.inThoiGian2()
                    + " đã kết thúc với những tín hiệu tích cực khi VN-Index ghi nhận mức tăng " + tiLeThayDoi + "%.");
            tapCauCuoiTuan.add("Tuần giao dịch " + vnIndex1.inThoiGian2() + "-" + vnIndex2.inThoiGian2()
                    + " diễn ra khá tích cực với mức tăng " + tiLeThayDoi +"% của chỉ số VN-Index.");
        }
        if (tiLeThayDoi < MUCDANHGIATILE){
            tapCauCuoiTuan.add("Theo đó, VN-Index kết tuần giao dịch tại " + giaDongCuaTuan
                    + " điểm, không thay đổi nhiều so với tuần trước đó.");
        }
        tapCauCuoiTuan.add("Như vậy, Vn-Index đã kết thúc một tuần giao dịch với " + soNgayTang
                + " phiên tăng và " + soNgayGiam + " phiên.");
    }
}
