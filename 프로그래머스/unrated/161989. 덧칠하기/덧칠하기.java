class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        int size = section.length;
        int next = section[0];
        int idx = 0;
        
        while(idx < size) {
            if (next <= section[idx]) {
                next = section[idx] + m;
                answer++;
            }
            idx++;
        }
        
        return answer;
    }
}