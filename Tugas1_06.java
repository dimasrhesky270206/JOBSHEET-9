import java.util.Scanner;

public class Tugas1_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        int[] nilaiMahasiswa = new int[jumlahMahasiswa];
        int totalNilai = 0;

        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = scanner.nextInt();
            totalNilai += nilaiMahasiswa[i];
        }

        
        double rataRata = (double) totalNilai / jumlahMahasiswa;

        
        int nilaiTertinggi = nilaiMahasiswa[0];
        int nilaiTerendah = nilaiMahasiswa[0];

        for (int nilai : nilaiMahasiswa) {
            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }
            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }
        }

        
        System.out.println("\nNilai Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiMahasiswa[i]);
        }

        System.out.println("\nRata-rata nilai: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
       
        scanner.close();

    }
}