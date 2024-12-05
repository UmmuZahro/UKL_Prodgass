import java.util.Scanner;

public class soalsulit1 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();

        // Mengecek apakah jumlah siswa valid 
        if (jumlahSiswa <= 0) {
            System.out.println("Jumlah siswa harus lebih dari 0!");
            return; // Mengakhiri program
        }

        // Membuat array untuk menyimpan nilai setiap siswa
        double[] nilaiSiswa = new double[jumlahSiswa];

        double totalNilai = 0; // Variabel untuk menghitung total nilai semua siswa

        // Loop untuk meminta input nilai setiap siswa
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + (i + 1) + ": ");
            nilaiSiswa[i] = scanner.nextDouble();

            // Validasi apakah nilai berada dalam rentang yang diperbolehkan (0-100)
            if (nilaiSiswa[i] < 0 || nilaiSiswa[i] > 100) {
                System.out.println("Nilai harus antara 0 hingga 100!");
                i--; // Kembali meminta input untuk siswa yang sama
                continue;
            }

            totalNilai += nilaiSiswa[i];
        }

        double rataRata = totalNilai / jumlahSiswa;
        for (int i = 0; i < jumlahSiswa; i++){
            System.out.println(nilaiSiswa [i] + " ");
        }
        System.out.println("=== Rekapitulasi Nilai ===");
        System.out.println("Jumlah siswa: " + jumlahSiswa);
        System.out.println("Rata-rata nilai: " + rataRata);
    }
}
