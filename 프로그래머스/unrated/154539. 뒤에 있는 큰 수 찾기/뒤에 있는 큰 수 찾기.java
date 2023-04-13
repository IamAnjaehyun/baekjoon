import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i];
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < numbers.length; i++) { //num까기
            while (!stack.empty() && answer[stack.peek()] < answer[i]) {
                answer[stack.pop()] = answer[i];
            }
            stack.push(i);
        }

        while (!stack.empty()) {
            answer[stack.pop()] = -1;
        }

        return answer;
    }
}