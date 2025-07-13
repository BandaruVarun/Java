import java.util.Scanner;

public class AreaOfParaellologram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base: ");
        int b = sc.nextInt();

        System.out.println("Enter the height: ");
        int h = sc.nextInt();

        int Area = b * h;
        System.out.println("Area of Parallelogram is " + Area);
    }
}
