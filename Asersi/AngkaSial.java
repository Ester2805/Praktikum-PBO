//Nama File:AngkaSial.java
//Deskripsi: Program penggunaan exception buatan sendiri.Pengenalan klausa 'throw' dan 'throws'
//Nama/ NIM: Ester Imelda Br Sihotang /2406012314027
//Tanggal: 4 Maret 2025
public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
        }
        System.out.println("hati-hati memasukkan angka !!!");
    }
}

/*Baris 12 dieksekusi jika angka yang dimasukkan bukan angka sial (angka 13).
Namun, jika angka 13 dimasukkan, baris 12 tidak dieksekusi karena program langsung melemparkan (throw) eksepsi AngkaSialException, dan proses berpindah ke blok catch.
Baris 21 dieksekusi setelah blok try-catch selesai, tidak peduli apakah eksepsi terjadi atau tidak.
Ini karena baris 21 berada di luar blok try-catch, jadi baris ini selalu dieksekusi.
*/