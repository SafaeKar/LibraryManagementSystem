public class LibrarySystem {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[4];

        items[0] = new Book("1984", "George Orwell", "Dystopian");
        items[1] = new Magazine("National Geographic", "Various", 2023);
        items[2] = new Journal("IEEE Transactions", "John Doe", "Engineering");
        items[3] = new EBook("Digital Fortress", "Dan Brown", 5.2, "PDF");

        for (LibraryItem item : items) {
            item.displayInfo();
            System.out.println("Item Type: " + item.getItemType());
            System.out.println();  // Pour la lisibilité
        }
    }
}
