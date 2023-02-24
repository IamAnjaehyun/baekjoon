import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        List<Integer> avg = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            avg.add(score[i][0] + score[i][1]);
        }

        for (int i=0; i<avg.size(); i++) {
            int rank = 1;
            for (int j=0; j<avg.size(); j++) {
                if (avg.get(i)< avg.get(j)) rank++;
            }
            answer[i] = rank;
        }
        return answer;
    }
}