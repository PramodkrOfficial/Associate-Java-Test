import java.util.Scanner;

class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your taxable income: ");
        double income = scanner.nextDouble();

        double tax = 0;
        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = 0.10 * (income - 250000);
        } else if (income <= 1000000) {
            tax = (0.10 * (500000 - 250000)) + (0.20 * (income - 500000));
        } else {
            tax = (0.10 * (500000 - 250000)) + (0.20 * (1000000 - 500000)) + (0.30 * (income - 1000000));
        }
        System.out.printf("Your income tax is: Rs. %.2f\n", tax);
    }
}

