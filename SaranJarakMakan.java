import java.util.Scanner;

public class SaranJarakMakan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jam makan pagi (format 24 jam, contoh: 08:00): ");
        String breakfastTime = scanner.nextLine();

        System.out.print("Masukkan jam makan siang (format 24 jam, contoh: 12:00): ");
        String lunchTime = scanner.nextLine();

        System.out.print("Masukkan jam makan sore (format 24 jam, contoh: 18:00): ");
        String dinnerTime = scanner.nextLine();

        int minIdealGapMinutes = 240; // 4 jam * 60 menit
        int maxIdealGapMinutes = 360; // 6 jam * 60 menit

        int breakfastToLunchGap = calculateTimeGap(breakfastTime, lunchTime);
        int lunchToDinnerGap = calculateTimeGap(lunchTime, dinnerTime);

        System.out.println("\nJarak antara makan pagi dan makan siang: " + breakfastToLunchGap + " menit");
        System.out.println("Jarak antara makan siang dan makan malam: " + lunchToDinnerGap + " menit");

        if (breakfastToLunchGap >= minIdealGapMinutes && breakfastToLunchGap <= maxIdealGapMinutes
                && lunchToDinnerGap >= minIdealGapMinutes && lunchToDinnerGap <= maxIdealGapMinutes) {
            System.out.println("Jarak makan Anda ideal.");
        } else {
            System.out.println("Jarak makan Anda tidak ideal.");
        }
    }

    public static int calculateTimeGap(String startTime, String endTime) {
        String[] startParts = startTime.split(":");
        String[] endParts = endTime.split(":");

        int startHour = Integer.parseInt(startParts[0]);
        int startMinute = Integer.parseInt(startParts[1]);

        int endHour = Integer.parseInt(endParts[0]);
        int endMinute = Integer.parseInt(endParts[1]);

        int startTotalMinutes = startHour * 60 + startMinute;
        int endTotalMinutes = endHour * 60 + endMinute;

        return endTotalMinutes - startTotalMinutes;
    }
}