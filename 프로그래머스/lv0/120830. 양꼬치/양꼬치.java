class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        answer = n*12000 ;
        while(n>=10){
            n-=10;
            k-=1;
        }
        answer += k*2000;
        
        
        
        return answer;
    }
}