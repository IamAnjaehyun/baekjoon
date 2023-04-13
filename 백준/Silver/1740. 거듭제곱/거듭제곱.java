import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long answer = 0;
        int cnt = 0;

        while (N > 0) {
            if ((N & 1) == 1) {
                answer += power(3, cnt);
            }
            cnt++;
            N = (N >> 1);
        }

        System.out.println(answer);
    }

    private static long power(long a, long b) {
        if(b == 0) return 1;
        if(b == 1) return a;

        long temp = power(a, b / 2);

        if(b % 2 == 0) {
            return (temp * temp);
        } else {
            return ((temp * temp) * a);
        }
    }
}