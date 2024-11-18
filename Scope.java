public class Scope {
    // Variabel global (kelas-scope), dapat diakses di mana saja dalam kelas Scope
    static String defaultNama = "Default";

    public static void main(String[] args) {
        // Variabel lokal dalam metode main()
        String namaUser = "Adit";
        
        // Memanggil metode CekNama
        CekNama(namaUser);

        int i = 0;
        // Contoh penggunaan variabel dalam loop
        for (i = 0; i < 3; i++) {
            // Variabel i hanya dapat diakses di dalam loop for ini
            System.out.println("Loop ke-" + i);
        }
        
        // Tidak bisa mengakses i di sini karena scope-nya hanya di dalam loop
        System.out.println(i); // Ini akan menyebabkan error
    }

    static void CekNama(String nama) {
        // Variabel lokal untuk metode CekNama
        boolean namaBenar = false;

        // Mengecek apakah nama yang diberikan sama dengan defaultNama
        if (nama.equals(defaultNama)) {
            namaBenar = true;
            System.out.println("Nama sesuai dengan default: " + nama);
        } else {
            System.out.println("Nama berbeda: " + nama);
        }

        // Variabel namaBenar hanya bisa digunakan di sini
        System.out.println("Status namaBenar: " + namaBenar);
    }
}
