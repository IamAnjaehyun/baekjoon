import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int answer2 = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[A.length-1-i];
            answer2 += B[i] * A[A.length-1-i];
        }

        return Math.max(answer2,answer);
    }
}