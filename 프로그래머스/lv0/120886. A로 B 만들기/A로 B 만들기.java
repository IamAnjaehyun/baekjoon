import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] chB = before.toCharArray();
        char[] chA = after.toCharArray();

        Arrays.sort(chB);
        Arrays.sort(chA);
        
        String chBB = new String(chB);
        String chAA = new String(chA);
        if(chAA.equals(chBB)){return 1;}

        return answer;
    }
}