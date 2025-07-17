import java.util.Scanner;

public class SumOfFirstnNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");  // fixed println
        int n = sc.nextInt();
        int sum = sumOfNaturalNumbers(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }

    static int sumOfNaturalNumbers(int n) {
        return n * (n + 1) / 2;  // correct formula
    }
}
