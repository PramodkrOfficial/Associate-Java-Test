import java.util.Scanner;



class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read integer input
        int number = scanner.nextInt();
        scanner.close();
        // Convert to string and remove the sign if negative
        String numberStr = Integer.toString(number);
        if (numberStr.startsWith("-")) {
            numberStr = numberStr.substring(1);
        }
        // Print number of digits
        System.out.println(numberStr.length());
    }
}