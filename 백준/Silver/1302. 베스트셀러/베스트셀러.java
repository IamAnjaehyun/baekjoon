import java.util.*;
//1302 베스트셀러
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        int max = 0;
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String book = sc.nextLine();
            map.put(book, map.getOrDefault(book,0)+1);
            max = Math.max(max, map.get(book)); //사전순 정렬위해 가장 큰값만 정렬
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) list.add(entry.getKey());
        }
        Collections.sort(list);
        System.out.print(list.get(0));
    }
}