class Buku09 {
    String kodeBuku;
    String judul;
    int tahunTerbit;

    // Method untuk mengisi data buku
    Buku09(String kode, String judul, int tahun) {
        this.kodeBuku = kode;
        this.judul = judul;
        this.tahunTerbit = tahun;
    }
    // Method untuk menampilkan data buku
    void tampilBuku() {
        System.out.println("Kode: " + kodeBuku + " | Judul: " + judul + " | Tahun: " + tahunTerbit);
    }
}
