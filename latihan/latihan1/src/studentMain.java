import java.util.Scanner;

public class studentMain {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Masukkan nama siswa: ");
      String name = scanner.nextLine();

      System.out.println("Masukkan nomor siswa: ");
      String nomorMahasiswa = scanner.nextLine();

      System.out.println("Masukkan nilai B. Korea: ");
      int nilaiKorea = scanner.nextInt();

      System.out.println("Masukkan nilai B. Inggris: ");
      int nilaiEnglish = scanner.nextInt();

      System.out.println("Masukkan nilai Matematika: ");
      int nilaiMath = scanner.nextInt();

      student siswa = new student(name, nomorMahasiswa, nilaiKorea, nilaiEnglish, nilaiMath);

      System.out.println("\nInformasi Siswa Sebelum Pengubahan Nomor:");
      siswa.printStudentInfo();

      siswa.setnomorMahasiswa(siswa.getnomorMahasiswa());

      System.out.println("\nInformasi Siswa Setelah Pengubahan Nomor:");
      siswa.printStudentInfo();

      scanner.close();
   }
}
