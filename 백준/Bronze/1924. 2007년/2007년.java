import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        sc.close();

        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] weekDays = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int days = day;
        for (int i = 0; i < month - 1; ++i) {
            days += monthDays[i];
        }
        System.out.println(weekDays[days % 7]);
    }
}