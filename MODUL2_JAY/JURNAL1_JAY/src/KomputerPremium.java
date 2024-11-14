class KomputerPremium extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected Boolean ruangPrivat;

    // To do: Buatlah constructor pada class KomputerPremium
    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang
    // sesuai dengan ketentuan

    @Override
    public void Informasi() {
        super.Informasi();
        if (ruangPrivat == true) {
            System.out.println("Fasilitas Ruang Premium:");
            System.out.println("- Ruangan Ber-AC pribadi");
            System.out.println("- Sofa Gaming Exclusive");
            System.out.println("- Komputer Spesifikasi Tertinggi");
            System.out.println("- Koneksi internet dedicated 10000000mbps");
        } else {
            System.out.println("Fasilitas Ruang Biasa:");
            System.out.println("- Panas");
            System.out.println("- Bau");
            System.out.println("- Komputer Spesifikasi Terendah");
            System.out.println("- Koneksi internet dedicated -10000000mbps");
        }
        // System.out.println("Ruang Privat: " + (ruangPrivat ? "Yes" : "No"));
    }
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh
    // materi modul!)

    // To do: Buatlah method Pesan sesuai dengan ketentuan
    public void Pesan(int nomorKomputer) {
        System.out.println("Komputer nomor " + nomorKomputer + " telah dipesan.");
    }

    // Overloading
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    public void TambahLayanan(String makanan) {
        System.out.println("Layanan makanan: " + makanan);
    }

    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai
    // dengan ketentuan
    public void TambahLayanan(String makanan, String minuman) {
        System.out.println("Layanan makanan: " + makanan + ", minuman: " + minuman);
    }

}
