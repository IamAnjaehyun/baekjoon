class Solution {
    public int solution(String s) {
        int answer = 0;
        char ch = s.charAt(0);
        int left =0;
        int right=0;
        for (int i = 0; i < s.length(); i++) {
            if(left == right){
                answer++;
                ch  = s.charAt(i);
            }
            if(s.charAt(i) == ch) left++;
            else right++;
        }
        return answer;
    }
}