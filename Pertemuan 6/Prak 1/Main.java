public class Main {
    public static void main(String[] args) {
        Person p;
        p = new Student("Mutu");
        p.status(1);
    }
}

// Outputnya adalah Now online: mutu
// bagaimana hasil tersebut didapatkan (hint: apakah “this” pada kelas person dalam
// method status dieksekusi ketika compile time atau runtime)
// hasil tersebut didapat karena "this" di status() menunjukke objek Student,
// bukan hanya ke kelas Person. Oleh karena itu, isAsleep() yang dipanggil adalah milih Student.