import java.util.*;


class Solution {
    public int[] solution(int n, int s) {
        int[] answer = new int[n];
        if (n > s) return new int[]{-1};

        if(s%n==0){
            for (int i = 0; i < n; i++) answer[i] = s/n;
        }else{
            for (int i = 0; i < n; i++) answer[i] = s/n;
            for (int i = 0; i < s%n; i++) answer[i]++;
        }
        Arrays.sort(answer);
        return answer;
    }
}