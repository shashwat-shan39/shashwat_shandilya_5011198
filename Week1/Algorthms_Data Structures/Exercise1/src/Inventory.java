import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private final Map<String, Product> productMap;

    public Inventory() {
        productMap = new HashMap<>();
    }

    // Method to add a product
    public void addProduct(Product product) {
        if (productMap.containsKey(product.getProductId())) {
            System.out.println("Product with ID " + product.getProductId() + " already exists.");
        } else if (product.getProductName() == null || product.getProductName().isEmpty()) {
            System.out.println("Product must have a name.");
        } else if (product.getQuantity() < 0) {
            System.out.println("Quantity must be greater than or equal to zero.");
        } else if(product.getPrice() < 0){
            System.out.println("Price must be greater than or equal to zero.");
        }
        else {
            productMap.put(product.getProductId(), product);
        }
    }


    // Method to update a product
    public void updateProduct(String productId, Product updatedProduct) {
        if (productMap.containsKey(productId)) {
            productMap.put(productId, updatedProduct);
        } else {
            System.out.println("Product not found.");
        }
    }

    // Method to delete a product
    public void deleteProduct(String productId) {
        if (productMap.containsKey(productId)) {
            productMap.remove(productId);
        } else {
            System.out.println("Product not found.");
        }
    }

    // Method to display the inventory
    public void displayInventory() {
        for (Product product : productMap.values()) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product product1 = new Product("001", "Shoes", 7, 99.99);
        Product product2 = new Product("002", "Tennis Ball", 18, 5.99);
        Product product3 = new Product("003", "T-Shirt", 39, 49.99);
        Product product4 = new Product("002", "Sun Glasses", 21, 1.99);  // Duplicate ID for testing

        System.out.println("\n--- Adding Products ---");
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);
        inventory.addProduct(product4);  // This should print a warning about the duplicate ID

        System.out.println("\n--- Inventory After Adding Products ---");
        inventory.displayInventory();

        System.out.println("\n--- Updating Product Price ---");
        product2.setPrice(1.99);
        inventory.updateProduct("002", product2);

        System.out.println("\n--- Inventory After Updating Product Price ---");
        inventory.displayInventory();

        System.out.println("\n--- Deleting a Product ---");
        inventory.deleteProduct("003");

        System.out.println("\n--- Inventory After Deleting a Product ---");
        inventory.displayInventory();
    }
}