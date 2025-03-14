/* 
 * Nama File    : Mmain.java
 * Deskripsi    : berisi aplikasi dalam class Inheritance BangunDatar
 * Pembuat      : Ester Imelda Br Sihotang / 24060123140127
 * Tanggal      : 11 Maret 2025
 */

 public class Mmain {
    public static void main(String[] args) {
        System.out.println("======= Membuat Objek Bangun Datar =======");
        BangunDatar B1 = new BangunDatar();
        B1.setJmlSisi(3);
        B1.setBorder("Hitam");
        B1.setWarna("Putih");
        B1.printInfo();
        BangunDatar.printCounterBangunDatar();

        System.out.println("========== Membuat Objek Persegi ==========");
        System.out.println("Persegi P1:");
        Persegi P1 = new Persegi(8, "Merah", "Putih" );
        P1.setBorder("Biru");
        P1.printInfo();
        System.out.println("Diagonal: " + P1.getDiagonal());
        System.out.println("Keliling: " + P1.getKeliling());
        System.out.println("Luas: " + P1.getLuas());
        BangunDatar.printCounterBangunDatar();

        System.out.println("========= Membuat Objek Lingkaran =========");
        System.out.println("Lingkaran L1:");
        Lingkaran L1 = new Lingkaran(6, "Merah", "Putih" ); // Jari-jari diatur langsung dalam konstruktor
        L1.setBorder("Biru");
        L1.printInfo();
        System.out.println("Jari-jari: " + L1.getJari());
        System.out.println("Keliling: " + L1.getKeliling());
        System.out.println("Luas: " + L1.getLuas());
        BangunDatar.printCounterBangunDatar();
    }
}
