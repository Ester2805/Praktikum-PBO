/* Nama : Ester Imelda Br Sihotang 
 * Nim : 24060123140127
 * Tanggal: 25 Maret 2025
 */

 public abstract class CivitasAkademik {
    private String nama;
    private String email;

    private static int staticCounter;

    public CivitasAkademik(String nama, String email) {
        this.nama = nama;
        this.email = email;
        staticCounter++;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getStaticCounter() {
        return staticCounter;
    }

    public void getInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
    }
}