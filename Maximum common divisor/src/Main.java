import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long timeStart = System.currentTimeMillis();
        System.out.println(commonDiv(new BigInteger("99999999999999999999999"), new BigInteger("231242143472346235462735422")));
        long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart + " ms");
    }

    public static BigInteger commonDiv(BigInteger a, BigInteger b) {
        while (true) {
            if (a.equals(BigInteger.ZERO)) return b;
            if (b.equals(BigInteger.ZERO)) return a;
            if (a.compareTo(b)>=0)
                a = a.mod(b);
            else
                b = b.mod(a);
        }
    }
}
