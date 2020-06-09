package loaddata;

import java.io.File;

public class LayDuLieu {
    private LayDuLieuVeChiSo layDuLieuVeChiSo = new LayDuLieuVeChiSo();
    private LayDuLieuVeCongTi layDuLieuVeCongTi = new LayDuLieuVeCongTi();
    public void LayDuLieu(File f1, File f2){
        this.layDuLieuVeChiSo.layMa(f1);
        this.layDuLieuVeCongTi.layMaCongTi(f2);
    }

}
