import java.util.Scanner;


class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of seconds
        System.out.print("Enter the number of seconds: ");
        long totalSeconds = scanner.nextLong();

        // Close the scanner
        scanner.close();

        // Calculate days, hours, minutes, and seconds
        long secondsInADay = 86400; // 60 seconds * 60 minutes * 24 hours
        long secondsInAnHour = 3600; // 60 seconds * 60 minutes
        long secondsInAMinute = 60;   // 60 seconds

        long days = totalSeconds / secondsInADay;
        long hours = (totalSeconds % secondsInADay) / secondsInAnHour;
        long minutes = (totalSeconds % secondsInAnHour) / secondsInAMinute;
        long seconds = totalSeconds % secondsInAMinute;

        // Print the result
        System.out.printf("%d Day(s) %d Hour(s) %d Minute(s) %d Second(s)\n", days, hours, minutes, seconds);
    }
}