import java.io.*;
import java.util.*;

//1357 뒤집힌 덧셈
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(Rev(Rev(N) + Rev(K)));
    }

    private static int Rev(int N) {
        StringBuilder revStr = new StringBuilder();
        while (N > 0) {
            revStr.append(N % 10);
            N /= 10;
        }
        return Integer.parseInt(revStr.toString());
    }
}
