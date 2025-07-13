import java.util.Scanner;

public class AreaOfEquilateral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of side: ");
        int a = sc.nextInt();

        double Area = ((Math.sqrt(3) / 4) * a * a);

        System.out.println("Area of the Equilateral triangle is " + Area);
    }
}
