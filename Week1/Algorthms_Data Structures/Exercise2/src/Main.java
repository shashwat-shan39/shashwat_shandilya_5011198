public class Main {
    public static void main(String[] args) {

        Product[] products = {
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Smartphone", "Electronics"),
                new Product(3, "Headphones", "Accessories"),
                new Product(4, "Shoes", "Footwear"),
                new Product(5, "Watch", "Accessories")
        };

        // Linear Search Example
        String targetName1 = "Smartphone";
        Product result1 = searchingFun.linearSearch(products, targetName1);
        if (result1 != null) {
            System.out.println("Linear Search: Product found - " + result1);
        } else {
            System.out.println("Linear Search: Product not found.");
        }

        // Binary Search Example
        String targetName2 = "Watch";
        Product result2 = searchingFun.binarySearch(products, targetName2);
        if (result2 != null) {
            System.out.println("Binary Search: Product found - " + result2);
        } else {
            System.out.println("Binary Search: Product not found.");
        }

        // Trying to search for a product that doesn't exist
        String targetName3 = "Tablet";
        Product result3 = searchingFun.binarySearch(products, targetName3);
        if (result3 != null) {
            System.out.println("Binary Search: Product found - " + result3);
        } else {
            System.out.println("Binary Search: Product not found.");
        }
    }
}
