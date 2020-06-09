package thongtin;

public class Gia {
    private float thamChieu, moCua, dongCua, tran, san;
    private float thayDoiDiem, tiLeThayDoi;

    public Gia(float thamChieu, float moCua, float dongCua, float tran, float san, float thayDoiDiem, float tiLeThayDoi){
        this.thamChieu = thamChieu;
        this.moCua = moCua;
        this.dongCua = dongCua;
        this.tran = tran;
        this.san = san;
        this.thayDoiDiem = thayDoiDiem;
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

    public float getThayDoiDiem() {
        return thayDoiDiem;
    }

    public float getTiLeThayDoi() {
        return tiLeThayDoi;
    }
}
