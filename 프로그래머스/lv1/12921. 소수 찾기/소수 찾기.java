class Solution {
    public static int solution(int n) {
        int answer = 0;
        for (int j = 2; j <= n; j++) {
            if(isPrime(j)){answer++;}
        }
        return answer;
    }

    public static boolean isPrime(int n){
        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }
}