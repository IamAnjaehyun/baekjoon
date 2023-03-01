import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] ansArr = new String[numbers.length];
        for(int i=0;i<numbers.length;i++){
            ansArr[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(ansArr, (o1, o2) -> (o2+o1).compareTo(o1+o2));
        if(ansArr[0].equals("0")){return "0";}
        for(String s : ansArr){answer+=s;}
        return answer;
    }
}