public class Main {
    public static void main(String[] args) {
        // Sample data
        Order[] orders = {
                new Order(101, "Alice", 250.50),
                new Order(102, "Bob", 150.00),
                new Order(103, "Charlie", 300.00),
                new Order(104, "David", 200.75)
        };

        // Print original orders
        System.out.println("Original Orders:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Sort using Bubble Sort
        Order[] bubbleSortedOrders = orders.clone();
        BubbleSort.sort(bubbleSortedOrders);
        System.out.println("\nOrders Sorted by Bubble Sort:");
        for (Order order : bubbleSortedOrders) {
            System.out.println(order);
        }

        // Sort using Quick Sort
        Order[] quickSortedOrders = orders.clone();
        QuickSort.sort(quickSortedOrders, 0, quickSortedOrders.length - 1);
        System.out.println("\nOrders Sorted by Quick Sort:");
        for (Order order : quickSortedOrders) {
            System.out.println(order);
        }
    }
}
