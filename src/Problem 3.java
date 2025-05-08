import java.util.Scanner;

class LargerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();


        // Determine the larger number
        double largerNumber = Math.max(firstNumber, secondNumber);

        // Print the result
        System.out.println("The larger number is: " + largerNumber);
    }
}
