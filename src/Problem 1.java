import java.util.Scanner;


class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String numberStr = Integer.toString(number);

        if (numberStr.startsWith("-")) {
            numberStr = numberStr.substring(1);
        }
        System.out.println(numberStr.length());
    }
}