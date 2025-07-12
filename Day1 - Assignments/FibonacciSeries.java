import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");

        int n = sc.nextInt();

        int first = 0, second = 1;
        System.out.println("The fibonacci series of " + n + " terms:");
        for(int i = 0; i <= n; i++) {
            System.out.println(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}