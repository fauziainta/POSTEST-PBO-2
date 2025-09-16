package service;

import java.util.ArrayList;
import java.util.Scanner;
import model.Reservation;

public class ReservationService {
    private final ArrayList<Reservation> daftarReservasi = new ArrayList<>();
    private final ArrayList<String> waktuTersedia = new ArrayList<>();
    private final ArrayList<String> layananTersedia = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public ReservationService() {
        waktuTersedia.add("10:00");
        waktuTersedia.add("13:00");
        waktuTersedia.add("15:00");
        waktuTersedia.add("18:00");

        layananTersedia.add("Peeling Acne");
        layananTersedia.add("Laser Rejuvenation");
        layananTersedia.add("Skin Booster Salmon DNA");
        layananTersedia.add("Facial");
        layananTersedia.add("Microneedling");
    }


    public void tambahReservasi() {
        System.out.print("Masukkan nama customer: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan tanggal (dd-mm-yyyy): ");
        String tgl = scanner.nextLine();

        System.out.println("Pilih waktu tersedia:");
        for (int i = 0; i < waktuTersedia.size(); i++) {
            System.out.println((i + 1) + ". " + waktuTersedia.get(i));
        }
        System.out.print("Pilih nomor waktu: ");
        int pilihWaktu = scanner.nextInt();
        scanner.nextLine(); // buang newline
        String wkt = waktuTersedia.get(pilihWaktu - 1);

        System.out.println("Pilih layanan tersedia:");
        for (int i = 0; i < layananTersedia.size(); i++) {
            System.out.println((i + 1) + ". " + layananTersedia.get(i));
        }
        System.out.print("Pilih nomor layanan: ");
        int pilihLayanan = scanner.nextInt();
        scanner.nextLine(); // buang newline
        String layan = layananTersedia.get(pilihLayanan - 1);

        daftarReservasi.add(new Reservation(nama, tgl, wkt, layan));
        System.out.println("Reservasi berhasil ditambahkan <3");
    }

   
    public void lihatReservasi() {
        if (daftarReservasi.isEmpty()) {
            System.out.println("Belum ada data reservasi T_T");
            return;
        }
        System.out.println("\n<3 <3 DAFTAR RESERVASI <3 <3");
        for (int i = 0; i < daftarReservasi.size(); i++) {
            System.out.println((i + 1) + ". " + daftarReservasi.get(i));
        }
    }


    public void ubahReservasi() {
        lihatReservasi();
        if (daftarReservasi.isEmpty()) return;

        System.out.print("Pilih nomor reservasi yang ingin diubah: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // buang newline

        System.out.print("Masukkan tanggal baru (dd-mm-yyyy): ");
        String tgl = scanner.nextLine();

        System.out.println("Pilih waktu baru:");
        for (int i = 0; i < waktuTersedia.size(); i++) {
            System.out.println((i + 1) + ". " + waktuTersedia.get(i));
        }
        System.out.print("Pilih nomor waktu: ");
        int pilihWaktu = scanner.nextInt();
        scanner.nextLine();
        String wkt = waktuTersedia.get(pilihWaktu - 1);

        System.out.println("Pilih layanan baru:");
        for (int i = 0; i < layananTersedia.size(); i++) {
            System.out.println((i + 1) + ". " + layananTersedia.get(i));
        }
        System.out.print("Pilih nomor layanan: ");
        int pilihLayanan = scanner.nextInt();
        scanner.nextLine();
        String layan = layananTersedia.get(pilihLayanan - 1);

        Reservation r = daftarReservasi.get(index);
        r.setTanggal(tgl);
        r.setWaktu(wkt);
        r.setLayanan(layan);

        System.out.println("Reservasi berhasil diubah!");
    }

    public void hapusReservasi() {
        lihatReservasi();
        if (daftarReservasi.isEmpty()) return;

        System.out.print("Pilih nomor reservasi yang ingin dihapus: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        daftarReservasi.remove(index);
        System.out.println("Reservasi berhasil dihapus!");
    }

    public void cariReservasi() {
        if (daftarReservasi.isEmpty()) {
            System.out.println("Belum ada reservasi, yuk create dulu!");
            return;
        }

        System.out.print("Masukkan nama customer yang dicari: ");
        String keyword = scanner.nextLine();
        boolean found = false;

        for (Reservation r : daftarReservasi) {
            if (r.getNamaCustomer().equalsIgnoreCase(keyword)) {
                System.out.println("Data ditemukan:");
                System.out.println("Nama    : " + r.getNamaCustomer());
                System.out.println("Tanggal : " + r.getTanggal());
                System.out.println("Waktu   : " + r.getWaktu());
                System.out.println("Layanan : " + r.getLayanan());
                System.out.println("<3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Reservasi dengan nama '" + keyword + "' tidak ditemukan.");
        }
    }
}
