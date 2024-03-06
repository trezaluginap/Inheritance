public class bangun_datar{
    protected double luas;
    protected double keliling;
    protected String nama;

    public double getluas(){
        return this.luas;
    }

    public double getkeliling(){
        return this.keliling;
    }

    public void setNama (String nama){
        this.nama = nama;
    }

    public void getinfo(){
        System.out.println("nama :" + this.nama);
        System.out.println("luas :" + this.luas);
        System.out.println("keliling :" + this.keliling);
    }
}