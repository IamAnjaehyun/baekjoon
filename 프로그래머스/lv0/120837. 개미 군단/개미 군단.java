class Solution {
    public int solution(int n) {
        int answer = 0;
        int general = 5;
        int soldier = 3;
        int worker = 1;


        while (n > 0) {
            if (n >= 5) {
                answer += n / general;
                n %= general;
            }
            if (n >= soldier) {
                answer += n / soldier;
                n %= soldier;
            }
            if (n >=  worker) {
                answer += n / worker;
                n = 0;
            }
        }
        return answer;
    }
}