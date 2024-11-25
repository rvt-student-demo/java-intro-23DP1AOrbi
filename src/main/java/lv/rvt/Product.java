package lv.rvt;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private String location;
    private int weight;

    public Product (String initialName, double initialPrice, int initalQuantity) {
        this.name =  initialName;
        this.price = initialPrice;
        this.quantity = initalQuantity;
    }
    public Product(String name) {
        this.name = name;
        this.location = "shelf";
        this.weight = 1;
    }
    public Product(String name, String location) {
        this.name = name;
        this.location = location;
        this.weight = 1;
    }

    public Product(String name, int weight) {
        this.name = name;
        this.weight = weight;
        this.location = "shelf";
    }

    public void printProduct() {
        System.out.println(name + ", price " + price + ", "+ quantity + " pcs");
    }
    public String toString() {
        return name + " (" + weight + " kg) can be found from the " + location;
    }

}
