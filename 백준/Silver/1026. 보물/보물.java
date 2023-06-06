import java.util.*;
//1026 보물
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int answer = 0;

        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A); // A를 오름차순
        Integer[] B = new Integer[N];
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }
        Arrays.sort(B, Comparator.reverseOrder()); // B를 내림차순

        for (int i = 0; i < N; i++) {
            answer += A[i] * B[i];
        }
        System.out.println(answer);
    }

}