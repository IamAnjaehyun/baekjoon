import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        s = s.replaceAll("XXXX","AAAA");
        s = s.replaceAll("XX","BB");

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'X'){
                s = "-1";
            }
        }

        System.out.println(s);
    }

}