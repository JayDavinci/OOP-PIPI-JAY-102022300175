// Don't delete any comments below!!!
// Todo : Import Arraylist and Scanner

import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenInventaris {
    private ArrayList<MakananKering> daftarMakananKering = new ArrayList<>();
    private ArrayList<MakananBasah> daftarMakananBasah = new ArrayList<>();

    // Todo : Create ArrayList of MakananKering (daftarMakananKering) and
    // MakananBasah (daftarMakananBasah) to store items

    public void tambahMakananKering() {
        Scanner input = new Scanner(System.in);
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and
        // Brand Makanan
        try {
            System.out.print("Masukkan nama makanan: ");
            String nama = input.nextLine();
            System.out.print("Masukkan jumlah makanan: ");
            int jumlah = input.nextInt();
            System.out.print("Masukkan harga makanan: ");
            double harga = input.nextDouble();
            input.nextLine();
            System.out.print("Masukkan bahan makanan: ");
            String brand = input.nextLine();
            MakananKering makananBaru = new MakananKering(nama, jumlah, harga, brand);
            daftarMakananKering.add(makananBaru);
            System.out.println("Makanan kering berhasil ditambahkan!");
        } finally {
            input.close();
        }
    }

    public void tambahMakananBasah() {
        Scanner input = new Scanner(System.in);
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and
        // Brand Makanan
        try {
            System.out.print("Masukkan nama makanan: ");
            String nama = input.nextLine();
            System.out.print("Masukkan jumlah makanan: ");
            int jumlah = input.nextInt();
            System.out.print("Masukkan harga makanan: ");
            double harga = input.nextDouble();
            input.nextLine();
            System.out.print("Masukkan bahan makanan: ");
            String bahan = input.nextLine();
            MakananBasah makananBaru = new MakananBasah(nama, jumlah, harga, bahan);
            daftarMakananBasah.add(makananBaru);
            System.out.println("Makanan basah berhasil ditambahkan!");
        } finally {
            input.close();
        }
    }

    public void tampilkanSemuaMakanan() {
        if (daftarMakananKering.isEmpty() && daftarMakananBasah.isEmpty()) {
            System.out.println("Tidak ada makanan dalam inventaris");
        } else {
            // Todo : Create print notification for Makanan Kering
            for (MakananKering mk : daftarMakananKering) {
                mk.tampilkanData();
                System.out.println();
            }
        }
        // Todo : Create print notification for Makanan Basah
        for (MakananBasah mk : daftarMakananBasah) {
            mk.tampilkanData();
            System.out.println();
        }

    }
}


