import java.util.Scanner;

public class Main09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Data Mahasiswa
        Mahasiswa09[] mhs = {
            new Mahasiswa09("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa09("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa09("22003", "Citra", "Sistem Informasi Bisnis")
        };

        // Data Buku
        Buku09[] buku = {
            new Buku09("B001", "Algoritma", 2020),
            new Buku09("B002", "Basis Data", 2019),
            new Buku09("B003", "Pemrograman", 2021),
            new Buku09("B004", "Fisika", 2024)
        };

        // Data Peminjaman
        Peminjaman09[] pinjam = {
            new Peminjaman09(mhs[0], buku[0], 7),
            new Peminjaman09(mhs[1], buku[1], 3),
            new Peminjaman09(mhs[2], buku[2], 10),
            new Peminjaman09(mhs[2], buku[3], 6),
            new Peminjaman09(mhs[0], buku[1], 4)
        };

        int pilih;
        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("\nDaftar Mahasiswa:");
                    for (Mahasiswa09 m : mhs) {
                        m.tampilMahasiswa();
                    }
                    break;

                case 2:
                    System.out.println("\nDaftar Buku:");
                    for (Buku09 b : buku) {
                        b.tampilBuku();
                    }
                    break;

                case 3:
                    System.out.println("\nData Peminjaman:");
                    for (Peminjaman09 p : pinjam) {
                        p.tampilPeminjaman();
                    }
                    break;

                case 4:
                    System.out.println("\nSetelah diurutkan (Denda terbesar):");
                    Algoritma09.insertionSort(pinjam);      // Sorting dengan Insertion Sort
                    for (Peminjaman09 p : pinjam) {
                        p.tampilPeminjaman();
                    }
                    break;

                case 5:
                    System.out.print("Masukkan NIM: ");
                    String nimCari = sc.next();
                    // sebelum binary search, mengurutkan dulu berdasar NIM
                    Algoritma09.sortByNIM(pinjam);          // urutkan dulu berdasarkan NIM
                    Algoritma09.binarySearch(pinjam, nimCari);
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 0);

        sc.close();
    }
}
