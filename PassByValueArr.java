public class PassByValueArr {
    public static void main(String[] args) {
        // Array awal
        int[] angka = {10, 20, 30, 40};

        // Menampilkan array sebelum metode dipanggil
        System.out.println("Sebelum metode dipanggil:");
        System.out.println("angka[1] = " + angka[1]); // Menampilkan elemen ke-2

        // Memanggil metode untuk mengubah elemen indeks ke-1
        ubahIndex(angka);

        // Menampilkan array setelah metode dipanggil
        System.out.println("Setelah metode dipanggil:");
        System.out.println("angka[1] = " + angka[1]); // Menampilkan elemen ke-2 lagi
    }

    // Metode untuk mengubah nilai elemen indeks ke-1
    static void ubahIndex(int[] arr) {
        arr[1] = 99; // Mengubah elemen ke-2 array
    }
}
