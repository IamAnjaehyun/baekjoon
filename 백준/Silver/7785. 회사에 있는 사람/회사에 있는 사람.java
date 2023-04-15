import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//7758 회사에 있는 사람
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            String name = input[0];
            String status = input[1];

            if (status.equals("enter")) {
                map.put(name, 1);
            } else {
                map.remove(name);
            }
        }
        
        List<String> names = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            names.add(entry.getKey());
        }
        names.sort(Comparator.reverseOrder());
        for(String name : names){
            System.out.println(name);
        }
    }
}
