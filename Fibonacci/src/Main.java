import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(fibonacci(sc.nextInt()));
    }

    public static int fibonacci(int n) {
        int[] mess = new int[]{0, 1};
        if (n < 2)
            return mess[n];
        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}
