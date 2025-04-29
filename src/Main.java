import inventory.Inventory;
import products.Accessory;
import products.Book;
import products.Notebook;
import products.Product;

public class Main {

    public static double calculateTotalPrice (Inventory<? extends Product> inventory){
        double sum = 0 ;
        for (Product temp :inventory.getItems()){
            sum += temp.getPrice();
        }

        return sum;
    }

    public static void main(String[] args) {
        Inventory<Notebook> noteBookInv = new Inventory<>();
        Inventory<Book> bookInv = new Inventory<>();
        Inventory<Accessory> accessoryInv = new Inventory<>();


        Notebook notebook1 = new Notebook("yaddasht", 1000.0, 50, false);
        Notebook notebook2 = new Notebook("khaterat", 2000.0, 200, true);

        Book book1 = new Book("compound effect", 3000.0, "daren hardy", "olgo", "financial");
        Book book2 = new Book("My Struggle", 4000.0, "Hitler", "gaj", "Autobiography");

        Accessory accessory1 = new Accessory("faber castell", 500.0, "black");
        Accessory accessory2 = new Accessory("pen", 500.0, "blue");


        noteBookInv.addItems(notebook1);
        noteBookInv.addItems(notebook2);

        bookInv.addItems(book1);
        bookInv.addItems(book2);

        accessoryInv.addItems(accessory1);
        accessoryInv.addItems(accessory2);


        noteBookInv.displayAll();
        bookInv.displayAll();
        accessoryInv.displayAll();

        noteBookInv.removeItemsById(Integer.parseInt(notebook1.getId()));
        bookInv.removeItemsById(Integer.parseInt(book2.getId()));

        System.out.println("notebook total price: " + calculateTotalPrice(noteBookInv));
        System.out.println("book total price: " + calculateTotalPrice(bookInv));
        System.out.println("accessory total price: " + calculateTotalPrice(accessoryInv));

        noteBookInv.findItemsById(Integer.parseInt(notebook1.getId()));
        noteBookInv.findItemsById(Integer.parseInt(notebook2.getId()));

        accessoryInv.applyDiscount("faber castell", 10);
        accessoryInv.applyDiscount("pen", 100);

        noteBookInv.displayAll();
        bookInv.displayAll();
        accessoryInv.displayAll();
    }
}