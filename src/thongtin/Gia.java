package thongtin;

/**
 * Lớp Gia lưu trữ các thông tin về giá
 *
 * @author
 */
public class Gia {
    private float thamChieu, moCua, dongCua, tran, san;
    private float thayDoi, tiLeThayDoi;

    public Gia(float thamChieu, float moCua, float dongCua, float tran, float san, float thayDoi, float tiLeThayDoi){
        this.thamChieu = thamChieu;
        this.moCua = moCua;
        this.dongCua = dongCua;
        this.tran = tran;
        this.san = san;
        this.thayDoi = thayDoi;
        this.tiLeThayDoi = tiLeThayDoi;
    }

    public float getThamChieu() {
        return thamChieu;
    }

    public float getMoCua() {
        return moCua;
    }

    public float getDongCua() {
        return dongCua;
    }

    public float getTran() {
        return tran;
    }

    public float getSan() {
        return san;
    }

    public float getThayDoi() {
        return thayDoi;
    }

    public float getTiLeThayDoi() {
        return tiLeThayDoi;
    }
}
