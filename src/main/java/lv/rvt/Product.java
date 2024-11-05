package lv.rvt;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product (String initialName, double initialPrice, int initalQuantity) {
        this.name =  initialName;
        this.price = initialPrice;
        this.quantity = initalQuantity;
    }
    public void printProduct() {
        System.out.println(name + ", price " + price + ", "+ quantity + " pcs");
    }

}
