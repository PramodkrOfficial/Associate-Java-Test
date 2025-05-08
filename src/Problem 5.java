import java.util.Scanner;

class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input taxable income
        System.out.print("Enter your taxable income (in Rs.): ");
        double income = scanner.nextDouble();

        double tax = 0.0;

        // Step 2: Apply tax rules as per slabs
        if (income <= 250000) {
            tax = 0.0;
        } else if (income <= 500000) {
            tax = 0.10 * (income - 250000);
        } else if (income <= 1000000) {
            tax = (0.10 * (500000 - 250000)) + (0.20 * (income - 500000));
        } else {
            tax = (0.10 * (500000 - 250000)) + (0.20 * (1000000 - 500000)) + (0.30 * (income - 1000000));
        }

        // Step 3: Output the computed tax
        System.out.printf("Your income tax is: Rs. %.2f\n", tax);

        scanner.close();
    }
}

