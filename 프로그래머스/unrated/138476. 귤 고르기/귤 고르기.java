import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int a : tangerine){
            map.put(a, map.getOrDefault(a,0)+1);
        }
        List<Integer> valueList = new ArrayList<>(map.values());
        valueList.sort((s1, s2) -> s2.compareTo(s1));

        int cnt = 0;
        for(int i=0;i<valueList.size();i++){
//            System.out.println(cnt);
            cnt += valueList.get(i);
            if(cnt >= k){
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}