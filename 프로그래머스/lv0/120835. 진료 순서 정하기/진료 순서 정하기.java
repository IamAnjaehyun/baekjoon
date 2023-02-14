import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] copyEmergency = new int[emergency.length];
        int[] answer = new int[emergency.length];


        for (int i = 0; i < emergency.length; i++) {
            copyEmergency[i] = emergency[i];
        }

        Arrays.sort(copyEmergency);

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if(copyEmergency[i] == emergency[j]){
                    answer[j] = emergency.length-i;
                }
            }

        }
        return answer;
    }
}