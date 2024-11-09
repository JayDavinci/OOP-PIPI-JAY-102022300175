import java.util.ArrayList;
import java.util.Scanner;

// Detail Data Diri:
// NIM: 102022300175
// Nama depan: Jay
// Nama belakang: SI-47-09

public class Pembelian {
   public static void main(String[] args) {
      ArrayList<Penerbangan> daftarPenerbangan = new ArrayList<>();
      ArrayList<Penumpang> daftarPenumpang = new ArrayList<>();
      ArrayList<Penerbangan> daftarPenerbanganPesanan = new ArrayList<>();

      daftarPenerbangan.add(new Penerbangan("Lion Air", "CGK, Jakarta", "DPS, Bali", "06:30", "08:15", 1200000));
      daftarPenerbangan.add(new Penerbangan("Batik Air", "SUB, Surabaya", "KNO, Medan", "09:00", "11:45", 1500000));
      daftarPenerbangan.add(new Penerbangan("Wings Air", "SUB, Surabaya", "CGK, Jakarta", "07:30", "09:30", 900000));
      daftarPenerbangan.add(new Penerbangan("Garuda", "SUB, Surabaya", "DPS, Bali", "09:00", "10.30", 2000000));

      Scanner scanner = new Scanner(System.in);
      boolean exit = false;

      while (!exit) {
         System.out.println("====== EAD Ticket Booking System ======");
         System.out.println("1. Tampilkan Daftar Penerbangan");
         System.out.println("2. Beli Tiket");
         System.out.println("3. Tampilkan Pesanan Tiket");
         System.out.println("4. Exit");
         System.out.print("Silahkan pilih menu: ");

         int pilihan = scanner.nextInt();
         scanner.nextLine();

         switch (pilihan) {
            case 1:
               System.out.println("Daftar Penerbangan:");
               for (int i = 0; i < daftarPenerbangan.size(); i++) {
                  Penerbangan p = daftarPenerbangan.get(i);
                  System.out.println((i + 1) + ". ");
                  System.out.println("Nomor Penerbangan: " + p.Nomor_Penerbangan());
                  System.out.println("Bandara Keberangkatan: " + p.Bandara_Keberangkatan() + " ---> Bandara Tujuan: "
                        + p.Bandara_Tujuan());
                  System.out.println("Waktu Keberangkatan: " + p.Waktu_Keberangkatan() + " ---> Waktu Kedatangan: "
                        + p.Waktu_Kedatangan());
                  System.out.println("Harga Tiket: Rp." + p.Harga_Tiket());
                  System.out.println("----------------------------\n");
               }
               break;

            case 2:
               System.out.println("Silahkan isi data diri anda terlebih dahulu!");
               System.out.print("Masukkan NIK: ");
               String NIK = scanner.nextLine();

               System.out.print("Masukkan Nama Depan: ");
               String namaDepan = scanner.nextLine();

               System.out.print("Masukkan Nama Belakang: ");
               String namaBelakang = scanner.nextLine();

               System.out.println(
                     "Terima Kasih telah Mengisi Data Pelanggan. Silakan Pilih Tiket Penerbangan Yang Tersedia:\n");
               for (int i = 0; i < daftarPenerbangan.size(); i++) {
                  Penerbangan p = daftarPenerbangan.get(i);
                  System.out.println((i + 1) + ". ");
                  System.out.println("Nomor Penerbangan: " + p.Nomor_Penerbangan());
                  System.out.println("Bandara Keberangkatan: " + p.Bandara_Keberangkatan() + " ---> Bandara Tujuan: "
                        + p.Bandara_Tujuan());
                  System.out.println("Waktu Keberangkatan: " + p.Waktu_Keberangkatan() + " ---> Waktu Kedatangan: "
                        + p.Waktu_Kedatangan());
                  System.out.println("Harga Tiket: Rp." + p.Harga_Tiket());
                  System.out.println("----------------------------\n");
               }

               System.out.print("Pilih nomor penerbangan (ex: 1): ");
               int nomor = scanner.nextInt();
               scanner.nextLine();

               if (nomor > 0 && nomor <= daftarPenerbangan.size()) {
                  Penerbangan penerbanganDipilih = daftarPenerbangan.get(nomor - 1);

                  Penumpang penumpang = new Penumpang(NIK, namaDepan, namaBelakang);

                  daftarPenumpang.add(penumpang);
                  daftarPenerbanganPesanan.add(penerbanganDipilih);
                  System.out.println("Pemesanan Tiket Berhasil Dilakukan, Cek Pesanan Tiket pada Menu (3)");
               } else {
                  System.out.println("Nomor penerbangan tidak valid.");
               }
               break;

            case 3:
               if (daftarPenumpang.size() == 0) {
                  System.out.println("Pembelian Tiket Tidak Ada\n");
               } else {
                  System.out.println("\n======= Detail Tiket Penerbangan =======");
                  for (int i = 0; i < daftarPenumpang.size(); i++) {
                     Penumpang penumpang = daftarPenumpang.get(i);
                     Penerbangan penerbangan = daftarPenerbanganPesanan.get(i);
                     System.out.println("Nomor Induk Kependudukan: " + penumpang.NIK());
                     System.out.println("Nama Depan :" + penumpang.Nama_Depan());
                     System.out.println("Nama Belakang :" + penumpang.Nama_Belakang());
                     System.out.println("Nomor Penerbangan: " + penerbangan.Nomor_Penerbangan());
                     System.out.println("Bandara Keberangkatan: " + penerbangan.Bandara_Keberangkatan()
                           + " ---> Bandara Tujuan: " + penerbangan.Bandara_Tujuan());
                     System.out.println("Waktu Keberangkatan: " + penerbangan.Waktu_Keberangkatan()
                           + " ---> Waktu Kedatangan: " + penerbangan.Waktu_Kedatangan());
                     System.out.println("Harga Tiket: Rp." + penerbangan.Harga_Tiket());
                     System.out.println("---------------------------------------\n");
                  }
               }
               break;
            case 4:
               System.out.println("Terima kasih telah menggunakan EAD Ticket Booking System.");
               exit = true;
               break;

            default:
               System.out.println("Pilihan tidak valid.");
               break;
         }
      }
      scanner.close();
   }
}
