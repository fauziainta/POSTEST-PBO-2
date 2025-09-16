package main;

import service.ReservationService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner objekScanner = new Scanner(System.in);
        ReservationService service = new ReservationService();

        while (true) {
            System.out.println("\n<3 <3 RESERVASI KLINIK KECANTIKAN <3 <3");
            System.out.println("1. Tambah Reservasi");
            System.out.println("2. Lihat Reservasi");
            System.out.println("3. Ubah Reservasi");
            System.out.println("4. Hapus Reservasi");
            System.out.println("5. Cari Reservasi");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");

            int pilih;
            try {
                pilih = Integer.parseInt(objekScanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka!");
                continue;
            }

            switch (pilih) {
                case 1:
                    service.tambahReservasi();
                    break;
                case 2:
                    service.lihatReservasi();
                    break;
                case 3:
                    service.ubahReservasi();
                    break;
                case 4:
                    service.hapusReservasi();
                    break;
                case 5:
                    service.cariReservasi();
                    break;  
                case 6:
                    System.out.println("Thanks for using this reservation program <3.");
                    return;
                default:
                    System.out.println("Menu tidak valid!");
            }
        }
    }
}
