public class student {
    private String name;
    private String nomorMahasiswa;
    private int nilaiKorea;
    private int nilaiEnglish;
    private int nilaiMath;

    public student(String name, String nomorMahasiswa, int nilaiKorea, int nilaiEnglish, int nilaiMath) {
        this.name = name;
        this.nomorMahasiswa = nomorMahasiswa;
        this.nilaiKorea = nilaiKorea;
        this.nilaiEnglish = nilaiEnglish;
        this.nilaiMath = nilaiMath;
    }

    public String getName() {
        return name;
    }

    public String getnomorMahasiswa() {
        return nomorMahasiswa;
    }

    public void setnomorMahasiswa(String newnomorMahasiswa) {
        if (newnomorMahasiswa.startsWith("S") && newnomorMahasiswa.length() == 4) {
            String angka = newnomorMahasiswa.substring(1);
            this.nomorMahasiswa = String.format("STU%04d", Integer.parseInt(angka));
        } else {
            this.nomorMahasiswa = newnomorMahasiswa;
        }
    }

    public double hitungratarata() {
        return (nilaiKorea + nilaiEnglish + nilaiMath) / 3.0;
    }

    public void printStudentInfo() {
        System.out.println("Nama siswa : " + name);
        System.out.println("No siswa : " + nomorMahasiswa);
        System.out.println("Nilai B. Korea: " + nilaiKorea);
        System.out.println("Nilai B. Inggris : " + nilaiEnglish);
        System.out.println("Nilai matematika : " + nilaiMath);
        System.out.println("Rata-rata : " + hitungratarata());
    }
}
