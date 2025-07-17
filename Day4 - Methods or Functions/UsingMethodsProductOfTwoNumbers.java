import java.util.Scanner;

public class UsingMethodsProductOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the num2: ");
        int num2 = sc.nextInt();

        int num3 = Findproduct(num1, num2);

        System.out.println("The product of two digits is " + num3);


    }
    static int Findproduct(int a, int b){
        return a * b;
    }
}
