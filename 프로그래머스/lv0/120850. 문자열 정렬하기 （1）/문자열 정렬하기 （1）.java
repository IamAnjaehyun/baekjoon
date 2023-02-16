import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String s = my_string.replaceAll("[^0-9]","");
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            answer[i] = s.charAt(i)-48;
        }

        Arrays.sort(answer);

        return answer;
    }
}