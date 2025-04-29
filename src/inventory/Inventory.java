package inventory;

import products.Product;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Inventory<T extends Product> {
    private ArrayList<T>items;

    public Inventory (){
        items = new ArrayList<>();
    }

    public void setItems(ArrayList<T> items) {
        this.items = items;
    }

    public ArrayList<T> getItems() {
        return items;
    }

    public void applyDiscount (String productName, int discount){
        for (T temp : items){
            if(temp.getTitle().equals(productName))
            {
                temp.setPrice(temp.getPrice()*((100-discount)/100));
                return;
            }
        }

        throw new NoSuchElementException("product not found");

    }

    public void addItems (T product){
        items.add(product);
    }

    public void displayAll(){
        for (Product temp : items){
            System.out.println(temp.toString() + "\n***************");
        }
    }

    public T findItemsById(int id){
        for (T temp : items){
            if(Integer.parseInt(temp.getId()) == id)
            {
                return temp;

            }
        }
        System.out.println("item not found");
        return null;
    }

    public void removeItemsById(int id){
        for(int i = 0 ; i<items.size() ; i++){
            if(Integer.parseInt(items.get(i).getId()) == id){
                items.remove(i);
                return;
            }
        }
    }

}
