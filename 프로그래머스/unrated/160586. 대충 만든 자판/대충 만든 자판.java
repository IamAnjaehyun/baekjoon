import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> keyBoard = new HashMap<>();
        for(String k:keymap){
            for(int i=0;i<k.length();i++){
                char sign = k.charAt(i);
                int step=keyBoard.getOrDefault(sign,i+1);
                keyBoard.put(sign,Math.min(step,i+1));
            }
        } //알파벳 몇번가야되는지 저장

        for(int i=0;i<targets.length;i++){
            for(int j=0;j<targets[i].length();j++){
                char c = targets[i].charAt(j);
                if(keyBoard.containsKey(c)){
                    answer[i]+=keyBoard.get(c);
                }else{
                    answer[i]=-1;
                    break;
                }
            }
        }
        return answer;
    }
}