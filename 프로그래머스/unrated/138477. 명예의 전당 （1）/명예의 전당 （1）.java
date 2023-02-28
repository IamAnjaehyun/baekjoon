import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> li = new LinkedList<>();
        for (int i = 0; i < score.length; i++) {
            li.add(score[i]);
            li.sort(Comparator.reverseOrder());
            if(li.size() == k+1){
                li.remove(li.get(li.size()-1));
            }
            answer[i]=li.get(li.size()-1);

        }

        return answer;
    }
}