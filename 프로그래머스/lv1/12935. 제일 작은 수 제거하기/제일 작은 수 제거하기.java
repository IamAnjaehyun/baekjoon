import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[1];
        List<Integer> list = new ArrayList<>();
        for(int a : arr) list.add(a);
        int min = Integer.MAX_VALUE;
        int minIdx = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < min){
                min = list.get(i);
                minIdx = i;
            }
        }
        list.remove(minIdx);
        if(list.size() >= 1){
            return list.stream().mapToInt(i->i).toArray();
        }else{
            answer[0] = -1;
        }
        return answer;
    }
}