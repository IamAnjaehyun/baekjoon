package lv1.로또의최고순위와최저순위;

public class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int cnt = 0;
        int zero = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (lottos[i] == win_nums[j]) cnt++;
            }
        }
        for(int i =0;i<6;i++) if (lottos[i] == 0) zero++;
        int noZero = cnt;
        int yesZero = cnt+zero;
        if(noZero==1) noZero=6;
        else if(noZero==2) noZero=5;
        else if(noZero==3) noZero=4;
        else if(noZero==4) noZero=3;
        else if(noZero==5) noZero=2;
        else if(noZero==6) noZero=1;
        else noZero=6;

        if(yesZero==1) yesZero=6;
        else if(yesZero==2) yesZero=5;
        else if(yesZero==3) yesZero=4;
        else if(yesZero==4) yesZero=3;
        else if(yesZero==5) yesZero=2;
        else if(yesZero==6) yesZero=1;
        else yesZero=6;
        int[] answer = new int[]{yesZero, noZero};
//        if(cnt==6) answer=1
        return answer;
    }
}
