package in.KGCoding.Inheritance;

public class LibraryItem {
    private String itemId;
    private String title;
    private String Author;

    public void checkOut(){
        System.out.println("Checkout completed");
    }

    public void returnItem(){
        System.out.println("Returning the item");
    }
}
