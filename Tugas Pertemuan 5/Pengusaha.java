import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//nama : Ester Imelda Br Sihotang
//nim : 240060123140127
//tanggal : 17/03/2025

public class Pengusaha extends Manusia implements Pajak{ 
    private String npwp;
    private static int counterPengusaha;
    private int C = 0;

    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp(){
        return this.npwp;
    }

    public void setNpwp(String npwp){
        this.npwp = npwp;
    }

    @Override
    public double hitungPajak(){
        return getPendapatan() * 0.15;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP : " + getNpwp());
        System.out.println("Pajak : " + hitungPajak());
    }

    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    @Override
    public int HitungMasaKerja(){
        return (int) ChronoUnit.YEARS.between(getTgl_mulai_kerja(), LocalDate.now())+C;
    }
}