/* Nama File : MMahasiswa.java
 * Deskripsi : Berisi atribut dan method dalam class MMahasiswa
 * Pembuat   : Ester Imelda Br Sihotang
 * Tanggal   : 25 Februari 2025
 */
public class MMahasiswa {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("D001", "Dr. Oca", "Informatika");
        Dosen dosen2 = new Dosen("D002", "Dr. Kekey", "Sistem Informasi");
        Dosen dosen3 = new Dosen("D003", "Dr. Ester", "Kedokteran");

        MataKuliah matkul1 = new MataKuliah("MK001", "Pemrograman Dasar", 3);
        MataKuliah matkul2 = new MataKuliah("MK002", "Struktur Data", 3);
        MataKuliah matkul3 = new MataKuliah("MK003", "Basis Data", 3);

        Kendaraan kendaraan1 = new Kendaraan("H1234AB", "Mobil");
        Kendaraan kendaraan2 = new Kendaraan("G5678CD", "Becak");
        Kendaraan kendaraan3 = new Kendaraan("G5678PQ", "Helikopter");

        Mahasiswa mhs1 = new Mahasiswa("A11.2020.12345", "Fajri", "Informatika");
        Mahasiswa mhs2 = new Mahasiswa("A11.2020.12346", "Natasya", "Sistem Informasi");
        Mahasiswa mhs3 = new Mahasiswa("A11.2020.12347", "Kila", "Data Science");

        mhs1.setDosenWali(dosen1);
        mhs2.setDosenWali(dosen2);
        mhs3.setDosenWali(dosen3);

        mhs1.setKendaraan(kendaraan1);
        mhs2.setKendaraan(kendaraan2);
        mhs3.setKendaraan(kendaraan3);

        mhs1.addMatKul(matkul1);
        mhs1.addMatKul(matkul2);

        mhs2.addMatKul(matkul2);
        mhs2.addMatKul(matkul3);

        mhs3.addMatKul(matkul3);

        mhs1.printDetailMhs();
        mhs2.printDetailMhs();
        mhs3.printDetailMhs();
    }
}
