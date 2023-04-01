
import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
                List<Integer> list = new ArrayList<>();

        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        
        

        for (int i = 0; i < photo.length; i++) {
            int res = 0;
            for (int j = 0; j < photo[i].length; j++) {
                if(map.containsKey(photo[i][j])){
                    res+= map.get(photo[i][j]);
                }
            }
            list.add(res);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}