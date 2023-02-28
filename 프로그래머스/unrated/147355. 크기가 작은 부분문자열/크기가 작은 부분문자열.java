class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for (int i = 0; i <= t.length() - p.length(); i++) {
            String tt = t.substring(i, i + p.length());
            if (Long.parseLong(p)>=Long.parseLong(tt)) {
                answer++;
            }
        }
        return answer;
    }
}