class Solution {
    public int solution(int a, int b, int n) {
                int answer = 0;
        //n은 애초에 빈병이라 생각

        while (n >= a) {
            answer += (n / a) * b; //있는거 갖다주면 몇병 받니
            n = (n / a * b) + (n % a);
        }
        return answer;
    }
}