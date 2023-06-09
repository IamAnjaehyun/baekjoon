import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        int[] alphabet = new int[26];

        for (char ch : s.toCharArray()) {
            alphabet[ch - 'A']++;
        }

        int n = 0, mid = 0;
        for (int i = 0; i < 26; i++) {
            if (alphabet[i] % 2 == 1) {
                mid = i;
                n++;
            }
        }

        if ((s.length() % 2 == 1 && n > 1) || (s.length() % 2 == 0 && n > 0)) {
            sb.append("I'm Sorry Hansoo");
        } else {
            StringBuilder answer = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < alphabet[i] / 2; j++) {
                    answer.append((char) (i + 'A'));
                }
            }

            String rev = new StringBuilder(answer.toString()).reverse().toString();
            if (n == 1) {
                answer.append((char) (mid + 'A'));
            }

            sb.append(answer).append(rev);
        }
        System.out.print(sb);
    }
}