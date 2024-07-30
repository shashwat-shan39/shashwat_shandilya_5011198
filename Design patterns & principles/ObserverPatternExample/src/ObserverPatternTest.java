public class ObserverPatternTest {
    public static void main(String[] args) {
        // Create a StockMarket instance
        StockMarket stockMarket = new StockMarket();

        // Create observer instances
        Observer mobileApp1 = new MobileApp("App1");
        Observer mobileApp2 = new MobileApp("App2");
        Observer webApp1 = new WebApp("WebApp1");

        // Register observers
        stockMarket.registerObserver(mobileApp1);
        stockMarket.registerObserver(mobileApp2);
        stockMarket.registerObserver(webApp1);

        // Update stock price and notify observers
        stockMarket.setStockPrice(100.50);
        System.out.println();

        // Deregister an observer
        stockMarket.deregisterObserver(mobileApp2);

        // Update stock price and notify remaining observers
        stockMarket.setStockPrice(105.75);
    }
}
