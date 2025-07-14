import java.util.Scanner;

public class FactorsOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        System.out.println("The number of factors for "+ n + "term is ");

        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                System.out.println("Input a number and print all the factors of that number (use loops) " + i);
            }
        }
    }
}
