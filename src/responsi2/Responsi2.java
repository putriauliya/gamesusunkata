package responsi2;

import java.util.Scanner;

public class Responsi2 {

    public static void main(String[] args) {
        menu_awal();
    }

    static Scanner input = new Scanner(System.in);
    static String nama, noidn, nohp;
    static int pilih_jadwal;
    static String kereta[] = {"Penataran      ", "Penataran Dhoho", "Tumapel        ", "Penataran Dhoho", "Penataran Dhoho"};
    static String jadwal[] = {"07.08 ML - 09.52 SBY", "10.20 ML - 13.09 TA ", "04.30 ML - 05.41 BG ", "14.35 ML - 19.34 JG ", "07.10 ML - 11.22 KD "};
    static int harga = 15000;
    static char ulang;
    static int count[] = {0, 0, 0, 0, 0};

    public static void menu_awal() {
        int pilih_menu;
        do {
            System.out.println("========== Aplikasi Go-Show Lokal ==========");
            System.out.println("1.\tJadwal");
            System.out.println("2.\tBeli Tiket");
            System.out.println("3.\tKeluar");
            System.out.println("============================================");
            System.out.print("Masukkan Pilihan (1/2/3) : ");

            pilih_menu = input.nextInt();

            System.out.println("");
            switch (pilih_menu) {
                case 1:
                    jadwal();
                    break;
                case 2:
                    transaksi();
                    break;
                case 3:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan Tidak Tersedia");

            }
            System.out.print("ingin kembali ke menu awal ?(Y/T) ");//
            ulang = input.next().charAt(0);
        } while (ulang == 'Y' || ulang == 'y');
    }

    public static void jadwal() {
        System.out.println("========================= Jadwal Kereta ========================");
        System.out.println("NB  | Kereta           | Berangkat-Tiba           | Keterangan |");
        for (int x = 0; x < kereta.length; x++) {
            System.out.println((x + 1) + "   | " + kereta[x] + "  | " + jadwal[x] + "     | 3 Kursi    |");
        }

    }

    public static void transaksi() {
        System.out.println("========================= Jadwal Kereta ========================");
        System.out.println("NB  | Kereta           | Berangkat-Tiba           | Keterangan |");
        for (int x = 0; x < kereta.length; x++) {
            System.out.println((x + 1) + "   | " + kereta[x] + "  | " + jadwal[x] + "     | 3 Kursi    |");
        }
        do {
            System.out.println("================================================================");
            System.out.println("                             Pemesanan                          ");
            System.out.println("================================================================");
            int c = 1;
            while (c != 0) {
                System.out.print("Masukkan Pilihan  : ");
                pilih_jadwal = input.nextInt();
                if (count[pilih_jadwal - 1] < 3) {
                    c = 0;
                } else {
                    System.out.println("Maaf Kursi Sudah Habis");
                }
            }

            count[pilih_jadwal - 1] += 1;
            System.out.println("Kereta            : " + kereta[(pilih_jadwal - 1)]);
            System.out.println("Berangkat-Tiba    : " + jadwal[(pilih_jadwal - 1)]);
            System.out.print("Nama Penumpang    : ");
            nama = input.next();
            System.out.print("No Identitas      : ");
            noidn = input.next();
            System.out.print("No HP             : ");
            nohp = input.next();

            System.out.print("apakah data sudah benar ?(Y/T) ");
            ulang = input.next().charAt(0);
        } while (ulang == 'T' || ulang == 't');

        System.out.println("================================================================");
        System.out.println("                             Pembayaran                         ");
        System.out.println("================================================================");
        int total = 1 * harga;
        System.out.println("Total Bayar     : " + total);
        System.out.print("Bayar           : ");

        int bayar = 0;
        do {

            bayar = input.nextInt();
            if (bayar < total) {
                System.out.println("Maaf, Uang anda kurang");
                System.out.print("Bayar           : ");

            } else {
            }
        } while (bayar < total);

        int kembalian = bayar - total;
        System.out.println("Kembalian       : " + kembalian);

        System.out.println("================================================================");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||");
        System.out.println("               Tiket Kereta              ");
        System.out.println("-----------------------------------------");
        System.out.println("Nama Penumpang    : " + nama);
        System.out.println("No Identitas      : " + noidn);
        System.out.println("No HP             : " + nohp);
        System.out.println("Kereta            : " + kereta[(pilih_jadwal - 1)]);
        System.out.println("Berangkat-Tiba    : " + jadwal[(pilih_jadwal - 1)]);
        System.out.println("-----------------------------------------");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||");

    }

}
