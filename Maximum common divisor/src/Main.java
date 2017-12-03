import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(commonDiv(sc.nextInt(), sc.nextInt()));
    }

    public static int commonDiv(int a, int b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        return a > b ? commonDiv(a % b, b) : commonDiv(a, b % a);
    }
}
