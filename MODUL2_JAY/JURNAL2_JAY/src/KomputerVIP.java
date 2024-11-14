class KomputerVIP extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean vipCard;

    // To do: Buatlah constructor pada class KomputerVIP
    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }

    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang
    // sesuai dengan ketentuan
    @Override
    public void Informasi() {
        super.Informasi();
        if (vipCard == true) {
            System.out.println("== Benefit MEMBER VIP ==");
            System.out.println("- Diskon 10% untuk bermain di atas 3 Jam");
            System.out.println("- Gratis Minuman setiap 4 jam bermain");
            System.out.println("- Prioritas Booking !!!");
        }

        else {
            System.out.println("Benefit MemberVIP: Jgn Ngarep ada benfit CUYYY!!!");
        }
        // System.out.println("VIP Card: " + (vipCard ? "Yes" : "No"));
    }
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh
    // materi modul!)

    // To do: Buatlah method Login sesuai dengan ketentuan
    public void Login(String Username) {
        System.out.println("User " + Username + " telah login.");
    }

    // overloading
    // To do: Buatlah method Bermain sesuai dengan ketentuan
    public void Bermain(int jam) {
        System.out.println("Durasi bermain: " + jam + " jam.");
    }

    // To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan
    // ketentuan
    public void Bermain(int jam, int menitTambahan) {
        System.out.println("Durasi Tambahan: " + jam + " jam dan " + menitTambahan + " menit.");
    }

}