
import java.util.Scanner;

public class ProfitLossPercentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the cost price
        System.out.print("Enter the cost price: ");
        double costPrice = scanner.nextDouble();

        // Input for the selling price
        System.out.print("Enter the selling price: ");
        double sellingPrice = scanner.nextDouble();

        // Close the scanner to prevent resource leaks
        scanner.close();

        // Calculate profit or loss
        double profitOrLoss = sellingPrice - costPrice;

        // Check if there's a profit
        if (profitOrLoss > 0) {
            // Calculate and display profit percentage
            double profitPercentage = (profitOrLoss / costPrice) * 100;
            System.out.println("Profit Percentage: " + profitPercentage + "%");
        } 
        // Check if there's a loss
        else if (profitOrLoss < 0) {
            // Calculate and display loss percentage
            double lossPercentage = (-profitOrLoss / costPrice) * 100;
            System.out.println("Loss Percentage: " + lossPercentage + "%");
        } 
        // If there's neither profit nor loss
        else {
            System.out.println("No profit, no loss.");
        }
    }
}
