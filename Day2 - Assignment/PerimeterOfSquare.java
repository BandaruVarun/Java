import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side: ");

        int side = sc.nextInt();

        int Perimeter = 4 * side;

        System.out.println("Perimeter of the Square is " + Perimeter);
    }
}
