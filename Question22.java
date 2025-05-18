import java.util.*;

public class Solution {

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day); 
        String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        return days[cal.get(Calendar.DAY_OF_WEEK) - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();
        scanner.close();

        String result = findDay(month, day, year);
        System.out.println(result);
    }
}
