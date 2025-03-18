/* 
* Nama File    : BangunDatar.java
* Deskripsi    : berisi atribut dan method dalam class Bangun Ruang
* Pembuat      : Ester Imelda Br Sihotang / 24060123140127
* Tanggal      : 11 Maret 2025
*/
public class BangunDatar {
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    public BangunDatar() {
        counterBangunDatar++;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public String getBorder() {
        return border;
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah objek BangunDatar: " + counterBangunDatar);
    }

    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
}


/*
 * Bagian 4 – Access Modifier Protected
 * Modifikasilah atribut class BangunDatar dengan access modifier protected. Setelah modifikasi
 * tersebut, apakah konstruktor berparameter pada kelas Persegi dapat direalisasikan seperti berikut?
 * Mengapa?
 * 
 * Konstruktor dengan parameter pada class persegi tetap bisa direalisasikan, karena salah satu Lingkup 
 * dari protected adalah dapat diakses oleh subclass (pewarisan/inheritance), bahkan jika subclass berada 
 * di paket yang berbeda, karena persegi merupakan subclass dari class BangunDatar, class persegi tetap bisa 
 * mengakses attribut dari class parent nya yaitu BangunDatar.
 * 
 * 
 * Bagian 5 – Keyword Final
 * Keyword final yang diberikan pada kelas menjadikan kelas tersebut tidak dapat diwariskan, sedangkan
 * keyword final yang diberikan pada method menjadikan method tersebut tidak dapat di-override pada
 * subkelasnya.
 * Lakukan eksperimen penggunaan keyword final seperti berikut:
 * 1. Tambahkan keyword final pada kelas BangunDatar. Bagaimana pengaruhnya terhadap kelas
 * Persegi dan Lingkaran?
 * 
 * dengan menambahkan final pada class BangunDatar maka seluruh attribut dan method yang ada di dalam
 * class BangunRuang tidak akan bisa diakses oleh subclass nya yaitu persegi dan lingkaran. Secara singkatnya
 * kita tidak bisa melakukan pewarisan/membuat subclass dari bangundata.
 * 
 * 2. Hapus kembali keyword final pada kelas BangunDatar, lalu tambahkan keyword final pada method
 * printInfo() di dalam kelas BangunDatar. Bagaimana pengaruhnya dengan method printInfo() pada
 * kelas Persegi dan Lingkaran?
 * 
 * program akan mengalami eror pada saat melakukan kompilasi karena class persegi dan lingkaran memiliki mathod printInfo() 
 * yang mengoverride method dari BangunDatar, karena method printInfo dari super class bangunDatar diberikan keyword final
 * maka method itu tidak dapat diakses oleh subclass nya yaitu persegi dan lingkaran. untuk mengatasi itu printInfo() pada
 * class persegi dan lingkaran bisa mengubah nama method nya menjadi printDetail() dan sebagainya atau memberikan tambahan 
 * parameter pada printInfo(....) untuk membedakan bentuknya.
 * public void printDetailPersegi() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }
    public void printDetailLingkaran() {
        super.printInfo();
        System.out.println("Jari - Jari: " + jari);
    }
 * program akan berjalan dengan aman 
 */