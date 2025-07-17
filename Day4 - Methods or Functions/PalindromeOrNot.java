import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        if(isPalindrome(a)){
            System.out.println("The given number is Palindrome " + a);
        }
        else{
            System.out.println("It is not a Palindrome");
        }

    }

    static boolean isPalindrome(int n){
        int original = n;
        int reverse = 0;

        while(n > 0){
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;

        }
        return original == reverse;
    }
}
