import java.io.*;
import java.util.StringTokenizer;
//1002 터렛 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
 
		while (N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
 
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			System.out.println(calculate(x1, y1, r1, x2, y2, r2));
		}
 
	}
 
	public static int calculate(int x1, int y1, int r1, int x2, int y2, int r2) {
    
		int distance = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));	// 중점간 거리 distance의 제곱 
 
		if(x1 == x2 && y1 == y2 && r1 == r2) {
			return -1;
		}else if(distance > Math.pow(r1 + r2, 2)) {
			return 0;
		}else if(distance < Math.pow(r2 - r1, 2)) {
			return 0;
		}else if(distance == Math.pow(r2 - r1, 2)) {
			return 1;
		}else if(distance == Math.pow(r1 + r2, 2)) {
			return 1;
		}else {
			return 2;
		}
		
	}
 
}