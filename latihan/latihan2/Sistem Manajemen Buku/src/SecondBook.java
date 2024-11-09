public class SecondBook extends Book {
    private String seller;
    private int discountRate;

    public SecondBook(String title, String author, int price, String seller, int discountRate) {
        super(title, author, price, 1); // Stock quantity is always 1 for second-hand books
        this.seller = seller;
        this.discountRate = discountRate;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Tingkat diskon : %d%% Penjual : %s", 
            discountRate, seller);
    }
}
