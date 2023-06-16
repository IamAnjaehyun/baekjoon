import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    st = new StringTokenizer(br.readLine());
    int m = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());

    PriorityQueue<Compare> q = new PriorityQueue<>();

    for (int i = m; i <= n; i++) {
      StringBuilder s = new StringBuilder();

      if (i < 10) {
        s.append(num[i]);
      } else {
        s.append(num[i / 10]).append(" ").append(num[i % 10]);
      }
      q.add(new Compare(s.toString(), i));
    }
    int cnt = 0;
    while (!q.isEmpty()) {
      Compare c = q.poll();
      cnt++;
      sb.append(c.n).append(" ");
      if (cnt % 10 == 0) {
        sb.append("\n");
      }
    }
    System.out.println(sb);
  }

}

class Compare implements Comparable<Compare> {
  String s;
  int n;

  public Compare(String s, int n) {
    this.s = s;
    this.n = n;
  }

  @Override
  public int compareTo(Compare o) {
    return s.compareTo(o.s);
  }
}
