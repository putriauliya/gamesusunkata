package responsi2;

import java.util.Scanner;

public class Responsi2 {

    public static void main(String[] args) {
        menu_awal();
    }

    static Scanner input = new Scanner(System.in);
    static String kereta[] = {"Penataran      ", "Penataran Dhoho", "Tumapel        ", "Penataran Dhoho", "Penataran Dhoho"};
    static String jadwal[] = {"07.08 ML - 09.52 SBY", "10.20 ML - 13.09 TA ", "04.30 ML - 05.41 BG ", "14.35 ML - 19.34 JG ", "07.10 ML - 11.22 KD "};
    static int harga = 15000;
    static char ulang;

    public static void menu_awal() {
        int pilih_menu;
        do {
            System.out.println("========== Menu ==========");
            System.out.println("1.\tJadwal");
            System.out.println("2.\tBeli Tiket");
            System.out.println("3.\tKeluar");
            System.out.println("==========================");
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
            System.out.print("ingin kembali ke menu awal ?(Y/T) ");
            ulang = input.next().charAt(0);
        } while (ulang == 'Y' || ulang == 'y');
    }

    public static void jadwal() {
        System.out.println("========================= Jadwal Kereta ========================");
        System.out.println("NB  | Kereta           | Berangkat-Tiba           | Keterangan |");
        for (int x = 0; x < kereta.length; x++) {
            System.out.println((x + 1) + "   | " + kereta[x] + "  | " + jadwal[x] + "     | 3 Kursi   |");
        }

    }

    public static void transaksi() {
        System.out.println("========================= Jadwal Kereta ========================");
        System.out.println("NB  | Kereta           | Berangkat-Tiba           | Keterangan |");
        for (int x = 0; x < kereta.length; x++) {
            System.out.println((x + 1) + "   | " + kereta[x] + "  | " + jadwal[x] + "     | 3 Kursi   |");
        }

        System.out.println("================================================================");
        System.out.println("                             Pemesanan                          ");
        System.out.println("================================================================");

        System.out.print("Masukkan Pilihan  : ");
        int pilih_jadwal = input.nextInt();
        System.out.println("Kereta            : " + kereta[(pilih_jadwal - 1)]);
        System.out.println("Berangkat-Tiba    : " + jadwal[(pilih_jadwal - 1)]);
        System.out.print("Nama Penumpang    : ");
        String nama = input.next();
        System.out.print("No Identitas      : ");
        String noidn = input.next();
        System.out.print("No HP             : ");
        String nohp = input.next();
        int kapasitas = 0;
        switch (pilih_jadwal) {
            case 1:
                kapasitas = 3;
                break;
            case 2:
                kapasitas = 3;
                break;
            case 3:
                kapasitas = 3;
                break;
            case 4:
                kapasitas = 3;
                break;
            case 5:
                kapasitas = 3;
                break;
        }
        int kursi = 0;

        do {
            System.out.print("Jumlah Kursi      : ");
            kursi = input.nextInt();
            if (kursi > kapasitas) {
                System.out.println("kursi telah habis");
            }
        } while (kursi > kapasitas);

        System.out.println("================================================================");
        System.out.println("                             Pembayaran                         ");
        System.out.println("================================================================");
        int total = kursi * harga;
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
        System.out.println("Kereta            : " + kereta[(pilih_jadwal - 1)]);
        System.out.println("Berangkat-Tiba    : " + jadwal[(pilih_jadwal - 1)]);
        System.out.println("-----------------------------------------");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||");

    }
}
