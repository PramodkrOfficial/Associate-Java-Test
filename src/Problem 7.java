import java.util.Scanner;


class CompoundedInflation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the rate of retail inflation: ");
        double inflationRate = scanner.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();


        double rate = inflationRate / 100;
        double compoundedInflation = Math.pow(1 + rate, years);
        double percentageIncrease = (compoundedInflation - 1) * 100;
        System.out.printf("The compounded retail inflation after %d years is: %.2f%%\n", years, percentageIncrease);
    }
}