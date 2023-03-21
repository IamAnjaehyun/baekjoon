import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
int answer = 0;
        //3,4,5번째 날
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }

        for (int i = 0; i <= discount.length - 10; i++) {
            Map<String, Integer> map2 = new HashMap<>();

            for (int j = 0; j < 10; j++) {
                int cnt = map2.getOrDefault(discount[i+j],0);
                map2.put(discount[i+j], ++cnt);
            }
            boolean saleGood = true;
            for(String a : map.keySet()){
                if(map.get(a) > map2.getOrDefault(a,0)){
                    saleGood = false;
                    break;
                }
            }
            if(saleGood) answer++;
        }
        return answer;
    }
}