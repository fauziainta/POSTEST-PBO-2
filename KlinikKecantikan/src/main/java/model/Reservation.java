package model;

public class Reservation {

    private String namaCustomer;
    private String tanggal;
    private String waktu;
    private String layanan;

public Reservation(String namaCustomer, String tanggal, String waktu, String layanan) {
    this.namaCustomer = namaCustomer;
    this.tanggal = tanggal;
    this.waktu = waktu;
    this.layanan = layanan;
    }

    public String getNamaCustomer() {
        return namaCustomer;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getWaktu() {
        return waktu;
    }

    public String getLayanan() {
        return layanan;
    }

    public void setNamaCustomer(String namaCustomer) {
        this.namaCustomer = namaCustomer;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public void setLayanan(String layanan) {
        this.layanan = layanan;
    }

    @Override
    public String toString() {
        return "Nama: " + namaCustomer +
                ", Tanggal: " + tanggal +
                ", Waktu: " + waktu +
                ", Layanan: " + layanan;
    }
}
