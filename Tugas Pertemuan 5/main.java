//nama : Ester Imelda Br Sihotang
//nim : 240060123140127
//tanggal : 17/03/2025

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        PNS p1 = new PNS("Mega", LocalDate.of(1999, 6, 10), "Jl. Medan", 15000000, "198302032006041002");
        Pengusaha pe1 = new Pengusaha("Wati", LocalDate.of(2005, 5, 28), "Jl.Raya", 55000000, "000-556-773-212-000-5");
        Petani pt1 = new Petani("Cimeng", LocalDate.of(1977, 1, 9), "Jl. Indra Kasih", 5000000, "Wonogiri");
        PNS p2 = new PNS("Kila", LocalDate.of(2010, 4, 1), "", 10000000, "198004212010041002");

        p2.setAlamat("Jl. Sipodang 28 Tembalang");

        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());

        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());
        System.out.println("Pajak PNS p2 = " + p2.hitungPajak());

        System.out.println("Masa Kerja p1 = " + p1.HitungMasaKerja());
        System.out.println("Masa Kerja pe1 = " + pe1.HitungMasaKerja());
        System.out.println("Masa Kerja pt1 = " + pt1.HitungMasaKerja());
        System.out.println("Masa Kerja p2 = " + p2.HitungMasaKerja());

        p1.cetakInfo();
        pe1.cetakInfo();
        pt1.cetakInfo();
        p2.cetakInfo();
    }
}