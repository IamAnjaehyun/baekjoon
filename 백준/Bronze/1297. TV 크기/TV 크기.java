import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble(), h = sc.nextDouble(), w = sc.nextDouble();
        double x = Math.pow(d * d / (w * w + h * h), 0.5);
        System.out.println((int) (x * h) + " " + (int) (x * w));
    }
}