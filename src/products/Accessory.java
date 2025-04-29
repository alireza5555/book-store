package products;

public class Accessory extends Product {
    protected static final int ACCESSORY= 3000;

    private String color;

    public Accessory(String title, Double price, String color) {
        super(title, price);
        this.color = color;
        setId(generateId());
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    protected String generateId() {
        String temp = String.valueOf(ACCESSORY + num);
        num++;
        return temp;

    }

}
