import java.util.*;

class Solution {
    public int[] solution(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
		int[] answer = new int[s.length()];

		for (int i = 0; i < s.length(); i++) {
			if (!hm.containsKey(s.charAt(i))) {answer[i] = -1;}
			else {answer[i] = i - hm.get(s.charAt(i));}
			hm.put(s.charAt(i), i);
		}
		return answer;
    }
}