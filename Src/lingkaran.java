public class lingkaran extends bangun_datar {
    protected double r;

    public lingkaran (double r, String nama){
        super.setNama(nama);
        this.r = r;
        this.hitungluas();
        this.hitungkeliling();
    }

    public void hitungluas(){
        luas = 3.14 * r * r;
    }

    public void hitungkeliling(){
        keliling = 2 * 3.14 * r;
    }

}
