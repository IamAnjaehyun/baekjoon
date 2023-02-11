class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int x : numbers){
            answer += x;
        }
        return answer/numbers.length;
    }
}