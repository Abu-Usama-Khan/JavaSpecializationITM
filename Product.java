public class Product {
    String name;
    int price;

    Product() {
        this.name = "Usama";
        this.price = 280;
    }
    public void Product(String n) {
        this.name = n;
        this.price = 280;
    }
    public void Product(String n, int a) {
        this.name = n;
        this.price = a;
    }

    public void showDetails() {
        System.out.println("The Name of product is: "+this.name);
        System.out.println("The price of product is: "+this.price);
    }
}
