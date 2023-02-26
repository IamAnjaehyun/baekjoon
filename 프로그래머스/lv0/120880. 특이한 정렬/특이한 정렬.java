import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int num : numlist){list.add(num);}
        list.sort(Comparator.reverseOrder());
        list.sort((num1, num2) -> Math.abs(n-num1) - Math.abs(n-num2));

        // System.out.println(list);
        answer =list.stream().mapToInt(i->i).toArray();


        return answer;
    }
}