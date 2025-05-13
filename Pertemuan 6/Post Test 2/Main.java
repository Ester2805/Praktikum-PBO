public class Main {
    public static void main(String[] args) {
        System.out.println("===== Kucing =====");
        Anabul kucing1 = new Kucing("Meong");
        kucing1.gerak();
        kucing1.bersuara();

        System.out.println("\n===== Anjing =====");
        Anabul anjing1 = new Anjing("Guk");
        anjing1.gerak();
        anjing1.bersuara();

        System.out.println("\n===== Burung =====");
        Anabul burung1 = new Burung("Cit");
        burung1.gerak();
        burung1.bersuara();
    }
}