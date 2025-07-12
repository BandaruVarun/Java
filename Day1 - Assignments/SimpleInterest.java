import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal Amount: ");
        int P = sc.nextInt();
        System.out.println("Enter the Time: ");
        int T = sc.nextInt();
        System.out.println("Enter the Rate of Interest: ");
        int R = sc.nextInt();
        int SI = (P * T * R ) / 100;

        System.out.println("Principal: " + P);
        System.out.println("Time: " + T);
        System.out.println("Rate: " + R + " %");
        System.out.println("The Simple Interest is: " + SI);

    }
}
