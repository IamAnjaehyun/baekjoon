import java.util.*;

class Solution {
    public String solution(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        StringBuilder answer = new StringBuilder();
        String[] arr = s.toLowerCase().split(" ");

        for (String a : arr) {
            if (a.equals("")) {
                answer.append(" ");
            } else if (a.length() == 1) {
                answer.append(a.toUpperCase()).append(" ");
            } else if (a.length() > 1) {
                answer.append(a.substring(0,1).toUpperCase()).append(a.substring(1)).append(" ");
            }
        }
        if(s.charAt(s.length() - 1) == ' '){
            return answer.toString();
        }
        return answer.substring(0, answer.length() - 1);
    }
}