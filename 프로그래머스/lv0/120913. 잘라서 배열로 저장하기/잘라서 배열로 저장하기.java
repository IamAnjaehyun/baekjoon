import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> answer = new ArrayList();
        for (int i = 0; i <= my_str.length()-n; i += n) {
            answer.add(my_str.substring(i, i + n));
        }
        if (my_str.length() % n != 0) {
            answer.add(my_str.substring( (my_str.length() / n) * n));
        }
        return answer.toArray(answer.toArray(new String[0]));
    }
}