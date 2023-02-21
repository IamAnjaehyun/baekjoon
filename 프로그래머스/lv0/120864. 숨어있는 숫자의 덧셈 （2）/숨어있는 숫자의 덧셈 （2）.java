import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        String[] answerArr = my_string.split("[a-zA-Z]");

        for(String s : answerArr){
            if(!s.equals("")){
                list.add(Integer.parseInt(s));
            }
        }

        answer = list.stream().mapToInt(Integer::intValue).sum();
        return answer;
    }
}