class Order {
    private Product product;
    private int quantity;

    public Order(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public String getDetails() {
        return "\"" + this.product.getName() + "\" Quantity: " + this.quantity;
    }
}

class Product {
    private String name;
    private int price;
    private int stock;

    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getOrder() {
        return "\"" + this.name + "\" Stock: " + this.stock + " Price: " + this.price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
}

public class Customer {

    private Order[] orders;
    private Product[] products;
    private String name;
    private int items;

    public Customer(String name) {
        this.orders = new Order[10];
        this.products = new Product[3];
        this.name = name;
        this.items = 0;
        products[0] = new Product("Apple", 10, 20);
        products[1] = new Product("Banana", 6, 10);
        products[2] = new Product("Carrot", 25, 12);
    }

    public void displayCart() {
        System.out.println("--------Shopping Cart--------");
        System.out.println(this.name);
        for (int i = 0; i < this.items; i++) {
            System.out.println(this.orders[i].getDetails());
        }
    }

    public void displayProducts() {
        System.out.println("--------Available Products--------");
        for (int i = 0; i < 3; i++) {
            System.out.println(this.products[i].getOrder());
        }
    }

    public void addProduct(Product product, int quantity) {
        this.orders[this.items] = new Order(product, quantity);
        this.items++;
        System.out.println("Product added to the cart: " + product.getName());
    }

    public static void main(String[] args) {
        Customer customer = new Customer("John Doe");

        customer.displayProducts();
        System.out.println();

        Product product1 = new Product("Apple", 10, 20);
        Product product2 = new Product("Banana", 6, 10);

        customer.addProduct(product1, 3);
        customer.addProduct(product2, 2);

        System.out.println();
        customer.displayCart();
    }
}
