public class KasirOverloading {
    // Variabel global untuk menyimpan total belanja
    static int totalBelanja = 0;

    public static void main(String[] args) {
        // Contoh pemanggilan metode
        hitungBelanja("Baju", 100000); // Barang tanpa diskon
        hitungBelanja("Celana", 200000, 10); // Barang dengan diskon 10%
        
        // Menampilkan total belanja
        System.out.println("Total belanja: Rp" + totalBelanja);
    }

    // Metode overloading 1: Menghitung harga barang tanpa diskon
    static void hitungBelanja(String namaBarang, int hargaBarang) {
        System.out.println("Barang: " + namaBarang);
        System.out.println("Harga: Rp" + hargaBarang);
        totalBelanja += hargaBarang; // Menambahkan harga ke total belanja
    }

    // Metode overloading 2: Menghitung harga barang dengan diskon
    static void hitungBelanja(String namaBarang, int hargaBarang, int persenDiskon) {
        int diskon = (hargaBarang * persenDiskon) / 100; // Menghitung diskon
        int hargaSetelahDiskon = hargaBarang - diskon; // Harga setelah diskon
        System.out.println("Barang: " + namaBarang);
        System.out.println("Harga sebelum diskon: Rp" + hargaBarang);
        System.out.println("Diskon: " + persenDiskon + "% (Rp" + diskon + ")");
        System.out.println("Harga setelah diskon: Rp" + hargaSetelahDiskon);
        totalBelanja += hargaSetelahDiskon; // Menambahkan harga setelah diskon ke total belanja
    }
}
