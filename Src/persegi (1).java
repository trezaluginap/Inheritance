public class persegi extends bangun_datar {
    protected double sisi;

    public persegi(String name, double sisi) {
        super.setNama(name);
        this.sisi = sisi;

        hitungLuas();
        hitungKeliling();
    }

    public void hitungLuas() {
        super.luas = this.sisi * this.sisi;
    }

    public void hitungKeliling() {
        super.keliling = this.sisi * 4;
    }
}