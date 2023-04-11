import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        long sum = Arrays.stream(works).sum();
        if (n > sum) {
            return 0;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int work : works){
            pq.offer(work);
        }
        System.out.println(pq);
        for (int i = 0; i < n; i++) {
            int work = pq.poll();
            if(work==0){
                break;
            }else{
                pq.offer(work-1);
            }
        }
        for(int q : pq){
            answer+=Math.pow(q,2);
        }

        return answer;
    }
}