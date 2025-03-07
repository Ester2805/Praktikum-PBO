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
