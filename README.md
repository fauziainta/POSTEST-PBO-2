# POSTEST-PBO-2
# Reservasi Klinik Kecantikan

Fauzia Inanta Aurelia/2409116044/Sistem Informasi'B

## Deskripsi
Program ini ialah aplikasi Java untuk melakukan sebuah program CRUD sederhana untuk mengelola resevasi di Klinik Kecantikan. Program ini dikembangkan dengan menerapkan packages, memisahkan dengan 3 class yaitu 
- packages main (class Main.java) 
- packages service (class Reservation.java) 
- packages model (class ReservationService.java)

## Ketentuan Baru
1. 3 pacakages dan 3 Class
- packages main (class Main.java) : menjalankan program & menampilkan menu pada user.
- packages service (class Reservation.java)  : class service untuk logika CRUD.
- packages model (class ReservationService.java) : untuk menyimpan struktur data reservasi.
 <img width="301" height="182" alt="image" src="https://github.com/user-attachments/assets/e42fc044-212e-4dda-a105-c4d16c7504b8" />

  
2. Ada 3 Properties pada class Reservation terdapat:
* namaCustomer
* tanggal
* waktu
* layanan

3. Constructor
- Pada 'Class Reservation' memiliki constructor untuk inisialisasi data saat membuat objek reservasi baru.
 <img width="878" height="141" alt="image" src="https://github.com/user-attachments/assets/a6a4102a-de60-4fb4-aab8-ae67a4847a7f" />


4. Acces Modifier
- Salah satunya disediakan getter & setter public: supaya class lain (misalnya ReservationService) tetap bisa mengambil/mengubah data dengan cara yang benar.
 <img width="495" height="127" alt="image" src="https://github.com/user-attachments/assets/9b6ad88f-0cd6-4b2f-ae45-98681aaddcc7" />

## Penerapan Nilai Tambah
1. Validasi Input
   
a.  Input tidak boleh kosong.

 <img width="581" height="249" alt="image" src="https://github.com/user-attachments/assets/6385be57-e069-42a6-937d-c62eed0087de" />

b.  Input angka (menu, pilihan waktu, pilihan layanan) harus berupa angka yang valid dan dalam rentang pilihan.

 <img width="821" height="478" alt="image" src="https://github.com/user-attachments/assets/45183d21-0ff9-44f2-8f76-101f20427658" />


2. Fitur Search
- Disini saya menambahan fitu tambahan pada user menu untuk mencari reservasi berdasarkan nama customer.
 <img width="758" height="459" alt="image" src="https://github.com/user-attachments/assets/432fda24-b096-4575-af2d-9366030721aa" />

## Alur Program
a. Saat dijalankan, user akan melihat menu utama dengan 5 pilihan.
b. Tambah Reservasi
- User memilih menu Tambah Reservasi.
- user memasukkan input nama customer.
- User memasukkan input tanggal reservasi.
- Program menampilkan daftar waktu reservasi yang tersedia, lalu user memilih salah satunya.
- Program menampilkan daftar layanan kecantikan yang tersedia, lalu user memilih salah satunya.
  
c. Lihat Reservasi
- Program menampilkan daftar semua data reservasi yang tersimpan (nama customer, tanggal, waktu, dan layanan).
Jika belum ada data, program menampilkan pesan bahwa daftar reservasi masih kosong.

d. Ubah Reservasi
- Program menampilkan daftar reservasi yang sudah ada.
- User memilih nomor reservasi yang ingin diubah.
- Program meminta input data baru (nama, tanggal, waktu, dan layanan).
- Data lama diganti dengan data baru sesuai input user, lalu ditampilkan pesan konfirmasi bahwa reservasi berhasil diubah.

e. Hapus Reservasi
- Program menampilkan daftar reservasi yang ada.
- User memilih nomor reservasi yang ingin dihapus.
- Data tersebut dihapus dari ArrayList, lalu ditampilkan pesan konfirmasi bahwa reservasi berhasil dihapus.

f. Cari Reservasi
- User menginput hanya dengan memasukkan nama customer yang telah reservasi.

f. Keluar dilakukan untuk mengakhiri program.







