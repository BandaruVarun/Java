import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        int original = number;
        int sum = 0;

        int n = String.valueOf(number).length();

        while(number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, n); // digit^n
            number /= 10;
        }
        if(original == sum) {
            System.out.println(original + "is an armstrong number");
        }
        else{
            System.out.println("Not an armstrong number");
        }
    }
}
