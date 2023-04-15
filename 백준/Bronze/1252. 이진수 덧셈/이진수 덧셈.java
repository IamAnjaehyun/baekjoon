import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

//1252 이진수 덧셈
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        BigInteger newA = new BigInteger(a, 2);
        BigInteger newB = new BigInteger(b, 2);
        BigInteger ans = newA.add(newB);
        
        String answer = ans.toString(2);

        System.out.println(answer);
    }
}