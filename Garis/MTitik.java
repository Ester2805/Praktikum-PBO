package Garis;
/* Nama File : MTitik.java
 * Deskripsi : Berisi atribut dan method dalam class Titik
 * Pembuat   : Ester Imelda Br Sihotang 
 * Tanggal   : 18 Februari 2025
 */

public class MTitik {
    public static void main (String[] args) {
        Titik T1 = new Titik();// Membuat objek titik T1 (0,0)
        T1.setAbsis(-2); ///mengubah absis T1 dengan nilai 3
        T1.setOrdinat(10);// mengubah ordinat T1 dengan nilai 4
        System.out.println("T1 berada di kuadran: " + T1.getKuadran());
        T1.printTitik();// mencetak koordinat T1 ke layar
        T1.geser(3, 4); //menggeseer T1 sejauh (3,4)
        T1.printTitik(); //menampilkan koordinat T1 setelah digeser
        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();
        T1.refleksix();
        T1.printTitik();
        T1.refleksiy();
        T1.printTitik();
        Titik T3 = new Titik(); //membuat objek T1(0,0)
        Titik T4 = new Titik (3,5) ; 

        System.out.println("Jumlahh Objek Titik = " + Titik.getcounterTitik());
        System.out.println("Jumlahh Objek Titik = " + T4.getcounterTitik());   
        System.out.println("Jarak Pusat dari T3 " + T3.getJarakPusat());  
        System.out.println("Jarak dari Titik " + T3.getJarak(T4));   
        System.out.println("Koordinat T1 sebelum refleksi:");
        T1.printTitik();   
        Titik T1_refleksix = T1.getRefleksix();
        System.out.println("Koordinat T1 setelah refleksi terhadap sumbu x:");
        T1_refleksix.printTitik();
        Titik T1_refleksiy = T1.getRefleksiy();
        System.out.println("Koordinat T1 setelah refleksi terhadap sumbu y:");
        T1_refleksiy.printTitik();
    }
}
