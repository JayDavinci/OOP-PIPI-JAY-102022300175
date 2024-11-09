public class Penerbangan {
   private String nomorPenerbangan;
   private String bandaraKeberangkatan;
   private String bandaraTujuan;
   private String waktuKeberangkatan;
   private String waktuKedatangan;
   private float hargaTiket;

   public Penerbangan(String nomorPenerbangan, String bandaraKeberangkatan, String bandaraTujuan,
         String waktuKeberangkatan, String waktuKedatangan, float hargaTiket) {
      this.nomorPenerbangan = nomorPenerbangan;
      this.bandaraKeberangkatan = bandaraKeberangkatan;
      this.bandaraTujuan = bandaraTujuan;
      this.waktuKeberangkatan = waktuKeberangkatan;
      this.waktuKedatangan = waktuKedatangan;
      this.hargaTiket = hargaTiket;
   }

   public String Nomor_Penerbangan() {
      return nomorPenerbangan;
   }

   public String Bandara_Keberangkatan() {
      return bandaraKeberangkatan;
   }

   public String Bandara_Tujuan() {
      return bandaraTujuan;
   }

   public String Waktu_Keberangkatan() {
      return waktuKeberangkatan;
   }

   public String Waktu_Kedatangan() {
      return waktuKedatangan;
   }

   public float Harga_Tiket() {
      return hargaTiket;
   }

   public void tampilDaftarPenerbangan() {
      System.out.println("Nomor Penerbangan: " + nomorPenerbangan);
      System.out.println("Bandara Keberangkatan: " + bandaraKeberangkatan);
      System.out.println("Bandara Tujuan: " + bandaraTujuan);
      System.out.println("Waktu Keberangkatan: " + waktuKeberangkatan);
      System.out.println("Waktu Kedatangan: " + waktuKedatangan);
      System.out.println("Harga Tiket: Rp" + hargaTiket);
      System.out.println("----------------------------");
   }
}
