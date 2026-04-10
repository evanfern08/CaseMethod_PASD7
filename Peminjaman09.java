class Peminjaman09 {
    Mahasiswa09 mhs;
    Buku09 buku;
    int lamaPinjam;
    int batasPinjam = 5;  // batas peminjaman sampai 5 hari
    int terlambat;
    int denda;

    // untuk mengisi data peminjamannya
    Peminjaman09(Mahasiswa09 mhs, Buku09 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda(); // langsung menghitung denda saat sudah di input objeknya
    }

    // untuk menghitung denda keterlambatan
    void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000; // denda 2000 perhari keterlambatan
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    // untuk menampilkan data peminjaman
    void tampilPeminjaman() {
        System.out.println(mhs.nama + " | " + buku.judul +
            " | Lama: " + lamaPinjam + " | Terlambat: " + terlambat + " | Denda: " + denda);
    }
}
