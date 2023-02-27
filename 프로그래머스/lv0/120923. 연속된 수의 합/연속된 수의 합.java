import java.util.*;

class Solution {
    public int[] solution(int num, int total) {
        List<Integer> li = new ArrayList<>();
        if (total % num == 0) {
            for (int i = 0; i < num; i++) {
                li.add(total / num - num / 2 + i);
            }
        } else {
            for (int i = 0; i < num; i++) {
                li.add(total / num - num / 2 + i + 1);
            }
        }
        
        return li.stream().mapToInt(Integer::intValue).toArray();
    }
}