import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of digonal1: ");
        int d1 = sc.nextInt();

        System.out.println("Enter the length of digonal2: ");
        int d2 = sc.nextInt();

        double Area = 0.5 * d1 * d2;

        System.out.println("Area of the Rhombus is " + Area);
    }
}
