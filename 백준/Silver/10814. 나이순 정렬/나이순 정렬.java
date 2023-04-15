import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][2];
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                int aa = Integer.parseInt(o1[0]);
                int bb = Integer.parseInt(o2[0]);
                if (aa == bb) {
                    return 0;
                } else {
                    return aa - bb;
                }
            }
        });

        for (String[] ar : arr) {
            for (String a : ar) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
