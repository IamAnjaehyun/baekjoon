import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> heap = new PriorityQueue();
        int answer = 0;
        for(int a : scoville){
            heap.offer(a);
        }
        if(heap.peek() >= K){
            return 0;
        }
        while (heap.peek() < K) {
            if (heap.size() == 1) {
                return -1;
            }
            int h1 = heap.poll();
            int h2 = heap.poll();
            int result = h1 + (h2 * 2);

            heap.offer(result);
            answer ++;
        }
        return answer;
    }
}