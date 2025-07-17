import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number n: ");
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("Factorial is not defined for negative values");
        }
        else{
            long result = Factorial(n);
            System.out.println("The factorial of " + n + " is " + result);
        }
    }

    static long Factorial(int n){
        long fact = 1;

        for(int i = 2; i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }
}
