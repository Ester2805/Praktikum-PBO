/* Nama File : DosenTamu.java
 * Deskripsi : Berisi atribut dan method dalam subclass Dosen Tamu
 * Pembuat : Ester Imelda Br Sihotang / 24060123140127
 * Tanggal : Selasa, 12 Maret 2025
 */

 import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DosenTamu extends Dosen {
    private String NIDK;
    private int kontrakKerja;

    // Konstruktor tanpa parameter
    public DosenTamu() {
        super();
    }

    // Konstruktor dengan parameter
    public DosenTamu(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, int gajiPokok, String fakultas, String NIDK, int kontrakKerja) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.kontrakKerja = kontrakKerja;
    }

    public void setKontrakKerja(int kontrakKerja) {
        this.kontrakKerja = kontrakKerja;
    }

    public String getNIDK() {
        return NIDK;
    }

    public int getKontrakKerja() {
        return kontrakKerja;
    }

    public LocalDate AkhirKontrak() {
        return getTmt().plusMonths(kontrakKerja);
    }

    public double hitungtunjangan() {
        return 0.025 * getGajiPokok();
    }

    @Override
    public void printInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        super.printInfo();  // Memanggil printInfo() dari class Dosen
        System.out.println("NIDK          : " + NIDK);
        System.out.println("Jabatan       : Dosen Tamu");
        System.out.println("Durasi Kontrak: " + kontrakKerja + " bulan");
        System.out.println("Akhir Kontrak : " + AkhirKontrak().format(formatter));
        System.out.println("Tunjangan     : 2,5%  x " + 
                            String.format("%,.2f", getGajiPokok()) + " = Rp " + 
                            String.format("%,.2f", hitungtunjangan()));
    }
}
