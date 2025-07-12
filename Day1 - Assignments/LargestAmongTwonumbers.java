import java.util.Scanner;

public class LargestAmongTwonumbers {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the number a: ");
        int a = sc.nextInt();

        System.out.println("Enter the number b: ");
        int b = sc.nextInt();

        if(a > b){
            System.out.println("The number a is greater!");
        }
        else{
            System.out.println("The number b is greater!");
        }

    }
}
