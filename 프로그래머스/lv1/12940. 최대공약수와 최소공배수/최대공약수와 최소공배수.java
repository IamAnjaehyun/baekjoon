class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int min = Math.min(n, m);
        for (int i = min; i >= 1; i--) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
                answer[1] = m * n / i;
                break;
            }
        }
        return answer;
    }
}