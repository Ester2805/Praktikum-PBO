import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//nama : Ester Imelda Br Sihotang
//nim : 240060123140127
//tanggal : 17/03/2025

public class Petani extends Manusia implements Pajak{
    private String asal_kota;
    private static int counterPetani;
    private int B = 6;

    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public String getAsal_kota(){
        return this.asal_kota;
    }   

    public void setAsal_kota(String asal_kota){
        this.asal_kota = asal_kota;
    }

    @Override
    public double hitungPajak(){
        return 0;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Asal Kota : " + getAsal_kota());
        System.out.println("Pajak : " + hitungPajak());
    }

    @Override
    public int HitungMasaKerja(){
        return (int) ChronoUnit.YEARS.between(getTgl_mulai_kerja(), LocalDate.now())+B;
    }

    public static int getCounterPetani(){
        return counterPetani;
    }
}