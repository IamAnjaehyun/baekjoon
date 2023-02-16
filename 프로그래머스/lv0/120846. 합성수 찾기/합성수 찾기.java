//합성수 : 약수의 개수가 세 개 이상인 수

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int count = 0; //약수의 개수
            for (int j = 1; j <= i; j++) {
                count += (i % j == 0) ? 1 : 0; //0되면 약수 cnt++
            }
            answer += (count >= 3) ? 1 : 0; // 3이상이면 수의 개수
        }
        return answer;
    }
}