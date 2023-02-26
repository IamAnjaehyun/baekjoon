class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String AA = A;
        for (int j = 0; j < A.length(); j++) {
            if(AA.equals(B)){return answer;}
            String goRight = AA.substring(A.length()-1);
            AA = goRight + AA.substring(0,A.length()-1);
            answer++;
        }
        return -1;
    }
}