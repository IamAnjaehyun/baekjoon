import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

//11279 최대 힙
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();

            if (num == 0)
                sb.append(pq.size() == 0 ? 0 : pq.poll()).append('\n');
            else pq.add(num);
        }
        System.out.println(sb.toString());
    }
}
