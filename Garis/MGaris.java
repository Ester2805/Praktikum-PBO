package Garis;

/* Nama File : MGaris.java
 * Deskripsi : Berisi contoh penggunaan kelas Garis
 * Pembuat   : Ester Imelda Br Sihotang
 * Tanggal   : 18 Februari 2025
 */
public class MGaris {
    public static void main(String[] args) {
        // Membuat objek Garis menggunakan konstruktor tanpa parameter
        Garis garis1 = new Garis();
        System.out.println("Garis 1:");
        garis1.printKoordinat();
        System.out.println("Panjang Garis 1: " + garis1.getPanjang());
        System.out.println("Gradien Garis 1: " + garis1.getGradien());
        System.out.println("Titik Tengah Garis 1: (" + garis1.getTitikTengah().getAbsis() + ", " +
                garis1.getTitikTengah().getOrdinat() + ")");
        System.out.println("Persamaan Garis 1: " + garis1.getPersamaanGaris());
        System.out.println();

        // Membuat objek Garis untuk garis kedua menggunakan konstruktor dengan parameter
        Titik t1 = new Titik(-2, 0);
        Titik t2 = new Titik(0, 4);

        // Membuat objek Garis menggunakan konstruktor dengan parameter
        Garis garis2 = new Garis( );
        System.out.println("Garis 2:");
        garis2.printKoordinat();
        System.out.println("Panjang Garis 2: " + garis2.getPanjang());
        System.out.println("Gradien Garis 2: " + garis2.getGradien());
        System.out.println("Titik Tengah Garis 2: (" + garis2.getTitikTengah().getAbsis() + ", " +
                garis2.getTitikTengah().getOrdinat() + ")");
        System.out.println("Persamaan Garis 2: " + garis2.getPersamaanGaris());

        // Mengecek apakah kedua garis sejajar atau tegak lurus
        System.out.println("Apakah Garis 1 sejajar dengan Garis 2? " +
                (garis1.isSejajar(garis2) ? "Ya" : "Tidak"));
        System.out.println("Apakah Garis 1 tegak lurus dengan Garis 2? " +
                (garis1.isTegakLurus(garis2) ? "Ya" : "Tidak"));

        // Menampilkan jumlah objek Garis yang telah dibuat
        System.out.println("Jumlah objek Garis yang telah dibuat: " + Garis.getCounterGaris());
    }
}
