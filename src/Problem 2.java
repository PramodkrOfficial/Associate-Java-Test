import java.util.Scanner;
import java.text.DecimalFormat;

class GrossPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Accept the net price and tax rate
        System.out.print("Enter the net price (including taxes): ");
        double netPrice = scanner.nextDouble();

        System.out.print("Enter the tax rate (as a decimal, e.g., 0.12 for 12%): ");
        double taxRate = scanner.nextDouble();

        // Close the scanner
        scanner.close();

        // Calculate the gross price before taxes
        double grossPrice = netPrice / (1 + taxRate);

        // Format the output to two decimal places
        DecimalFormat df = new DecimalFormat("#.00");

        // Print the result
        System.out.println("Gross Price (before taxes): " + df.format(grossPrice));
    }
}
