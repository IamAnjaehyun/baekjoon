package lv1.부족한금액계산하기;

public class Solution {
    public long solution(int price, int money, int count) {
//        long answer = -1;
        long sum=0;
        long answer = 0 ;
        for(int i=0;i<=count;i++){
            sum += price*i;
        }
        if(money >= sum) answer = 0;
        else if(money<sum) answer = sum-money;

        return answer;
    }
}
