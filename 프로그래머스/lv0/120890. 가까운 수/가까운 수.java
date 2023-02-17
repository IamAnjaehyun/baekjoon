import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        list.add(n);
        list.sort((o1, o2) -> o1 - o2);

        // System.out.println(list.size() + " 사이즈 ");

        int cnt = list.indexOf(n); //인덱스
        //index번호 2번 -> 1번이랑 3번이랑 비교
        // System.out.println(cnt + " <- cnt / list.get(cnt-1)-> " + list.get(cnt - 1) + "  / list.get(cnt+1)-> " + list.get(cnt + 1));

        if (list.size() - 1 == cnt) {
            answer = list.get(cnt-1);
        } else if (n - list.get(cnt - 1) == list.get(cnt + 1) - n) {
            answer = list.get(cnt - 1);
        } else {
            if (n - list.get(cnt - 1) > list.get(cnt + 1) - n) {
                answer = list.get(cnt + 1);
                // System.out.println(answer + " <- answer 윗놈 ");

            } else {
                answer = list.get(cnt - 1);
                // System.out.println(answer + " <- answer 아랫놈 ");
            }
        }
        return answer;
    }
}