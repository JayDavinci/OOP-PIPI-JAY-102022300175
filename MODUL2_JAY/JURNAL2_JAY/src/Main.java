public class Main {
    public static void main(String[] args) {

        // To do: Buatlah sebuah Objek baru dari class Komputer
        Komputer komputerBiasa = new Komputer(10, "Warnet JEJE", 5000.0f);
        System.out.println("=== Informasi Komputer Biasa ===");
        // To do: Panggillah Method Informasi dari class Komputer
        komputerBiasa.Informasi();
        System.out.println("===================================");
        System.out.println();

        // To do: Buatlah sebuah Objek baru dari class KomputerVIP
        KomputerVIP komputerVIP = new KomputerVIP(15, "Warnet JEJE", 10000.0f, true);
        // To do: Panggillah Method Informasi dari class KomputerVIP
        komputerVIP.Informasi();
        System.out.println();
        // To do: Panggillah Method Login
        komputerVIP.Login("JAYYY");
        // To do: Panggillah Method Bermain 2x agar dapat melakukan polymorphism
        komputerVIP.Bermain(2);
        komputerVIP.Bermain(1, 30);
        System.out.println("===================================");
        // overloading

        System.out.println();

        // To do: Buatlah sebuah Objek baru dari class KomputerPremium
        KomputerPremium komputerPremium = new KomputerPremium(10, "Warnet JEJE", 12000.0f, true);
        // To do: Panggillah Method Informasi dari class KomputerPremium
        komputerPremium.Informasi();
        // To do: Panggillah Method Pesan
        komputerPremium.Pesan(5);
        // To do: Panggillah Method TambahLayanan 2x agar dapat melakukan polymorphism
        komputerPremium.TambahLayanan("Pizza");
        komputerPremium.TambahLayanan("Nasi Padang", "Es-Teh");
        // overloading

    }
}