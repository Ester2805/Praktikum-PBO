//Nama File:AngkaSialException.java
//Deskripsi: Eksepsi buatan sendiri, menolak amasukan angka 13
//Nama/ NIM: Ester Imelda Br Sihotang /2406012314027
//Tanggal: 4 Maret 2025
public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("Jangan masukkan angka 13 karena angka sial !!!");
    }
}
