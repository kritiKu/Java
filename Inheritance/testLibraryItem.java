package in.KGCoding.Inheritance;

public class testLibraryItem {
    public static void main(String[] args) {
        LibraryItem lib = new LibraryItem();
        lib.checkOut();
        lib.returnItem();

        Book book = new Book();
        book.checkOut();
        book.returnItem();

        Magzine mag = new Magzine();
        mag.checkOut();
        mag.returnItem();
    }
}
