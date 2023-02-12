class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] my = my_string.split("");


        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += my[i];
            }
        }

        return answer;
    }
}