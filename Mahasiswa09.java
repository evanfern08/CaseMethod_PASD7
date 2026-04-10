class Mahasiswa09 {
    String nim;
    String nama;
    String prodi;

    // inisalisasi data mahasiswa
    Mahasiswa09(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    // untuk menampikan data mahasiswa
    void tampilMahasiswa() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + prodi);
    }
}