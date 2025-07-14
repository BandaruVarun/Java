import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");


        int sum = 0;
        int n = sc.nextInt();

        System.out.println("Enter the zero(to stop loop): ");

        while(n != 0) {
            sum = sum + n;
            n = sc.nextInt();
        }
        System.out.println("SumUntilZero is " + sum);
    }
}
