package Classes;

import java.util.ArrayList;


public class Storage {
    private int Capacity;
    private  double TotalCost;

    public static ArrayList<Product> ProductArray = new ArrayList<>();

    public void addProduct(String name, double price, int quantity) {
        Product product = new Product(name, price, quantity);
        this.TotalCost += price * quantity;
        ProductArray.add(product);
        this.Capacity -= quantity;
    }

    public void addProduct(Product product) {
        this.TotalCost += product.price * product.quantity;
        ProductArray.add(product);
        this.Capacity -= product.quantity;
    }

    public Storage(int Capacity) {
        this.Capacity = Capacity;
    }


    public static void main(String[] args) {
        Product productOne = new Product("cucumber", 1.50, 15);
        Product productTwo = new Product("tomato", 0.90, 25);
        Product productThree = new Product("bread", 1.10, 8);
        Storage storage1 = new Storage(200);
        storage1.addProduct(productOne);
        storage1.addProduct(productOne);
        storage1.addProduct(productThree);
        for (int i = 0; i < Storage.ProductArray.size(); i++) {
            Product product = Storage.ProductArray.get(i);
            System.out.printf("{name: %s, price: %.2f, quantity: %d}%n", product.name, product.price, product.quantity);
        }
        System.out.println(storage1.TotalCost);
        System.out.println(storage1.Capacity);



    }

    public static class Product {
        private String name;
        private double price;
        private int quantity;

        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
    }
}


