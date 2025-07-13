import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Length: ");
        int l = sc.nextInt();

        System.out.println("Enter the width: ");
        int w = sc.nextInt();

        int Area = l * w;

        System.out.println("Area of the rectangle is " + Area);
    }
}
