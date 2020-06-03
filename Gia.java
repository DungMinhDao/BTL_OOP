public class Gia {
    private float tham_chieu, mo_cua, dong_cua, tran, san;
    private float thay_doi_diem, ti_le_thay_doi;

    public Gia(float tham_chieu, float mo_cua, float dong_cua, float tran, float san, float thay_doi_diem, float ti_le_thay_doi){
        this.tham_chieu = tham_chieu;
        this.mo_cua = mo_cua;
        this.dong_cua = dong_cua;
        this.tran = tran;
        this.san = san;
        this.thay_doi_diem = thay_doi_diem;
        this.ti_le_thay_doi = ti_le_thay_doi;
    }

    public float getTham_chieu() {
        return tham_chieu;
    }

    public float getMo_cua() {
        return mo_cua;
    }

    public float getDong_cua() {
        return dong_cua;
    }

    public float getTran() {
        return tran;
    }

    public float getSan() {
        return san;
    }

    public float getThay_doi_diem() {
        return thay_doi_diem;
    }

    public float getTi_le_thay_doi() {
        return ti_le_thay_doi;
    }
}
