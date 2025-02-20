package Garis;

/* Nama File : Garis.java
 * Deskripsi : Berisi atribut dan method dalam class Garis
 * Pembuat   : Ester Imelda Br Sihotang
 * Tanggal   : 18 Februari 2025
 */
public class Garis {

    public class Titik {
        private double absis;
        private double ordinat;

        public Titik() {
            this.absis = 0;
            this.ordinat = 0;
        }

        public Titik(double absis, double ordinat) {
            this.absis = absis;
            this.ordinat = ordinat;
        }

        public double getAbsis() {
            return absis;
        }

        public double getOrdinat() {
            return ordinat;
        }

        public void setAbsis(double absis) {
            this.absis = absis;
        }

        public void setOrdinat(double ordinat) {
            this.ordinat = ordinat;
        }
    }

    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    // Konstruktor tanpa parameter
    Garis() {
        this.titikAwal = new Titik(0, 0); // Default titik awal
        this.titikAkhir = new Titik(1, 1); // Default titik akhir
        counterGaris++;
    }

    // Konstruktor dengan parameter
    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;

    }

    // Selektor (getter)
    Titik getTitikAwal() {
        return titikAwal;
    }

    Titik getTitikAkhir() {
        return titikAkhir;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    // Mutator (setter)
    void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    // Menghitung panjang garis
    double getPanjang() {
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    // Menghitung gradien garis
    double getGradien() {
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        if (deltaX == 0) {
            throw new ArithmeticException("Gradien tidak terdefinisi (garis vertikal).");
        }
        return deltaY / deltaX;
    }

    // Mendapatkan garis tengah dari garis
    Titik getTitikTengah() {
        double midX = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double midY = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(midX, midY);
    }

    // Mengecek apakah garis sejajar dengan garis lain
    boolean isSejajar(Garis garisLain) {
        return Double.compare(this.getGradien(), garisLain.getGradien()) == 0;
    }

    // Mengecek apakah garis tegak lurus dengan garis lain
    boolean isTegakLurus(Garis garisLain) {
        return Double.compare(this.getGradien() * garisLain.getGradien(), -1) == 0;
    }

    // Menampilkan koordinat awal dan akhir garis
    void printKoordinat() {
        System.out.println("Garis Awal: (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + ")");
        System.out.println("Garis Akhir: (" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");
    }

    // Menampilkan persamaan garis dalam bentuk string y = mx + c
    String getPersamaanGaris() {
        double m = getGradien();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        return "y = " + m + "x + " + c;
    }
}


