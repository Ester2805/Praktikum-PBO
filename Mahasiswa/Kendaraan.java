/* Nama File : Kendaraan.java
 * Deskripsi : Berisi atribut dan method dalam class Kendaraan
 * Pembuat   : Ester Imelda Br Sihotang
 * Tanggal   : 25 Februari 2025
 */
public class Kendaraan {
    private String noPlat;
    private String jenis;

    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getNoPlat() { return noPlat; }
    public void setNoPlat(String noPlat) { this.noPlat = noPlat; }
    public String getJenis() { return jenis; }
    public void setJenis(String jenis) { this.jenis = jenis; }

    public void printKendaraan() {
        System.out.println("Kendaraan: " + jenis + " - No Plat: " + noPlat);
    }
}
