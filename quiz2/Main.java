import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#,###");

        System.out.println("Selamat datang di SOLUSI KEUANGAN ALDI GANTENG\n");

        System.out.println("Silahkan Pilih Paket Pinjaman:");
        System.out.println("1. PAKET KARUNG");
        System.out.println("2. PAKET PAPER BAG\n");

        System.out.print("Masukkan Pilihan Paket Anda: ");
        int paket = scanner.nextInt();

        System.out.println("\nSilahkan Masukkan Data Anda");
        scanner.nextLine(); // Membuang newline character

        System.out.print("Masukkan Nama Peminjam: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan No.KTP Peminjam: ");
        String noKtp = scanner.nextLine();

        System.out.println("\nPilih Ukuran Karung:");
        System.out.println("1. XL");
        System.out.println("2. L");
        System.out.println("3. M");
        System.out.print("Masukkan pilihan: ");
        int ukuran = scanner.nextInt();

        System.out.print("\nBerapa Lama Pinjam (bulan): ");
        int lamaPinjam = scanner.nextInt();

        int pinjaman = 0;
        double bunga = 0;

        if (paket == 1) {
            switch (ukuran) {
                case 1:
                    pinjaman = 100000000;
                    bunga = 2500000.0;
                    break;
                case 2:
                    pinjaman = 50000000;
                    bunga = 1500000.0;
                    break;
                case 3:
                    pinjaman = 25000000;
                    bunga = 1000000.0;
                    break;
                default:
                    System.out.println("Pilihan ukuran tidak valid.");
                    return;
            }
        } else if (paket == 2) {
            switch (ukuran) {
                case 1:
                    pinjaman = 150000000;
                    bunga = 3500000.0;
                    break;
                case 2:
                    pinjaman = 75000000;
                    bunga = 2000000.0;
                    break;
                case 3:
                    pinjaman = 37500000;
                    bunga = 1250000.0;
                    break;
                default:
                    System.out.println("Pilihan ukuran tidak valid.");
                    return;
            }
        } else {
            System.out.println("Pilihan paket tidak valid.");
            return;
        }

        double kewajibanBulanan = pinjaman / lamaPinjam;
        double totalPinjaman = pinjaman + (bunga * lamaPinjam);

        System.out.println("\n----- Total Kewajiban Pinjaman -----");
        System.out.println("Nama Peminjam: " + nama);
        System.out.println("Kewajiban Bulanan: Rp" + decimalFormat.format(kewajibanBulanan));
        System.out.println("Total Pinjaman: Rp" + decimalFormat.format(totalPinjaman));
        System.out.println("Terima kasih telah meminjam di SOLUSI KEUANGAN");
        System.out.println("Maju dengan Keuangan... Kami Solusinya (_)");
    }
}