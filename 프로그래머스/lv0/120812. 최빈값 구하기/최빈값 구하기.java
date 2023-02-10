import java.util.*;

class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> hashMap = new HashMap<>(); //int,int 형 hashmap
        for (int n : array) hashMap.put(n, hashMap.getOrDefault(n, 0) + 1); //hashmap에 삽입

        int max = Collections.max(hashMap.values()); //제일 큰 밸류(몇번나왔는지)
        int cnt = 0;
        int result = 0;
        
        for (Map.Entry<Integer, Integer> mode : hashMap.entrySet()) { //반복문
            if (mode.getValue() == max) { //밸류가 가장 크면
                cnt++;
                result = mode.getKey(); //밸류 가장 큰놈의 키값이 최빈값
            }
        }
        return cnt == 1 ? result : -1;
    }
}