class Solution {
    public int solution(int n) {
        int answer = 1;
        int i=1;
        while (answer <= n){
            answer *=i;
            i++;
        }
        return i-2;
    }
}