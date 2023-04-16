import java.util.Scanner;

//1075 나누기
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int F = sc.nextInt();

        N /= 100;
        N *= 100;

        int answer = 0;
        while (N % F != 0) {
            N++;
            answer++;
        }
        if (answer < 10) System.out.println("0" + answer);
        else System.out.println(answer);
    }
}
