package lv1.없는숫자더하기;

public class Solution {
    public int solution(int[] numbers) {
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            sum += numbers[i];
        }
        int answer = 45-sum;
        return answer;
    }
}

//이건 유레카다..
