/**
 * File     : Asersi2.java
 * Deskripsi: Program untuk demo asersi, yang akan menolak input 
 *            jari-jari lingkaran yang bernilai nol
 * Nama/NIM: Ester Imelda Br Sihotang /2406012314027
*Tanggal: 4 Maret 2025
 */

// class Lingkaran
class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

// class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;  
        assert (jariJari > 0) : "Jari-jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}

//Jawabannya Secara konsep, penggunaan asersi pada program Asersi2 di atas kurang tepat.
//Asersi seharusnya digunakan untuk mengecek kondisi internal program yang diharapkan selalu benar oleh programmer.
//Validasi input dari pengguna (seperti memastikan jari-jari lebih dari nol) sebaiknya dilakukan dengan if-else atau mekanisme exception handling.
//Dengan menggunakan if-else, program bisa memberikan pesan kesalahan yang lebih ramah pengguna dan tetap berjalan normal tanpa ketergantungan pada flag -enableassertions.