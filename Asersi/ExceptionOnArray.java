//Nama File:ExceptionOnArray.java
//Deskripsi: Program penggunaan eksepsi menggunakan class libary Java
//Nama/ NIM: Ester Imelda Br Sihotang /2406012314027
//Tanggal: 4 Maret 2025
public class ExceptionOnArray {
    public static void main(String[] args) {
        int[] array = new int[5];
        try {
            System.out.println("Akses elemen ke-5: " + array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception yang ditangkap: " + e);
        }
        System.out.println("clean up code");
    }
}
