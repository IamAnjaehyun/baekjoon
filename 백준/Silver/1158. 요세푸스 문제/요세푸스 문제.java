import java.io.*;
import java.util.*;

//BOJ1158 요세푸스
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }

        sb.append("<");

        while (q.size() != 1){
            for (int i = 0; i < K-1; i++) {
                //빼고 더해서 맨 마지막으로 보내기
                q.offer(q.poll());
            }
            sb.append(q.poll()).append(", ");
        }
//        sb = new StringBuilder(sb.substring(0, sb.length() - 2));
        sb.append(q.poll()).append(">");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}