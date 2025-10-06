package Task2;


import javax.swing.plaf.synth.SynthLookAndFeel;
import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class CollectionsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Collections
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * ArrayList, generics, operasi CRUD, dan iterasi collections.
         */

        // ===== PERBEDAAN ARRAY VS ARRAYLIST =====
        System.out.println("=== PERBEDAAN ARRAY VS ARRAYLIST ===");

        // Latihan 1: Demonstrasi keterbatasan array vs keunggulan ArrayList
        // - Buat array integer dengan ukuran tetap 3
        int[] arr = new int[3];
        ArrayList<Integer> arrList = new ArrayList<>();

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        arrList.add(10);
        arrList.add(20);
        arrList.add(30);
        arrList.add(40);
        arrList.add(50);

        System.out.println("Ukuran array:" + arr.length);
        System.out.println("Ukuran ArrayList:" + arrList.size());


        // - Buat ArrayList<Integer> kosong

        // - Coba tambahkan 5 elemen ke array (akan error/terbatas)
        // - Tambahkan 5 elemen ke ArrayList (dinamis)

        // - Print ukuran keduanya dan jelaskan perbedaannya dalam komentar

        // ===== GENERICS DASAR =====
        System.out.println("\\n=== GENERICS DASAR ===");

        // Latihan 2: Memahami generics dan type safety
        // - Buat ArrayList tanpa generics (raw type) dan tambahkan berbagai tipe data
        ArrayList rawList = new ArrayList();
        rawList.add("Teks");
        rawList.add(123);
        rawList.add(45.6);

        ArrayList<String> strList = new ArrayList<>();
        strList.add("Satu");
        strList.add("Dua");
        strList.add("Tiga");

        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(2.5);
        doubleList.add(3.14);
        doubleList.add(7.89);

        System.out.println("RawList:" + rawList);
        System.out.println("String List:" + strList);
        System.out.println("DoubleList:" + doubleList);

        // - Buat ArrayList<String> dengan generics dan tambahkan hanya String

        // - Buat ArrayList<Double> untuk menyimpan nilai desimal

        // - Demonstrasikan type safety dengan mencoba menambahkan tipe yang salah

        // ===== OPERASI CRUD PADA ARRAYLIST =====
        System.out.println("\\n=== OPERASI CRUD PADA ARRAYLIST ===");

        // Latihan 3: Create - Menambah data
        ArrayList<String> daftarMahasiswa = new ArrayList<>();
        daftarMahasiswa.add("Ester");
        daftarMahasiswa.add("Junita");
        daftarMahasiswa.add("Raweli");
        daftarMahasiswa.add("Reynaldi");
        daftarMahasiswa.add("Tina");
        daftarMahasiswa.add(2, "Yanto");
        System.out.println("Daftar Mahasiswa:" + daftarMahasiswa);

        System.out.println("Mahasiswa pertama:" + daftarMahasiswa.get(0));
        System.out.println("Mahasiswa terakhir:" + daftarMahasiswa.get(daftarMahasiswa.size() - 1));
        System.out.println("Apakah ada 'Junita'? " + daftarMahasiswa.contains("Junita"));
        System.out.println("Index 'Reynaldi':" + daftarMahasiswa.indexOf("Reynaldi"));
        System.out.println("Ukuran:" + daftarMahasiswa.size());

        daftarMahasiswa.set(1, "Diana");
        System.out.println("\nSetelah Update:" + daftarMahasiswa);

        daftarMahasiswa.remove(3);
        daftarMahasiswa.remove("Tina");
        System.out.println("Setelah Delete:" + daftarMahasiswa);
        daftarMahasiswa.clear();
        System.out.println("Setelah Clear,kosong?" + daftarMahasiswa.isEmpty() + "\n");

        // - Tambahkan 5 nama mahasiswa menggunakan add()

        // - Tambahkan mahasiswa di posisi tertentu menggunakan add(index, element)

        // - Print daftar mahasiswa

        // Latihan 4: Read - Membaca data
        // - Baca mahasiswa pertama menggunakan get(0)

        // - Baca mahasiswa terakhir

        // - Cek apakah ada mahasiswa dengan nama tertentu menggunakan contains()

        // - Temukan index mahasiswa tertentu menggunakan indexOf()

        // - Print ukuran ArrayList menggunakan size()

        // Latihan 5: Update - Mengubah data
        // - Ubah nama mahasiswa di index tertentu menggunakan set()

        // - Print daftar setelah update

        // Latihan 6: Delete - Menghapus data
        // - Hapus mahasiswa berdasarkan index menggunakan remove(index)

        // - Hapus mahasiswa berdasarkan nama menggunakan remove(object)

        // - Hapus semua mahasiswa menggunakan clear()

        // - Cek apakah ArrayList kosong menggunakan isEmpty()

        // ===== ITERASI ARRAYLIST =====
        System.out.println("\\n=== ITERASI ARRAYLIST ===");

        // Latihan 7: Berbagai cara iterasi
        ArrayList<Integer> angka = new ArrayList<>();
        // Isi dengan angka 10, 20, 30, 40, 50
        Collections.addAll(angka, 10, 20, 30, 40, 50);

        System.out.println("For loop:");
        for (int i = 0; i < angka.size(); i++) {
            System.out.print(angka.get(i) + " ");
        }
        System.out.println("\nEnhanced for:");
        for (int a : angka) {
            System.out.print(a + " ");
        }
        System.out.println("\nWhile loop:");
        int i = 0;
        while (i < angka.size()) {
            System.out.print(angka.get(i++) + " ");
        }
        System.out.println("\nIterator:");
        Iterator<Integer> it = angka.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println("\n");

        // - Iterasi menggunakan traditional for loop

        // - Iterasi menggunakan enhanced for loop (for-each)

        // - Iterasi menggunakan while loop

        // - Iterasi menggunakan Iterator

        // ===== ARRAYLIST DENGAN TIPE DATA KOMPLEKS =====
        System.out.println("\\\\n=== ARRAYLIST DENGAN TIPE DATA KOMPLEKS ===");

        // Latihan 8: ArrayList of Arrays (simulasi objects)
        // - Buat ArrayList<String[]> untuk menyimpan data mahasiswa (nama, nim, jurusan)
        ArrayList<String[]> dataMahasiswa = new ArrayList<>();
        dataMahasiswa.add(new String[]{"Ester", "2481019", "Informatika"});
        dataMahasiswa.add(new String[]{"Junita", "2481034", "Sistem Informasi"});
        dataMahasiswa.add(new String[]{"Raweli", "2481028", "Informatika"});

        System.out.println("Nama\t\tNim\t\tJurusan");
        for (String[] mhs : dataMahasiswa) {
            System.out.printf("%-10s %-10s %-15%n", mhs[0], mhs[1], mhs[2]);
        }
        System.out.println();

        // - Tambahkan 3 data mahasiswa
        // TODO: Tambahkan data mahasiswa

        // - Print semua data dengan format tabel
        // TODO: Print dalam format tabel

        // ===== UTILITY METHODS COLLECTIONS =====
        System.out.println("\\\\n=== UTILITY METHODS COLLECTIONS ===");

        // Latihan 9: Eksplorasi Collections utility
        ArrayList<Integer> numbers = new ArrayList<>();
        // TODO: Isi dengan angka: 64, 34, 25, 12, 22, 11, 90
        Collections.addAll(numbers, 64, 34, 25, 12, 22, 11, 90);

        Collections.sort(numbers);
        System.out.println("Sorted:" + numbers);

        Collections.sort(numbers);
        System.out.println("Reserved:" + numbers);

        Collections.sort(numbers);
        System.out.println("Shuffled:" + numbers);

        System.out.println("Max:" + Collections.max(numbers));
        System.out.println("Min:" + Collections.min(numbers));

        numbers.add(22);
        System.out.println("Frekuensi 22:" + Collections.frequency(numbers, 22) + "\n");

        // - Gunakan Collections.sort() untuk mengurutkan
        // TODO: Sort list

        // - Gunakan Collections.reverse() untuk membalik urutan
        // TODO: Reverse list

        // - Gunakan Collections.shuffle() untuk mengacak
        // TODO: Shuffle list

        // - Gunakan Collections.max() dan Collections.min()
        // TODO: Find max dan min

        // - Gunakan Collections.frequency() untuk menghitung kemunculan elemen
        // TODO: Count frequency

        // ===== SEARCHING DAN SORTING =====
        System.out.println("\\\\n=== SEARCHING DAN SORTING ===");

        // Latihan 10: Implementasi search dan sort
        ArrayList<String> buah = new ArrayList<>();
        // TODO: Isi dengan: "Apel", "Jeruk", "Mangga", "Pisang", "Anggur"
        Collections.addAll(buah, "Apel", "Jeruk", "Mangga", "Pisang", "Anggur");

        Collections.sort(buah);
        System.out.println("Sorted Buah:" + buah);

        int indexBinary = Collections.binarySearch(buah, "Mangga");
        System.out.println("Binary search 'Mangga': index" + indexBinary);

        int indexLinear = linearSearch(buah, "Jeruk");
        System.out.println("Linear search 'Jeruk': index" + indexLinear + "\n");


        // - Sort secara alfabetis
        // TODO: Sort alphabetically

        // - Implementasikan binary search pada list yang sudah diurutkan
        // TODO: Binary search

        // - Implementasikan linear search untuk list yang tidak diurutkan
        // TODO: Linear search

        // ===== ARRAYLIST 2D =====
        System.out.println("\\\\n=== ARRAYLIST 2D ===");

        // Latihan 11: ArrayList of ArrayList (2D dynamic array)
        // - Buat ArrayList<ArrayList<Integer>> untuk merepresentasikan matriks dinamis
        ArrayList<ArrayList<Integer>> matrix2D = new ArrayList<>();
        for (int row = 0; row < 3; row++) {
            ArrayList<Integer> baris = new ArrayList<>();
            for (int col = 0; col < (row + 2); col++) {
                baris.add((row + 1) * (col + 2));
            }
            matrix2D.add(baris);
        }
        printMatrix2D(matrix2D);
        // - Buat 3 baris dengan panjang yang berbeda-beda
        // TODO: Create jagged 2D ArrayList

        // - Isi dengan nilai dan print dalam format matriks
        // TODO: Fill dan print matrix

        // ===== SKENARIO APLIKASI NYATA =====
        System.out.println("\\\\n=== SKENARIO APLIKASI NYATA ===");

        // Latihan 12: Sistem manajemen perpustakaan sederhana
        ArrayList<String[]> daftarBuku = new ArrayList<>();
        // Format: [judul, pengarang, tahun, status] // status: "tersedia" atau "dipinjam"
        daftarBuku.add(new String[]{"Java Dasar", "Ester", "2021", "tersedia"});
        daftarBuku.add(new String[]{"Python Lanjut", "Junita", "2022", "dipinjam"});
        daftarBuku.add(new String[]{"Database Modern", "Raweli", "2020", "tersedia"});
        daftarBuku.add(new String[]{"AI untuk Pemula", "Reyaldi", "2023", "tersedia"});
        daftarBuku.add(new String[]{"Jaringan Komputer", "Tina", "2019", "dipinjam"});

        System.out.println("Daftar Buku Awal:");
        printArrayList(daftarBuku, "Buku");

        pinjamBuku(daftarBuku, "Java Dasar");
        kembalikanBuku(daftarBuku, "Python Lanjut");

        System.out.println("\nSetelah Transaksi:");
        printArrayList(daftarBuku, "Buku");

        String[] hasilCari = cariBuku(daftarBuku, "AI untuk Pemula");
        if (hasilCari != null) {
            System.out.println("\nBuku ditemukan:" + hasilCari[0] + " (" + hasilCari[3] + ")");
        } else
            System.out.println("\nBuku tidak ditemukan");

        System.out.println("\nBuku yang tersedia:");
        for (String[] b : daftarBuku) {
            if (b[3].equalsIgnoreCase("tersedia:")) ;
            System.out.println("-" + b[0]);
        }


        // - Tambahkan 5 buku
        // TODO: Tambahkan data buku

        // - Implementasikan fungsi pinjam buku (ubah status)
        // TODO: Implementasikan pinjam buku

        // - Implementasikan fungsi kembalikan buku
        // TODO: Implementasikan kembalikan buku

        // - Implementasikan pencarian buku berdasarkan judul
        // TODO: Implementasikan search buku

        // - Print daftar buku yang tersedia
        // TODO: Print available books

        // Latihan 13: Sistem nilai mahasiswa dinamis
        // TODO: Implementasikan sistem nilai yang bisa menambah mahasiswa dinamis

        // ===== PERFORMANCE COMPARISON =====

        System.out.println("\\\\n=== PERFORMANCE COMPARISON ===");
        int[] arrayTest = new int[100000];
        ArrayList<Integer> arrayListTest = new ArrayList<>();
        for (int n = 0; n < 100000; n++) {
            arrayTest[n] = n;
            arrayListTest.add(n);
        }

        long start = System.nanoTime();
        int a = arrayTest[50000];
        long end = System.nanoTime();
        System.out.println("Akses Array:" + (end - start) + "ns");

        start = System.nanoTime();
        int b = arrayListTest.get(50000);
        end = System.nanoTime();
        System.out.println("Akses ArrayList:" + (end - start) + "ns");



        // Latihan 14: Bandingkan performa Array vs ArrayList
        // TODO: Implementasikan comparison waktu akses, insert, search
    }

    // ===== HELPER METHODS =====
    // TODO: Implementasikan method-method pembantu di sini

    public static void printArrayList(ArrayList<?> list, String title) {
        System.out.println("===" + title +"===");
        for (Object o : list) {
            if (o instanceof String[]) {
                String[] data =(String[]) o;
                System.out.println(String.join(",",data));
            }else {
                System.out.println(o);
            }

        }
        // TODO: Print ArrayList dengan title
    }

    public static int linearSearch(ArrayList<String> list, String target) {
        for  (int i=0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase(target)) return i;
        }
        // TODO: Implementasi linear search
        return -1;
    }

    public static void printMatrix2D(ArrayList<ArrayList<Integer>> matrix) {
        for (ArrayList<Integer> row : matrix) {
            for (int val : row ) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
        // TODO: Print 2D ArrayList matrix
    }

    public static boolean pinjamBuku(ArrayList<String[]> daftarBuku, String judul) {
        for (String[] b : daftarBuku){
            if (b[0]. equalsIgnoreCase(judul) && b[3].equalsIgnoreCase("tersedia")) {
                b[3] = "dipinjam";
                return true;
            }
        }
        // TODO: Implementasi pinjam buku
        return false;
    }

    public static boolean kembalikanBuku(ArrayList<String[]> daftarBuku, String judul) {
        for (String[]b : daftarBuku) {
            if (b[0].equalsIgnoreCase(judul) && b[3].equalsIgnoreCase("dipinjam")) {
                b[3] ="tersedia";
                return true;
            }
        }
        // TODO: Implementasi kembalikan buku
        return false;
    }

    public static String[] cariBuku(ArrayList<String[]> daftarBuku, String judul) {
        for (String[] b : daftarBuku) {
            if (b[0].equalsIgnoreCase(judul)) return b;
        }
        // TODO: Implementasi cari buku
        return null;
    }

    public static double hitungRataRata(ArrayList<Integer> values) {
        if (values.isEmpty()) return  0.0;
        double total =0;
        for (int v : values) total += v;
        return total / values.size();
        // TODO: Hitung rata-rata
    }
}
