import java.util.Scanner;

class MedianFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Accept the size of the array
        System.out.print("Enter the number of elements in the sorted array: ");
        int n = scanner.nextInt();

        // Create an array to hold the numbers
        double[] numbers = new double[n];

        // Input: Accept the elements of the sorted array
        System.out.println("Enter the elements of the sorted array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
        }

        // Close the scanner
        scanner.close();

        // Calculate and print the median
        double median = findMedian(numbers);
        System.out.printf("The median is: %.1f\n", median);
    }

    // Method to find the median of a sorted array
    public static double findMedian(double[] numbers) {
        int n = numbers.length;

        // Check if the array is empty
        if (n == 0) {
            return -1.0;
        }

        // Calculate median
        if (n % 2 == 1) {
            // Odd length: return the middle element
            return numbers[n / 2];
        } else {
            // Even length: return the average of the two middle elements
            return (numbers[(n / 2) - 1] + numbers[n / 2]) / 2.0;
        }
    }
}
