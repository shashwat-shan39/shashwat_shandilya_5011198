public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double presentValue, double growthRate, int periods) {
        // Base case: when no more periods are left, return the present value
        if (periods == 0) {
            return presentValue;
        }
        // Recursive case: apply the growth rate to the present value
        return calculateFutureValue(presentValue * (1 + growthRate), growthRate, periods - 1);
    }

    // Iterative method to calculate future value
    public static double calculateFutureValueIterative(double presentValue, double growthRate, int periods) {
        double futureValue = presentValue;
        for (int i = 0; i < periods; i++) {
            futureValue *= (1 + growthRate);
        }
        return futureValue;
    }

    public static void main(String[] args) {
        double presentValue = 1000.0; // Initial value
        double annualGrowthRate = 0.05; // Growth rate (5%)
        int periods = 10; // Number of periods (years)

        // Calculate future value using the recursive method
        double futureValueRecursive = calculateFutureValue(presentValue, annualGrowthRate, periods);
        System.out.println("Future Value (Recursive): " + futureValueRecursive);

        // Calculate future value using the iterative method
        double futureValueIterative = calculateFutureValueIterative(presentValue, annualGrowthRate, periods);
        System.out.println("Future Value (Iterative): " + futureValueIterative);
    }
}
