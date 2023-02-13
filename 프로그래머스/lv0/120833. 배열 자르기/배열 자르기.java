import java.util.Stack;

class Solution {
    public Stack solution(int[] numbers, int num1, int num2) {
     Stack<Integer> answer = new Stack<>();
        for (int i = num1; i <= num2; i++) {
            answer.push(numbers[i]);
        }

        return answer;
    }
}