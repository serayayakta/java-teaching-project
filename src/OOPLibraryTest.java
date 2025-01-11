public class OOPLibraryTest {

    // 1. ABSTRACTION (Soyutlama)
    //    - We define an abstract class LibraryItem that hides common details
    //      (title, borrowed status) and declares abstract methods borrowItem() and returnItem().
    public static abstract class LibraryItem {
        private final String title;
        private boolean isBorrowed;

        public LibraryItem(String title) {
            this.title = title;
            this.isBorrowed = false;
        }

        public String getTitle() {
            return title;
        }

        public boolean isBorrowed() {
            return isBorrowed;
        }

        protected void setBorrowed(boolean borrowed) {
            this.isBorrowed = borrowed;
        }

        // Abstract methods — must be implemented by subclasses
        public abstract void borrowItem();
        public abstract void returnItem();
    }

    // 2. ENCAPSULATION (Kapsülleme)
    //    - Book class keeps its fields private and only exposes them via methods.
    //    - Outside code can't directly modify title or borrowed status.
    public static class Book extends LibraryItem {
        private final String author;
        private final String publisher;

        public Book(String titleInput, String authorInput, String publisherInput) {
            super(titleInput);
            this.author = authorInput;
            this.publisher = publisherInput;
        }

        public String getAuthor() {
            return author;
        }

        @Override
        public void borrowItem() {
            if (!isBorrowed()) {
                setBorrowed(true);
                System.out.println("Borrowing BOOK: " + getTitle()
                        + " by " + getAuthor()
                        + " [Encapsulation: changed 'isBorrowed' via setter]");
            } else {
                System.out.println("BOOK already borrowed: " + getTitle());
            }
        }

        @Override
        public void returnItem() {
            if (isBorrowed()) {
                setBorrowed(false);
                System.out.println("Returning BOOK: " + getTitle());
            } else {
                System.out.println("BOOK wasn't borrowed: " + getTitle());
            }
        }
    }

    // 3. INHERITANCE (Kalıtım)
    //    - Magazine extends LibraryItem, so it reuses fields (title, isBorrowed)
    //      and logic, but has its own unique issueNumber.
    public static class Magazine extends LibraryItem {
        private int issueNumber;

        public Magazine(String title, int issueNumber) {
            super(title);
            this.issueNumber = issueNumber;
        }

        public int getIssueNumber() {
            return issueNumber;
        }

        @Override
        public void borrowItem() {
            if (!isBorrowed()) {
                setBorrowed(true);
                System.out.println("Borrowing MAGAZINE: " + getTitle()
                        + ", Issue #" + getIssueNumber()
                        + " [Inheritance: extends LibraryItem]");
            } else {
                System.out.println("MAGAZINE already borrowed: " + getTitle());
            }
        }

        @Override
        public void returnItem() {
            if (isBorrowed()) {
                setBorrowed(false);
                System.out.println("Returning MAGAZINE: " + getTitle()
                        + ", Issue #" + getIssueNumber());
            } else {
                System.out.println("MAGAZINE wasn't borrowed: " + getTitle());
            }
        }
    }

    /*public static void main(String[] args) {

        System.out.println("==== OOP PILLARS DEMO - Starting in main() ====");
        System.out.println("We will create Book and Magazine objects and store them "
                + "in LibraryItem references to demonstrate Polymorphism.");

        // 4. POLYMORPHISM (Çok Biçimlilik)
        //    - Both Book and Magazine are referred to by the abstract type LibraryItem,
        //      but each has different implementations of borrowItem() and returnItem().
        //LibraryItem item1 = new Book("The Java Handbook", "John Doe");
        LibraryItem item2 = new Magazine("Tech Today", 34);

        System.out.println("\n1) Creating two LibraryItem objects:");
        System.out.println("   - item1 is a Book");
        System.out.println("   - item2 is a Magazine");
        System.out.println("   [Inheritance: Book and Magazine extend LibraryItem]\n");

        System.out.println("2) Borrowing items: Demonstrates Polymorphism and Encapsulation.\n"
                + "   - Each subclass implements borrowItem() in a unique way.");

        // Borrow each item
        //item1.borrowItem();  // Calls Book's borrowItem()
        item2.borrowItem();  // Calls Magazine's borrowItem()

        System.out.println("\n3) Returning items: Again, Polymorphism at work.\n"
                + "   - Each subclass implements returnItem() differently.");

        // Return each item
        //item1.returnItem();
        item2.returnItem();

        System.out.println("\n4) Checking isBorrowed() status: Demonstrates Encapsulation.");
        System.out.println("   - We can't directly set 'isBorrowed', we check via a getter.\n");
        //System.out.println("Item 1 (Book) borrowed? " + item1.isBorrowed());
        System.out.println("Item 2 (Magazine) borrowed? " + item2.isBorrowed());

        System.out.println("\n=== WHAT IS HAPPENING IN main() ===");
        System.out.println("• ABSTRACTION: We used an abstract class (LibraryItem) with shared fields/methods.");
        System.out.println("• ENCAPSULATION: Private fields, changed only through borrowItem() / returnItem().");
        System.out.println("• INHERITANCE: Book and Magazine extend LibraryItem.");
        System.out.println("• POLYMORPHISM: The same methods (borrowItem(), returnItem()) behave differently "
                + "for Book vs. Magazine.\n");

        System.out.println("==== END OF DEMO ====");
    }
*/
}
