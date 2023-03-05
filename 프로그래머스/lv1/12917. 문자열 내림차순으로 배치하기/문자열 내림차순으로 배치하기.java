import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        List<String> sArr = Arrays.asList(s.split(""));
        sArr.sort(Comparator.reverseOrder());
        for(String ss : sArr){
            answer.append(ss);
        }
        return answer.toString();
    }
}