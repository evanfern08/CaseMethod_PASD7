class Algoritma09 {
    static void insertionSort(Peminjaman09[] arr) {   // Insertion sort mengurutkan data berdasarkan denda terbesar
        for (int i = 1; i < arr.length; i++) { 
            Peminjaman09 key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].denda < key.denda) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // mengurutkan data berdasarkan NIM mahasiswa untuk keperluan binary search
    static void sortByNIM(Peminjaman09[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Peminjaman09 key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].mhs.nim.compareTo(key.mhs.nim) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // binary Search untuk mencari data peminjaman berdasarkan NIM mahasiswa
    static void binarySearch(Peminjaman09[] arr, String nimCari) {
        int left = 0, right = arr.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = arr[mid].mhs.nim.compareTo(nimCari);

            if (cmp == 0) {
                arr[mid].tampilPeminjaman();
                found = true;
                break;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Data dengan NIM " + nimCari + " tidak ditemukan.");
        }
    }
}
