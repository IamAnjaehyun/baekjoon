class Solution {
    public int[] solution(long n) {
        String[] s = String.valueOf(n).split("");
        int[] answer = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            answer[i] = Integer.parseInt(s[s.length - i - 1]);
        }
        return answer;
    }
}