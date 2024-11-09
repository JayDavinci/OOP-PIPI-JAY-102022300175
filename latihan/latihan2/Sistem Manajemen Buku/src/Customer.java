public class Customer {
   private int totalPrice;
   private String name;

   public Customer(String name) {
      this.name = name;
      this.totalPrice = 0;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getTotalPrice() {
      return totalPrice;
   }

   public void setTotalPrice(int totalPrice) {
      this.totalPrice = totalPrice;
   }

   public void buyBook(Book book, int quantity) {
      if (book.getStockQuantity() < quantity) {
         System.out.printf("[Error] Persediaannya kurang. Jumlah persediaan saat ini : %djilid\n",
               book.getStockQuantity());
         return;
      }
      if (quantity == 0) {
         System.out.println("[Error] 0jilid Kurang, tidak dapat di beli.");
         return;
      }

      book.setStockQuantity(book.getStockQuantity() - quantity);
      int purchasePrice = book.getPrice() * quantity;
      totalPrice += purchasePrice;
      System.out.printf("%s telah membeli %s. Jumlah total: %,d\n",
            name, book.getTitle(), purchasePrice);
   }

   public void buyBook(SecondBook book) {
      if (book.getStockQuantity() <= 0) {
         System.out.printf("[Error] Persediaannya kurang. Jumlah persediaan saat ini : %djilid\n",
               book.getStockQuantity());
         return;
      }

      int discountedPrice = book.getPrice() * (100 - book.getDiscountRate()) / 100;
      totalPrice += discountedPrice;
      book.setStockQuantity(0);
      System.out.printf("%s telah membeli %s. Jumlah total: %,d\n",
            name, book.getTitle(), discountedPrice);
   }

   @Override
   public String toString() {
      return String.format("Nama Pelanggan : %s Jumlah total : %,d", name, totalPrice);
   }
}