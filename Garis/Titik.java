package Garis;
/* Nama File : Titik.java
 * Deskripsi : Berisi atribut dan method dalam class Titik
 * Pembuat   : Ester Imelda Br Sihotang 
 * Tanggal   : 18 Februari 2025
 */
public class Titik {
    /***************ATRIBUT*************** */
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /***************METHOD*************** */
    //konstruktor untuk membuat nilai absis dan ordinat tertentu
    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //konstruktor untuk membuat titik (0,0)
    Titik() {
        this(0,0);
    }

    //mengembalikan nilai counterTitik
    static int getcounterTitik() {
        return counterTitik ;
    }

    //mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejuah x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
    void printcounterTitik() {
        System.out.println(counterTitik);
    }

    int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        }
        else if (absis < 0 && ordinat > 0){
            return 2;
        }
        else if (absis < 0 && ordinat < 0) {
            return 3;
        }
        else if (absis > 0 && ordinat < 0){
            return 4;
        }else{
            return 0;
        }
    }

    double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    double getJarak(Titik t) {
        double dx = this.absis - t.absis;
        double dy = this.ordinat - t.ordinat;
        return Math.sqrt(dx * dx + dy * dy);
    }

    void refleksix() {
        ordinat = -ordinat;
    }

    void refleksiy() {
        absis = -absis;
    }

    Titik getRefleksix() {
        return new Titik(absis, -ordinat);
    }

    Titik getRefleksiy() {
        return new Titik(-absis, ordinat);
    }
} // end class titik
