import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String s = my_string.replaceAll("[^0-9]","");
        int[] intArr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            intArr[i] = s.charAt(i)-48;
        }
        answer = Arrays.stream(intArr).sum();
        return answer;
    }
}