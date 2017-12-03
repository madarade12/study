import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(fibonacci(100000));
        long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - startTime + " ms");
    }

    public static int fibonacci(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return a;
    }
}
