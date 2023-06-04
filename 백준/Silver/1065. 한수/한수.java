import java.util.Scanner;

//1065 한수
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 0;

        if (N < 100) {
            System.out.println(N);
        } else {
            answer = 99;

            for (int i = 100; i <= N; i++) {

                int x = i / 100;
                int y = (i / 10) % 10;
                int z = i % 10;

                if (y - x == z - y) answer++;
            }
            System.out.println(answer);
        }
    }
}