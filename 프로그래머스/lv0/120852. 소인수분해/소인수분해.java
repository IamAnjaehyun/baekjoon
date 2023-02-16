import java.util.Arrays;
import java.util.*;


class Solution {
    public ArrayList<Integer> solution(int n) {
        HashSet<Integer> answer = new HashSet();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                answer.add(i);
                n /= i;
            }
        }
        ArrayList<Integer> al = new ArrayList<>(answer);
        Collections.sort(al);

        return al;
    }
}