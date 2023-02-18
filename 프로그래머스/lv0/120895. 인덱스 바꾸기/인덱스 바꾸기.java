class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        int cnt = 0;
        while (cnt < my_string.length()) {
            if (cnt == num1) {
                answer += my_string.charAt(num2);
                cnt++;
            }
            if (cnt == num2) {
                answer += my_string.charAt(num1);
                cnt++;
            } else {
                answer += my_string.charAt(cnt++);
            }
        }
        return answer;
    }
}