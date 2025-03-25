/* Nama : Ester Imelda Br Sihotang 
 * Nim : 24060123140127
 * Tanggal: 25 Maret 2025
 */

 public class UMain {
    public static void main(String[] args) {
        // Membuat Fakultas
        Fakultas fakultasTeknik = new Fakultas("Fakultas Teknik Mesin", 5000000, 7000000);
        Fakultas fakultasSains = new Fakultas("Fakultas Kedokteran", 45000000, 6500000);

        Fakultas[] daftarFakultas = {fakultasTeknik, fakultasSains};

        // Membuat Dosen
        Dosen dosen1 = new Dosen("Dr. Ester", "ester@undip.ac.id", "12805", 10, "Fakultas Teknik Mesin");
        Dosen dosen2 = new Dosen("Dr. Imelda", "melda@undip.ac.id", "65082", 5, "Fakultas Kedokteran");

        // Membuat Tendik
        Tendik tendik1 = new Tendik("Pak Hotang", "hotang@undip.ac.id", "05037", 19);
        Tendik tendik2 = new Tendik("Bu Laban", "Laban@undip.ac.id", "01604", 7);

        Karyawan[] daftarKaryawan = {dosen1, dosen2, tendik1, tendik2};

        // Membuat Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Killa", "laaki@student.undip.ac.id", "24060123140127", 3, "Fakultas Teknik Mesin");
        Mahasiswa mahasiswa2 = new Mahasiswa("Nanut", "n4nUt@student.undip.ac.id", "24060122140789", 2, "Fakultas Kedokteran");

        // Membuat Universitas
        Universitas undip = new Universitas("Universitas Diponegoro", daftarFakultas, daftarKaryawan);

        // Menampilkan informasi Universitas
        System.out.println("===== INFORMASI UNIVERSITAS =====");
        System.out.println("Nama Universitas: " + undip.getNama());

        // Menampilkan informasi Fakultas
        System.out.println("\n===== INFORMASI FAKULTAS =====");
        for (Fakultas f : undip.getFakultas()) {
            System.out.println("Nama Fakultas: " + f.getNama());
            System.out.println("Tarif UKT: Rp" + f.getTarifUKT());
            System.out.println("Gaji Pokok Dosen: Rp" + f.getGajiPokok());
            System.out.println("--------------------------------");
        }

        // Menampilkan informasi Karyawan
        System.out.println("\n===== INFORMASI KARYAWAN =====");
        for (Karyawan k : undip.getKaryawan()) {
            k.getInfo();
            System.out.println("Gaji: Rp" + k.hitungGaji(7000000)); // Contoh dengan gaji pokok 7 juta
            System.out.println("--------------------------------");
        }

        // Menampilkan informasi Mahasiswa
        System.out.println("\n===== INFORMASI MAHASISWA =====");
        mahasiswa1.getInfo();
        System.out.println("UKT yang harus dibayar: Rp" + mahasiswa1.hitungUKT(fakultasTeknik.getTarifUKT()));

        System.out.println();
        mahasiswa2.getInfo();
        System.out.println("UKT yang harus dibayar: Rp" + mahasiswa2.hitungUKT(fakultasSains.getTarifUKT()));
    }
}