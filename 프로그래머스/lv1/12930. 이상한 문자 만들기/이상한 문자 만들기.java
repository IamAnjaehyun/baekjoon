class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] array = s.split("");

        int cnt = 0;
        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer.append(cnt % 2 == 0 ? ss.toLowerCase() : ss.toUpperCase());
        }
        return answer.toString();
    }
}