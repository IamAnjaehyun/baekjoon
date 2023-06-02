import java.util.*;

//1205 등수 구하기
public class Main {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int newScore = sc.nextInt();
        int M = sc.nextInt();

        Integer[] arr = new Integer[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());

        if(N == M && newScore <= arr[arr.length-1])
            System.out.print(-1);
        else{
            int answer = 1;
            for (Integer integer : arr) {
                if (newScore < integer) answer++;
                else break;
            }
            System.out.print(answer);
        }
    }
}