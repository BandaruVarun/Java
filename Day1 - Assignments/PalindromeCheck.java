/*import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int original = sc.nextInt();
        int number = original;
        int reverse = 0;

        while(number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        if(original == reverse) {
            System.out.println("It is a Palindrome");
        }
        else {
            System.out.println("It is not a Palindrome");
        }
    }
}
*/

import java.util.Scanner;

public class PalindromeCheck { // to check the string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String original = sc.nextLine();
        String reversed = "";

        // Reversing the string
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // Comparing
        if (original.equals(reversed)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }
}
