public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private MataKuliah[] listMatKul = new MataKuliah[50];
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    private int jumlahMatKul = 0;

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosen) {
        this.dosenWali = dosen;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void addMatKul(MataKuliah matkul) {
        if (jumlahMatKul < 50) {
            listMatKul[jumlahMatKul++] = matkul;
        }
    }

    public int getJumlahSKS() {
        int total = 0;
        for (int i = 0; i < jumlahMatKul; i++) {
            total += listMatKul[i].getSks();
        }
        return total;
    }

    public int getJumlahMatKul() {
        return jumlahMatKul;
    }

    public void printDetailMhs() {
        System.out.println(nim + " - " + nama + " - " + prodi);

        if (dosenWali != null) {
            System.out.println("Dosen Wali: " + dosenWali.getNama());
        } else {
            System.out.println("Dosen Wali: Belum diatur");
        }

        if (kendaraan != null) {
            System.out.println("Kendaraan: " + kendaraan.getNoPlat());
        } else {
            System.out.println("Kendaraan: Belum diatur");
        }

        System.out.println("Mata Kuliah:");
        for (int i = 0; i < jumlahMatKul; i++) {
            System.out.println("- " + listMatKul[i].getNama());
        }

        System.out.println("Total SKS: " + getJumlahSKS());
    }
}
