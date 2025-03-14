/* Nama File : Pegawai.java
 * Deskripsi : Berisi atribut dan method dalam class Super Pegawai
 * Pembuat : Ester Imelda Br Sihotang / 24060123140127
 * Tanggal : Selasa, 12 Maret 2025
 */
import java.time.LocalDate;

public class Pegawai {
    private String nip;
    private String nama;
    private LocalDate tanggalLahir;
    private LocalDate tmt;
    private double gajiPokok;

    // Konstruktor default
    public Pegawai() {}

    public Pegawai(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok) {
        this.nip = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = TMT;
        this.gajiPokok = gajiPokok;
    }
    

    // Getter dan Setter
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public LocalDate getTmt() {
        return tmt;
    }

    public void setTmt(LocalDate tmt) {
        this.tmt = tmt;
    }

    public double getGajiPokok() {
        return this.gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int hitungMasaKerja() {
        return LocalDate.now().getYear() - getTmt().getYear();
    }    

    public void printInfo() {
        System.out.println("NIP           : " + getNip());
        System.out.println("Nama          : " + getNama());
        System.out.println("Tanggal Lahir : " + getTanggalLahir());
        System.out.println("TMT           : " + getTmt());
        System.out.println("Gaji Pokok    : Rp " + String.format("%,.2f", getGajiPokok()));
    }
    
}
