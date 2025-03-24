/* Nama File : Dosen.java
 * Deskripsi : Berisi atribut dan method dalam subclass Dosen dari class Pegawai
 * Pembuat : Ester Imelda Br Sihotang / 24060123140127
 * Tanggal : Selasa, 12 Maret 2025
 */

 import java.time.LocalDate;

 public class Dosen extends Pegawai {
    private String fakultas;

    // Konstruktor default (agar subclass bisa memanggil super())
    public Dosen() {
        super(); // Harus ada konstruktor default di Pegawai juga
    }

    // Konstruktor dengan parameter
    public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, int gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    public int hitungTunjangan(double persen) {
        return (int) (getGajiPokok() * persen);
    }    

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    @Override
    public void printInfo() {
        super.printInfo(); // Panggil printInfo() dari Pegawai
        System.out.println("Fakultas      : " + fakultas);
    }
    

}
