public class Dosen {
    private String nip;
    private String nama;
    private String prodi;

    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNip() { return nip; }
    public void setNip(String nip) { this.nip = nip; }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public String getProdi() { return prodi; }
    public void setProdi(String prodi) { this.prodi = prodi; }

    public void printDosen() {
        System.out.println("Dosen Wali: " + nama + " - NIP: " + nip + " - Prodi: " + prodi);
    }
}
