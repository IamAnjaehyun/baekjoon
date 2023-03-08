class Solution {
    public int solution(int n) {
        int answer = 0;
        int a1 = 1;
        int a2 = 1;

        for (int i = 1; i < n-1; i++) {
            answer = a1 + a2;
            a1 = a2 % 1234567;
            a2 = answer % 1234567;
        }
        
        return answer %1234567;
    }
}