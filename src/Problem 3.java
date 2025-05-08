import java.util.Scanner;

class LargerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        double largerNumber = Math.max(firstNumber, secondNumber);
        System.out.println("The larger number is: " + largerNumber);
    }
}
