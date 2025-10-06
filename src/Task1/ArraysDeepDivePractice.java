package Task1;


import java.util.Arrays;
import java.util.Random;

public class ArraysDeepDivePractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Arrays Deep Dive
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * array multidimensi, operasi lanjutan, parameter/return value, dan utility methods.
         */

        // ===== ARRAY MULTIDIMENSI DASAR =====
        System.out.println("=== ARRAY MULTIDIMENSI DASAR ===");

        // Latihan 1: Membuat dan mengisi array 2D (matriks)
        // - Buat array 2D integer dengan ukuran 3x4 (3 baris, 4 kolom)
        int[][] matriks = new int[3][4];

        // - Isi array dengan nilai: baris 0: [1,2,3,4], baris 1: [5,6,7,8], baris 2: [9,10,11,12]
        matriks[0] = new int[]{1, 2, 3, 4};
        matriks[1] = new int[]{5, 6, 7, 8};
        matriks[2] = new int[]{9, 10, 11, 12};

        // - Print seluruh matriks menggunakan nested loop dengan format yang rapi
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }

        // Latihan 2: Array 2D dengan inisialisasi langsung //
        System.out.println("=== ARRAY 2D DENGAN INISIALISASI LANGSUNGS ===");
        // - Buat array 2D string yang merepresentasikan papan catur 3x3 dengan nilai awal "."
        String[][] papan = {
                {".", ".", "."},
                {".", ".", "."},
                {".", ".", "."}
        };

        // - Tempatkan "X" di posisi [0][0], [1][1], dan [2][2] (diagonal)
        papan[0][0] = "X";
        papan[1][1] = "X";
        papan[2][2] = "X";

        // - Tempatkan "O" di posisi [0][2], [1][0], dan [2][1]
        papan[0][2] = "O";
        papan[1][0] = "O";
        papan[2][1] = "O";

        // - Print papan dengan format grid yang rapi
        for (int i = 0; i < papan.length; i++) {
            for (int j = 0; j < papan[i].length; j++) {
                System.out.print(papan[i][j] + " ");
            }
            System.out.println();
        }


        // ===== ARRAY JAGGED (IRREGULAR) =====
        System.out.println("\n=== ARRAY JAGGED (IRREGULAR) ===");

        // Latihan 3: Array dengan panjang baris yang berbeda
        // - Buat array 2D integer dengan 4 baris: baris 0 panjang 2, baris 1 panjang 4, baris 2 panjang 3, baris 3 panjang 5
        int[][] jaggedArray = new int[4][];
        jaggedArray[0] = new int[2];
        jaggedArray[1] = new int[4];
        jaggedArray[2] = new int[3];
        jaggedArray[3] = new int[5];
        // - Isi setiap baris dengan angka berurutan dimulai dari 1
        int count = 1;
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = count++;
            }
        }
        // - Print array jagged dengan menampilkan panjang setiap baris
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.print("Baris" + i + "(panjang" + jaggedArray[i].length + "):");
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
        }
        // ===== OPERASI LANJUTAN PADA ARRAY =====
        System.out.println("\n=== OPERASI LANJUTAN PADA ARRAY ===");

        // Latihan 4: Operasi matematika pada array 2D
        // - Buat dua matriks 2x3 dengan nilai bebas
        int[][] matriksA = {
                {2, 4, 6},
                {1, 3, 5}
        };

        int[][] matriksB = {
                {7, 8, 9},
                {4, 5, 6}
        };
        // - Implementasikan penjumlahan matriks (buat method addMatrices)
        int[][] hasilTambah = addMatrices(matriksA, matriksB);

        // - Implementasikan perkalian setiap elemen dengan scalar 2 (buat method multiplyByScalar)
        int[][] hasilKali = multiplyByScalar(hasilTambah, 2);

        // - Print hasil operasi
        System.out.println("Penjumlahan Matriks:");
        displayMatrix(hasilTambah);
        System.out.println("Perkalian dengan Scalar (x2):");
        displayMatrix(hasilKali);


        // ===== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE =====
        System.out.println("\n=== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE ===");

        // Latihan 5: Method yang menerima dan mengembalikan array
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        // - Panggil method sortArray untuk mengurutkan array
        System.out.println("Array Awal:" + Arrays.toString(numbers));
        // (implementasikan method sortArray yang menerima array dan mengembalikan array yang sudah diurutkan)
        int[] sorted = sortArray(numbers.clone());
        System.out.println("Array Setelah Diurutkan:" + Arrays.toString(sorted));

        int[] reversed = reverseArray(sorted.clone());
        System.out.println("Array Setelah Dibalik:" + Arrays.toString(reversed));

        int[] minMax = findMinMax(numbers);
        System.out.println("Nilai Minimum:" + minMax[0] + ", Maksimum:" + minMax[1]);

        // - Panggil method reverseArray untuk membalik array
        // (implementasikan method reverseArray)
        // - Panggil method findMinMax untuk mencari nilai minimum dan maksimum
        // (implementasikan method yang mengembalikan array int dengan 2 elemen: [min, max])

        // ===== UTILITY METHODS JAVA.UTIL.ARRAYS =====
        System.out.println("\n=== UTILITY METHODS JAVA.UTIL.ARRAYS ===");

        // Latihan 6: Eksplorasi utility methods Arrays
        int[] data = {5, 2, 8, 1, 9, 3};
        System.out.println("Array Asli:" + Arrays.toString(data));

        Arrays.sort(data);
        System.out.println("Setelah Sort:" + Arrays.toString(data));

        int pos = Arrays.binarySearch(data, 8);
        System.out.println("Posisi elemen 8: " + pos);

        Arrays.fill(data, 7);
        System.out.println("Setelah Fill dengan 7:" + Arrays.toString(data));

        int[] data2 = {7, 7, 7, 7, 7, 7};
        System.out.println("Array Sama? " + Arrays.equals(data, data2));

        int[] copy = Arrays.copyOf(data, 10);
        System.out.println("Copy array ukuran baru: " + Arrays.toString(copy));

        // - Gunakan Arrays.toString() untuk print array

        // - Gunakan Arrays.sort() untuk mengurutkan array

        // - Gunakan Arrays.binarySearch() untuk mencari elemen (array harus sudah diurutkan)

        // - Gunakan Arrays.fill() untuk mengisi array dengan nilai tertentu

        // - Gunakan Arrays.equals() untuk membandingkan dua array

        // - Gunakan Arrays.copyOf() untuk membuat copy array dengan ukuran berbeda

        // ===== ARRAY 3D DAN KOMPLEKS =====
        System.out.println("\n=== ARRAY 3D DAN KOMPLEKS ===");

        // Latihan 7: Array 3 dimensi
        // - Buat array 3D integer ukuran 2x3x4 (seperti 2 buah matriks 3x4)
        System.out.println("\n===ARRAY 3D DAN KOMPLEKS===");
        int[][][] array3D = new int[2][3][4];
        int num = 1;
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    array3D[i][j][k] = num++;
                }
            }
        }
        for (int i = 0; i < array3D.length; i++) {
            System.out.println("Layer" + i + ":");
            for (int j = 0; j < array3D[i].length; j++) {
                System.out.println(Arrays.toString(array3D[i][j]));
            }
        }
        // - Isi dengan nilai berurutan dari 1

        // - Print menggunakan triple nested loop dengan format yang jelas

        // ===== SKENARIO APLIKASI NYATA =====
        System.out.println("\\n=== SKENARIO APLIKASI NYATA ===");

        // Latihan 8: Sistem nilai mahasiswa
        // - Buat array 2D untuk menyimpan nilai 5 mahasiswa, 4 mata kuliah
        String[] namaMahasiswa = {"Alice", "Bob", "Charlie", "Diana", "Eva"};
        String[] mataKuliah = {"Math", "Physics", "Chemistry", "Biology"};
        int[][] nilai = new int[namaMahasiswa.length][mataKuliah.length];
        fillRandomGrades(nilai, 60, 100);

        System.out.println("Tabel Nilai Mahasiswa:");
        System.out.printf("%-10s", "Nama");
        for (String mk : mataKuliah) {
            System.out.printf("%10s", mk);
        }
        System.out.printf("%10s%n", "Rata-rata");

        double[] rataMK = new double[mataKuliah.length];
        double tertinggi = 0;
        String namaTertinggi = "";

        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.printf("%-10s", namaMahasiswa[i]);
            double rata = calculateAverage(nilai[i]);
            for (int j = 0; j < mataKuliah.length; j++) {
                System.out.printf("%10d", nilai[i][j]);
                rataMK[j] += nilai[i][j];
            }
            System.out.printf("%10.2f%n", rata);
            if (rata > tertinggi) {
                tertinggi = rata;
                namaTertinggi = namaMahasiswa[i];
            }
        }

        System.out.printf("%-10s", "Rata MK");
        for (int j = 0; j < mataKuliah.length; j++) {
            System.out.printf("%10.2f", rataMK[j] / namaMahasiswa.length);
        }
        System.out.println();
        System.out.println("Mahasiswa dengan nilai tertinggi:" + namaTertinggi + "(" + tertinggi + ")");

        // - Isi dengan nilai random antara 60-100

        // - Hitung rata-rata per mahasiswa

        // - Hitung rata-rata per mata kuliah

        // - Tentukan mahasiswa dengan nilai tertinggi

        // - Print dalam format tabel yang rapi

        // Latihan 9: Game Tic-Tac-Toe sederhana
        // - Buat array 2D char 3x3 untuk papan permainan
        // - Implementasikan method untuk menampilkan papan

        // - Implementasikan method untuk mengecek apakah ada pemenang

        // - Simulasikan beberapa langkah permainan
    }

    // ===== IMPLEMENTASI METHODS =====
    // TODO: Implementasikan method-method yang diperlukan di sini

    // Method untuk penjumlahan matriks
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Implementasi penjumlahan matriks
        return result; // Ganti dengan implementasi yang benar
    }

    // Method untuk perkalian scalar
    public static int[][] multiplyByScalar(int[][] matrix, int scalar) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix[i][j] * scalar;
            }
        }
        // Implementasi perkalian scalar
        return result; // Ganti dengan implementasi yang benar
    }

    // Method untuk sorting array
    public static int[] sortArray(int[] arr) {
        Arrays.sort(arr);
        // Implementasi sorting (bisa menggunakan Arrays.sort atau implementasi sendiri)
        return arr; // Ganti dengan implementasi yang benar
    }

    // Method untuk reverse array
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        // Implementasi reverse array
        return reversed; // Ganti dengan implementasi yang benar
    }

    // Method untuk find min dan max
    public static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int val : arr) {
            if (val < min) min = val;
            if (val > max) max = val;
        }
        // Return array dengan format [min, max]
        return new int[]{min, max}; // Ganti dengan implementasi yang benar
    }

    // Method untuk display array 2D
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
        // Implementasi untuk menampilkan matriks dengan format rapi
    }

    // Method untuk mengisi array 2D dengan nilai random
    public static void fillRandomGrades(int[][] grades, int min, int max) {
        Random rand = new Random();
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                grades[i][j] = rand.nextInt(max - min + 1) + min;
            }
        }
        // Implementasi untuk mengisi array dengan nilai random
    }

    // Method untuk menghitung rata-rata array
    public static double calculateAverage(int[] values) {
        int sum = 0;
        for (int v : values) {
            sum += v;
        }
        // Implementasi untuk menghitung rata-rata
        return (double) sum / values.length; // Ganti dengan implementasi yang benar
    }

}
