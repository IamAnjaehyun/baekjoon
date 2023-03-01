import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int a : nums){
            hs.add(a);
        }
        if(hs.size() >= nums.length/2){
            answer = nums.length/2;
        }else{
            answer = hs.size();
        }
        
        return answer;
    }
}