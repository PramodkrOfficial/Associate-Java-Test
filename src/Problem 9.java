import java.util.Scanner;

class SpecialIntegerChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Accept an integer
        System.out.print("Enter a two-digit integer: ");
        int number = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Check if the number is a two-digit integer
        if (number < 10 || number > 99) {
            System.out.println("The number is not a two-digit integer.");
            return;
        }

        // Extract the digits
        int tens = number / 10; // Get the tens digit
        int units = number % 10; // Get the units digit

        // Calculate the special integer condition
        int specialValue = tens + units + (tens * units);

        // Check if the number is a special integer
        if (number == specialValue) {
            System.out.println(number + " is a special two-digit integer.");
        } else {
            System.out.println(number + " is not a special two-digit integer.");
        }
    }
}