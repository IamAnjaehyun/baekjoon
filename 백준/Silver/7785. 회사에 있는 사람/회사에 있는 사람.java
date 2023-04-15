import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//7758 회사에 있는 사람
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        Map<String, String> map = new HashMap<>();
        StringTokenizer st;
        //HashMap으로 떠난사람은 leave로 갱신 
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(), st.nextToken());
        }
        //퇴근 안한사람은 value = enter
        List<String> names = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals("enter")) {
                names.add(entry.getKey());
            }
        }
        //사전 역순 정렬
        names.sort(Comparator.reverseOrder());
        //출력
        for (String name : names) {
            System.out.println(name);
        }
    }
}
