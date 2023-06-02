import java.util.*;

//1049 기타줄
public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] unit = new int[M];
        int[] pack = new int[M];
        for (int i = 0; i < M; i++) {
            pack[i] = sc.nextInt();
            unit[i] = sc.nextInt();
        }
        Arrays.sort(unit);
        Arrays.sort(pack);

        int answer = Math.min(((N / 6) + 1) * pack[0], N * unit[0]);
        answer = Math.min(answer, ((N / 6)) * pack[0] + (N % 6) * unit[0]);

        System.out.println(answer);
    }
}