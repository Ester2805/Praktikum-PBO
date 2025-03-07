public class MataKuliah {
    private String idMatKul;
    private String nama;
    private int sks;

    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Getter untuk SKS
    public int getSks() {
        return sks;
    }
}
