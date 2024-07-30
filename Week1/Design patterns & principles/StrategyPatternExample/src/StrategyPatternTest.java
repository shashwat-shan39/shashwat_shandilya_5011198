public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        // Using Credit Card Payment Strategy
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432", "John Doe", "123", "12/25");
        paymentContext.setPaymentStrategy(creditCardPayment);
        paymentContext.executePayment(250.00);
        System.out.println();

        // Using PayPal Payment Strategy
        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com", "securepassword");
        paymentContext.setPaymentStrategy(payPalPayment);
        paymentContext.executePayment(150.00);
    }
}
