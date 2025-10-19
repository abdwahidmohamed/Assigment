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

        // Calculate final price with 5% VAT
        public double finalPrice() {
            double priceAfterDiscount = price - (price * discount / 100);
            return priceAfterDiscount + (priceAfterDiscount * 0.05); // 5% VAT
        }

        // Display product details
        public void displayDetails() {
            System.out.println("Product ID: " + id);
            System.out.println("Product Name: " + name);
            System.out.println("Original Price: $" + price);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Price After Discount: $" + priceAfterDiscount());
            System.out.println("Final Price with 5% VAT: $" + finalPrice());
            System.out.println("===============================");
        }
    }

    // Main method moved here (outer class)
    public static void main(String[] args) {
        Product p1 = new Product("P1", "Laptop", 300, 15);
        Product p2 = new Product("P2", "Mouse", 5, 1.5);
        Product p3 = new Product("P3", "Keyboard", 10, 2);

        p1.displayDetails();
        p2.displayDetails();
        p3.displayDetails();
    }
}
