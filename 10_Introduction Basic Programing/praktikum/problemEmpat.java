import java.util.Scanner;

public class problemEmpat {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input Bilangan : ");
        int bilangan = input.nextInt();
        System.out.println("Output : ");

        for (int i = bilangan; i >= 1; i--) {
            if (bilangan % i == 0) {
                System.out.println(i);
            }
        }
    }
}