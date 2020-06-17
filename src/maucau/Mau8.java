package maucau;
import java.util.*;

import thongtin.NhomNganh;
import thongtin.NhomVN30;

/**
 * Lớp Mau8 mô hình các câu mô tả tổng quan về các nhóm ngành trên thị trường
 *
 * @see MauCau
 * @author
 */
public class Mau8 extends MauCau{
    private static String tag = "Tổng quan về các nhóm ngành";
    private ArrayList<NhomNganh> nhomNganhGiam, nhomNganhTang;

    public Mau8(ArrayList<NhomNganh> nhomNganhGiam, ArrayList<NhomNganh> nhomNganhTang){
        this.nhomNganhGiam = nhomNganhGiam;
        this.nhomNganhTang = nhomNganhTang;
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
    }

    public void cau1(){
        if(nhomNganhGiam.size() >= nhomNganhTang.size()*2){
            String s = "Hầu hết các nhóm ngành trên thị trường đều giảm điểm.";
            tapCau.add(s);
        }
        else if(nhomNganhTang.size() >= nhomNganhGiam.size()*2){
            String s = "Hầu hết các nhóm ngành trên thị trường đều tăng điểm.";
            tapCau.add(s);
        }
    }

    public void cau2(){
        String s = "Nhóm ngành giảm mạnh nhất là nhóm ngành ";
        s = s + nhomNganhGiam.get(0).getTenNhomNganh() + " với mức giảm " + (- nhomNganhGiam.get(0).getTongThayDoi()) + " đồng.";

        tapCau.add(s);
    }

    public void cau3(){
        String s = "Nhóm ngành tăng mạnh nhất là nhóm ngành ";
        s = s + nhomNganhTang.get(0).getTenNhomNganh() + " với mức tăng " + nhomNganhTang.get(0).getTongThayDoi() / 1000 + " điểm.";

        tapCau.add(s);
    }

    public void cau4(){
        int i;
        String s = "Các cổ phiếu có tính thị trường hơn như " + nhomNganhTang.get(1).getTenNhomNganh();
        int length = Math.min(nhomNganhTang.size(), 6);
        for(i = 2; i < length; i++){
            s = s + ", " + nhomNganhTang.get(i).getTenNhomNganh();
        }
        s = s + ",... cũng thu hút dòng tiền khá mạnh.";
        tapCau.add(s);
    }

    public void cau5(){
        if(nhomNganhTang.size() > 1){
            String s = "Các nhóm ngành ";
            for(int i = 0; i < nhomNganhTang.size(); ++i){
                if(i == 2){
                    break;
                }
                s += nhomNganhTang.get(i).getTenNhomNganh() + ", ";
            }
            s += nhomNganhTang.get(3).getTenNhomNganh()
                    + "... cho thấy nỗ lực rất tích cực với hầu hết các cổ phiếu có được mức tăng ấn tượng.";
            tapCau.add(s);
        }
    }

    public void cau6(){
        if(nhomNganhTang.size() < 2){
            return;
        }
        String s = "Bên cạnh đó, dòng tiền của nhà đầu tư đang được đổ mạnh vào nhóm ngành "
                + nhomNganhTang.get(0).getTenNhomNganh();
        for(int i = 1; i < nhomNganhTang.size(); ++i){
            if(i == 3){
                break;
            }
            s += ", " + nhomNganhTang.get(i).getTenNhomNganh();
        }
        NhomVN30 nhomVN30 = new NhomVN30();
        if(nhomVN30.getSoMaTang() > nhomVN30.getSoMaGiam()){
            s += " và những cổ phiếu thuộc nhóm VN30";
        }
        s += " khiến chỉ số thị trường có những bước tiến rõ rệt.";
        tapCau.add(s);
    }

    public void cau7(){
        if(nhomNganhGiam.size() == 0){
            return;
        }
        String s = "Xét theo nhóm ngành, nhóm " + nhomNganhGiam.get(0).getTenNhomNganh() + " là đầu tàu giảm điểm với mức giảm "
                + (- nhomNganhGiam.get(0).getTongThayDoi()) + " điểm.";
        tapCau.add(s);
    }

    public void cau8(){
        if(nhomNganhTang.size() == 0){
            return;
        }
        long tongVonHoaThiTruong = 0;
        for(int i = 0; i < nhomNganhGiam.size(); ++i){
            tongVonHoaThiTruong += nhomNganhGiam.get(i).getTongVonHoa();
        }
        for(int i = 0; i < nhomNganhTang.size(); ++i){
            tongVonHoaThiTruong += nhomNganhTang.get(i).getTongVonHoa();
        }

        String s = "Cụ thể, đối với TTCK, các nhóm cổ phiếu";
        int tiLeVonHoa = 0;
        for(int i = 0; i < nhomNganhTang.size(); ++i){
            if(i == 3){
                break;
            }
            s += " " + nhomNganhTang.get(i).getTenNhomNganh();
            tiLeVonHoa += nhomNganhTang.get(i).getTongVonHoa() / tongVonHoaThiTruong;
        }
        s += " hiện chiếm khoảng " + tiLeVonHoa
                + "% vốn hóa trên thị trường chứng khoán, do đó khi có thông tin tốt thì nhóm ngành này sẽ lập tức đẩy TTCK tăng mạnh.";
        tapCau.add(s);
    }

    public String getTag(){
        return Mau8.tag;
    }
}