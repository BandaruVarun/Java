import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length: ");
        int l = sc.nextInt();

        System.out.println("Enter the width: ");
        int w = sc.nextInt();

        int Perimeter = 2 * (l + w);

        System.out.println("Perimeter of the Rectangle is " + Perimeter);
    }
}
