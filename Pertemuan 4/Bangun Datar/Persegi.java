/* 
* Nama File    : Persegi.java
* Deskripsi    : berisi atribut dan method dalam class Persegi
* Pembuat      : Ester Imelda Br Sihotang / 24060123140127
* Tanggal      : 11 Maret 2025
*/
public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi, String warna, String border) {
        super();
        this.sisi = sisi;
        setWarna(warna);
        setBorder(border);
    }

    public double getSisi() {
        return sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getDiagonal() {
        return Math.sqrt(2) * sisi;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }
}
