
public class BookTest {
    public static void main(String[] args) {
        // Create books array
        Book[] books = new Book[] {
            new Book("Apa itu keadilan?", "Michael Sandel", 15000, 15),
            new Book("Pistol, kuman dan Besi", "Jared Diamond", 28000, 3),
            new Book("Street of Dark Shops", "Patrick Modiano", 11000, 12),
            new Book("Perjalanan Mr. Cuffe menuju kebahagiaan", "François Leroy", 13500, 1)
        };

        // Create second-hand books array
        SecondBook[] secondBooks = new SecondBook[] {
            new SecondBook("Penjelajah warisan budaya", "Yoo Hong-Jun", 13000, "IU", 45),
            new SecondBook("Cerita pendek Tolstoy", "Tolstoy", 16000, "Kim Soo-hyun", 40)
        };

        // Create customers array
        Customer[] customers = new Customer[] {
            new Customer("Na Gong-Bu"),
            new Customer("Kim Sin-ip")
        };

        // Print initial book information
        System.out.println("--informasi buku");
        printSeparator();
        printBooks(books);
        printBooks(secondBooks);
        printSeparator();

        // Perform purchases
        customers[0].buyBook(books[2], 3); // Na Gong-Bu buys Street of Dark Shops
        customers[0].buyBook(books[1], 0); // Na Gong-Bu tries to buy 0 copies
        customers[0].buyBook(secondBooks[1]); // Na Gong-Bu buys Tolstoy
        customers[0].buyBook(books[0], 1); // Na Gong-Bu buys Justice

        customers[1].buyBook(secondBooks[1]); // Kim Sin-ip tries to buy sold out book
        customers[1].buyBook(books[3], 2); // Kim Sin-ip tries to buy more than stock
        customers[1].buyBook(books[1], 3); // Kim Sin-ip buys Guns, Germs and Steel

        // Print final book information
        System.out.println("--Informasi buku");
        printSeparator();
        printBooks(books);
        printBooks(secondBooks);
        printSeparator();

        // Print customer information
        System.out.println("--Informasi pembelian");
        printSeparator();
        for (Customer customer : customers) {
            System.out.println(customer);
        }
        printSeparator();
    }

    private static void printBooks(Book[] books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private static void printSeparator() {
        System.out.println("----------------------------------------" +
                         "----------------------------------------" +
                         "--------------------");
    }
}
