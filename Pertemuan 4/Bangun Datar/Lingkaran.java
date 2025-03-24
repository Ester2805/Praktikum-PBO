/* 
* Nama File    : Lingkaran.java
* Deskripsi    : berisi atribut dan method dalam class Bangun Ruang
* Pembuat      : Ester Imelda Br Sihotang / 24060123140127
* Tanggal      : 11 Maret 2025
*/
public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran(double jari, String warna, String border) {
        super();
        this.jari = jari;
        setWarna(warna);
        setBorder(border);
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    public double getLuas() {
        return Math.PI * jari * jari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
    }
}
