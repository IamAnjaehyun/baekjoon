class Solution {
    public int solution(int n) {
        String answer = "";
        while (n != 0) {
            answer += n % 3;
            n /= 3;
        } //3진법 만듦
        return Integer.parseInt(answer,3);
    }
}