import java.util.*;

class Solution {
    public long solution(long n) {
        String ansStr = "";
        String[] nArr = String.valueOf(n).split("");
        List<Long> arrN = new ArrayList<>();
        for (int i = 0; i < nArr.length; i++) {
            arrN.add(Long.parseLong(nArr[i]));
        }
        arrN.sort(Comparator.reverseOrder());
        for(long aN : arrN){
            ansStr += aN;
        }
        return Long.parseLong(ansStr);
    }
}