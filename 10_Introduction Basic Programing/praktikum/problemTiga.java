import java.util.Scanner;
public class problemTiga {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input Bilangan : ");
        int bilangan = input.nextInt();
        System.out.println("Output : ");

        for (int i = 1; i <=bilangan; i++) {

            if (bilangan % i == 0) {
                System.out.println( i );
            }
        }
    }
}
