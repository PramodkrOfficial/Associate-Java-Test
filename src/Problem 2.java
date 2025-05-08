import java.util.Scanner;
import java.text.DecimalFormat;

class GrossPriceCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the net price: ");
        double netPrice = scanner.nextDouble();
        System.out.print("Enter the tax rate: ");
        double taxRate = scanner.nextDouble();

        double grossPrice = netPrice / (1 + taxRate);
        DecimalFormat df = new DecimalFormat(" ");
        System.out.println("Gross Price: " + df.format(grossPrice));
    }
}
