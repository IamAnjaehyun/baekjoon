import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int a : arr) {
            if (a % divisor == 0) {
                list.add(a);
            }
        }
        if(list.size() == 0){
            list.add(-1);
        }
        list.sort(Integer::compareTo);

        return list.stream().mapToInt(i -> i).toArray();
    }
}