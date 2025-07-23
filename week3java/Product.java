// Task 2: Product.java
public class Product {
    private String name;
    private double price;

    public Product() {
        this.name = "Unknown";
        this.price = 0.0;
    }

    public Product(String name) {
        this.name = name;
        this.price = 0.0;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println("Product: " + name + ", Price: " + price);
    }
}