import java.util.Scanner;

public class MaxAndMinOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number a: ");
        int a = sc.nextInt();
        System.out.println("Enter the number b: ");
        int b = sc.nextInt();
        System.out.println("Enter the number c: ");
        int c = sc.nextInt();

        int min = Findmin(a,b,c);
        int max = Findmax(a,b,c);

        System.out.println("The Maximum value is " + max);
        System.out.println("The minimum value is " + min);
    }

    static int Findmax(int a, int b,int c){
        int max = a;
        if(b > max) {
            max = b;
        }
        if(c > max) {
            max = c;
        }
        return max;
    }
    static int Findmin(int a, int b, int c) {
        int min = a;
        if(b < min){
            min = b;
        }
        if(c < min){
            min = c;
        }
        return min;
    }
}