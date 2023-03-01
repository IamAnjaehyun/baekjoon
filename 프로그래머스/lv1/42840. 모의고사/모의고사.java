import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] ans1 = {1, 2, 3, 4, 5};
        int[] ans2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] ans3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int ok1 = 0;
        int ok2 = 0;
        int ok3 = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == ans1[i % 5]) {ok1++;}
            if (answers[i] == ans2[i % 8]) {ok2++;}
            if (answers[i] == ans3[i % 10]) {ok3++;}
        }
        
        int max = Math.max(Math.max(ok1,ok2),ok3);
        List<Integer> list = new ArrayList<>();
        if(max == ok1) list.add(1);
        if(max == ok2) list.add(2);
        if(max == ok3) list.add(3);
        
        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}