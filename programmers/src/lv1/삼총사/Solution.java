package lv1.삼총사;


class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for(int i=0;i<number.length;i++){
            for(int j=1+i;j<number.length;j++){
                for(int k=1+j;k<number.length;k++){
                    if(number[i]+number[j]+number[k]==0) answer++;
                }
            }
        }
        return answer;
    }
}
