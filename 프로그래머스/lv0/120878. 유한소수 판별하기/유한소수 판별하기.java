class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        int gcd = 0;
        for (int i = 1; i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        b = b / gcd;
        while (b % 2 == 0) {b = b / 2;}
        while (b % 5 == 0) {b = b / 5;}

        return b == 1 ? 1 : 2;
    }
}