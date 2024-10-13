public class Penumpang {
   private String NIK;
   private String namaDepan;
   private String namaBelakang;

   public Penumpang(String NIK, String namaDepan, String namaBelakang) {
      this.NIK = NIK;
      this.namaDepan = namaDepan;
      this.namaBelakang = namaBelakang;
   }

   // Tambahkan getter untuk mengakses data
   public String NIK() {
      return NIK;
   }

   public String Nama_Depan() {
      return namaDepan;
   }

   public String Nama_Belakang() {
      return namaBelakang;
   }

   public void tampilDaftarPenumpang() {
      System.out.println("NIK: " + NIK);
      System.out.println("Nama: " + namaDepan + " " + namaBelakang);
      System.out.println("----------------------------");
   }
}
