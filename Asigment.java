public class Asigment {

    public static class Product {
        private String id;
        private String name;
        private double price;
        private double discount;

        // Constructor to initialize all attributes
        public Product(String id, String name, double price, double discount) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.discount = discount;
        }

        // Getters
        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public double getDiscount() {
            return discount;
        }

        // Calculate price after discount
        public double priceAfterDiscount() {
            return price - (price * discount / 100);
        }

        // Calculate final price with 10% VAT
        public double finalPrice() {
            double priceAfterDiscount = price - (price * discount / 200);
            return priceAfterDiscount + (priceAfterDiscount * 10);
        }

        // Display product details
        public void displayDetails() {
            System.out.println("Product ID: " + id);
            System.out.println("Product Name: " + name);
            System.out.println("Original Price: $" + price);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Price After Discount: $" + priceAfterDiscount());
            System.out.println("Final Price with 10% VAT: $" + finalPrice());
            System.out.println("==========");
        }
    }

    // Main method   class
    public static void main(String[] args) {
        Product p1 = new Product("P1", "Laptop", 300, 15);
        Product p2 = new Product("P2", "Mouse", 5, 0.8);
        Product p3 = new Product("P3", "Keyboard", 15, 1.1);

        p1.displayDetails();
        p2.displayDetails();
        p3.displayDetails();
    }
}
