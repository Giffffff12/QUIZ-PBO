package Quiz3;

import java.util.ArrayList;
import java.util.Scanner;

public class Execute {
    static ArrayList<Booking> Pemesanan = new ArrayList<Booking>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Booking Pemesanan = new Booking();
        Konsul Transaksi = new Konsul();

        System.out.println("---------------------------------------");
        System.out.println("SELAMAT DATANG DI RUMAH SAKIT WARAS");
        System.out.println("------------------|||-------------------\n");
        System.out.println("*Masukkan Data Pasien*");
        System.out.print("Masukkan Nama    : ");
        // Pemesanan.nama = sc.nextLine();
        Pemesanan.setNama(sc.nextLine());
        System.out.print("Masukkan Alamat  : ");
        Pemesanan.setAlamat(sc.nextLine());
        System.out.print("Masukkan No. Tlp : ");
        Pemesanan.setTelpon(sc.nextLine());

        Transaksi.viewjasa();

        do {
            System.out.print("\nPilih Poli : ");
            int jasa = sc.nextInt();
            if (jasa >= 1 && jasa <= 3) {
                Transaksi.setJasa(jasa);
                break;
            } else {

            }
        } while (true);

        Transaksi.viewteam();
        do {
            System.out.print("\nPilih Dokter : ");
            int team = sc.nextInt();
            if (team >= 1 && team <= 3) {
                Transaksi.team = team;
                break;
            } else {

            }
        } while (true);
        sc.nextLine();
        System.out.println("\nBerikan Keterangan Pemesanan : ");
        Pemesanan.setKeterangan(sc.nextLine());

        System.out.print("\n\nMasukkan Biaya Pendaftaran     : Rp. ");
        int bPenyedia = sc.nextInt();
        System.out.print("Masukkan Biaya Obat            : Rp. ");
        int bJasa = sc.nextInt();
        System.out.print("Masukkan Biaya Vitamin         : Rp. ");
        int bBahan = sc.nextInt();
        System.out.print("Masukkan Biaya Dokter          : Rp. ");
        int bTrans = sc.nextInt();

        // fungsinya
        String cust = Pemesanan.getNama();
        String alamat = Pemesanan.getAlamat();
        String telpon = Pemesanan.getTelpon();

        String pesanjasa = Transaksi.getJasa();
        String potong = Transaksi.getTeam();
        String[] dipotong = potong.split("\\[");
        String tim = dipotong[0].trim();
        String keterangan = Pemesanan.getKeterangan();
        int total = bBahan + bJasa + bPenyedia + bTrans;

        // ouput
        System.out.println("\n------------------|||-------------------");
        System.out.println("========================================\n");

        System.out.println("Informasi Pemesan");
        System.out.println("Nama Pasien        :     " + cust);
        System.out.println("Alamat Pasien      :     " + alamat);
        System.out.println("Telpon Pasien      :     " + telpon);
        System.out.println("\nPoli               :     " + pesanjasa);
        System.out.println("Dokter             :     " + tim);
        System.out.println("Keterangan         :     " + keterangan);
        System.out.println("\nTotal biaya yang di bayar pasien  : Rp." + total);

        System.out.println("\n===== Salam Sehat " + cust + " Terimakasih =====");
    }
}
