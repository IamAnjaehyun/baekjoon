class Solution {
    public int solution(int n) {
        int bitCount = Integer.bitCount(n); 

        while (true){
            if(Integer.bitCount(n+1) == bitCount) break; //1의 개수 같은지
            n++; //1씩 더해가면서 
        }

        return n+1;
    }
}