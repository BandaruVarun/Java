import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base: ");
        int b = sc.nextInt();
        System.out.println("Enter the height: ");
        int h = sc.nextInt();

        double Area = 0.5 * b * h;

        System.out.println("Area of Triangle is " + Area);
    }
}
