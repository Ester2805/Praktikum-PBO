/* Nama File : Main.java
 * Deskripsi : Berisi Main dalam class Main Pegawai
 * Pembuat : Ester Imelda Br Sihotang / 24060123140127
 * Tanggal : Selasa, 12 Maret 2025
 */

 import java.time.LocalDate;

 public class Main {
     public static void main(String[] args) {
         System.out.println("\n=== Objek Pegawai ===");
         Pegawai P1 = new Pegawai("8720847152", "Budiman", 
             LocalDate.parse("1985-04-12"), LocalDate.parse("2013-07-01"), 5000000);
         P1.printInfo();
 
         System.out.println("\n=== Objek Dosen ===");
         Dosen d1 = new Dosen("8765672548", "Sitiyahh", 
             LocalDate.parse("1978-08-22"), LocalDate.parse("2017-09-15"), 7000000, "Fakultas Teknik");
         d1.printInfo();
 
         System.out.println("\n=== Objek Dosen Tetap ===");
         DosenTetap dTetap1 = new DosenTetap("9545647548", "Hacibana", 
             LocalDate.parse("1993-07-09"), LocalDate.parse("2018-11-03"), 8500000, "Fakultas Teknik Mesin", "78647324");
         dTetap1.printInfo();
 
         System.out.println("\n=== Objek Dosen Tamu ===");
         DosenTamu dTamu1 = new DosenTamu("9585624376", "Anita Anwar", 
             LocalDate.parse("1997-03-21"), LocalDate.parse("2022-06-21"), 1500000, "Fakultas Informatika", "76539876", 8);
         dTamu1.printInfo();
     }
 }
 