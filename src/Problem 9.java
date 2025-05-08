import java.util.Scanner;

class SpecialIntegerChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a two-digit integer: ");
        int number = scanner.nextInt();
        if (number < 10 || number > 99) {
            System.out.println("The number is not a two-digit integer.");
            return;
        }

        int checks = number / 10;
        int units = number % 10;
        int specialValue = checks + units + (checks * units);
        if (number == specialValue) {
            System.out.println(number + " is a special two-digit integer.");
        } else {
            System.out.println(number + " is not a special two-digit integer.");
        }
    }
}