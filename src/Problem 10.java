import java.util.Scanner;

class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Accept the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array to hold the numbers
        int[] numbers = new int[n];

        // Input: Accept the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }


        // Find the Second-largest number
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest; // Update second largest
                largest = number; // Update largest
            } else if (number > secondLargest && number < largest) {
                secondLargest = number; // Update second largest
            }
        }

        // Check if the second largest number exists
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest number in the array.");
        } else {
            System.out.println("The second largest number is: " + secondLargest);
        }
    }
}
