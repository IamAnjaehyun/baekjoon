package lv1.최소직사각형;

public class Solution {
    public int solution(int[][] sizes) {
        int maxx = 1;
        int shortt = 1;

        for(int i = 0; i < sizes.length; i++){
            int max = Math.max(sizes[i][0], sizes[i][1]);
            int min = Math.min(sizes[i][0], sizes[i][1]);

            if(max > maxx) maxx = max;
            if(min > shortt) shortt = min;
        }
        return maxx * shortt;
    }
}
