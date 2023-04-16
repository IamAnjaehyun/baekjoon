import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//1284 집 주소
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

//        int N = Integer.parseInt(st.nextToken());
//        int K = Integer.parseInt(st.nextToken());

        while (true){
            st = new StringTokenizer(br.readLine());

            String N = st.nextToken();
            if(N.equals("0")) break;

            int answer = 1;
            String[] arrN = N.split("");
            for (int i = 0; i < arrN.length; i++) {
                if (arrN[i].equals("1")){
                    answer += 3;
                } else if (arrN[i].equals("0")){
                    answer += 5;
                } else{
                    answer += 4;
                }
            }
//            answer += arrN.length-1;
            System.out.println(answer);
        }
    }
}
