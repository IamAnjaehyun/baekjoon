import java.io.*;
import java.util.*;

//2941 크로아티아 알파벳
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Scanner sc = new Scanner(System.in);

        String[] cro = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String arr = st.nextToken();

        for (int i = 0; i < cro.length; i++) {
            if (arr.contains(cro[i])) {
                arr = arr.replace(cro[i], "0");
            }
        }
        System.out.println(arr.length());

    }
}
