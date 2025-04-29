package products;

public abstract class Product {

    public Product(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    private static int num = 1;

    private String title;
    private Double price;
    private String id;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString (){

        return "Product Name: " + title + "\nPrice: " + price + "\nId: " + id;
    }

    protected abstract String generateId();
}
