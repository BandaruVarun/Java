import java.util.Scanner;

public class FindEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        if(isEven(a)){
            System.out.println("It is an even number: ");
        }
        else{
            System.out.println("It is an odd number: ");
        }

    }
    static boolean isEven(int a){
        return a % 2 == 0;
    }
}
