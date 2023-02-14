class Solution {
    public String solution(String s) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '2') {
                answer += "0";
            } else if (s.charAt(i) == '0') {
                answer += "5";
            } else if (s.charAt(i) == '5') {
                answer += "2";
            }
        }


        return answer;
    }
}