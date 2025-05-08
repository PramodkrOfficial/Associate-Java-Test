import java.util.Scanner;


class CompoundedInflation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Rate of retail inflation
        System.out.print("Enter the rate of retail inflation (in %): ");
        double inflationRate = scanner.nextDouble();

        // Input: Number of years
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Convert inflation rate from percentage to decimal
        double rate = inflationRate / 100;

        // Calculate compounded inflation
        double compoundedInflation = Math.pow(1 + rate, years);

        // Calculate the percentage increase
        double percentageIncrease = (compoundedInflation - 1) * 100;

        // Print the result
        System.out.printf("The compounded retail inflation after %d years is: %.2f%%\n", years, percentageIncrease);
    }
}