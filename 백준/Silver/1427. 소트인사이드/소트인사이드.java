import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//1427 소트인사이드
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String[] a = st.nextToken().split("");
        List<Integer> li = new ArrayList<>();
        for(String intA : a){
            li.add(Integer.parseInt(intA));
        }

        li.sort(Comparator.reverseOrder());

        StringBuilder answer = new StringBuilder();
        for(int l : li){
            answer.append(l);
        }
        System.out.println(answer);
        
    }
}