import java.util.Scanner;

public class SubtracttheProductandSumofDigitsofanInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        int num = n;
        int sum = 0;
        int product = 1;

        while(num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }

        int result = product - sum;

        System.out.println("Product of Digits is " + product);
        System.out.println("Sum of Digits is " + sum);
        System.out.println("Result is " + result);
    }
}
