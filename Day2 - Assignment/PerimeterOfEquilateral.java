import java.util.Scanner;

public class PerimeterOfEquilateral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side: ");
        int side = sc.nextInt();

        int Perimeter = 3 * side;

        System.out.println("Perimeter of the Equilateral is " + Perimeter);
    }
}
