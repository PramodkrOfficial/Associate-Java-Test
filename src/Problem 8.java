import java.util.Scanner;


class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        long totalSeconds = scanner.nextLong();


        long secondsInADay = 86400;
        long secondsInAnHour = 3600;
        long secondsInAMinute = 60;

        long days = totalSeconds / secondsInADay;
        long hours = (totalSeconds % secondsInADay) / secondsInAnHour;
        long minutes = (totalSeconds % secondsInAnHour) / secondsInAMinute;
        long seconds = totalSeconds % secondsInAMinute;
        System.out.printf("%d Day(s) %d Hour(s) %d Minute(s) %d Second(s)\n", days, hours, minutes, seconds);
    }
}