import java.util.Scanner;

public class PythagoreanTripletChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a: ");
        int a = sc.nextInt();
        System.out.println("Enter the number b: ");
        int b = sc.nextInt();
        System.out.println("Enter the number c: ");
        int c = sc.nextInt();

        if(isPythagoreanTripletChecker(a,b,c)){
            System.out.println("It is a PythagoreanTripletChecker");
        }
        else{
            System.out.println("It is Not a PythagoreanTripletChecker");
        }
    }
    static boolean isPythagoreanTripletChecker(int a, int b, int c) {
        int x = a * a;
        int y = b * b;
        int z = c * c;

        return(x + y == z || x + z == y || y + z == x);
    }
}
