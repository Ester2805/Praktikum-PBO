/* File : Lingkaran.java
* Deskripsi : implementasi Lingkaran sebagai BangunDatar
* Ester Imelda Br Sihotang / 24060123140127
*/
public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }

    public double hitungKeliling() {
        return 2 * jejari * 3.14;
    }
}