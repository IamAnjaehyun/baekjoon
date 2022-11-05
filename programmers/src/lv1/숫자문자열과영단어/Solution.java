package lv1.숫자문자열과영단어;

public class Solution {
    public int solution(String s) {
        String[] numEng={"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] numInt={"0","1","2","3","4","5","6","7","8","9"};
        for(int i=0;i<10;i++) s = s.replace(numEng[i], numInt[i]);
        int answer = Integer.parseInt(s);
        return answer;
    }
}
