import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long x = Long.parseLong(st.nextToken());
        long y = Long.parseLong(st.nextToken());

        int z = (int) (y * 100 / x);

        if(z >= 99)
            System.out.println("-1");
        else {
            long left = 0;
            long right = x;
            while(left <= right) {
                long mid = (left + right) / 2;
                if(z < 100 * (y + mid) / (x + mid)) {
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }
            System.out.println(left);
        }
    }

}
