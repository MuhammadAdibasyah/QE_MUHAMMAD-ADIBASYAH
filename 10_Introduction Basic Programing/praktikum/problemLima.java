import java.util.Scanner;

public class problemLima {
    private static boolean primeNumber(int number) {
        int x = 0;

        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                x++;
            }
        }
        if (x == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(primeNumber(11));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));
        System.out.println(primeNumber(35));
    }
}