import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String,String> hm = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            String num = Integer.toString(i+1);

            hm.put(s,num);
            hm.put(num,s);
        }
        for (int i = 0; i < M; i++) {
            sb.append(hm.get(br.readLine())).append('\n');
        }
        System.out.println(sb);
    }
}