public class PassByValueInt {
    public static void main(String[] args) {
        // Variabel awal
        int angka = 50;

        // Menampilkan nilai sebelum metode dipanggil
        System.out.println("Sebelum metode dipanggil:");
        System.out.println("angka = " + angka);

        // Memanggil metode untuk mencoba mengubah nilai
        ubahNilai(angka);

        // Menampilkan nilai setelah metode dipanggil
        System.out.println("Setelah metode dipanggil:");
        System.out.println("angka = " + angka); // Nilai asli tetap
    }

    // Metode untuk mencoba mengubah nilai
    static void ubahNilai(int nilai) {
        nilai = 99; // Hanya mengubah salinan nilai, bukan variabel asli
        System.out.println("Dalam metode ubahNilai:");
        System.out.println("nilai = " + nilai); // Ini hanya berlaku di dalam metode
    }
}
