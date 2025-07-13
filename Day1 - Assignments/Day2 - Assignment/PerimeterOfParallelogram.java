import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int b = sc.nextInt();

        System.out.println("Enter the side: ");
        int s = sc.nextInt();

        int Perimeter = 2 * (b + s);
        System.out.println("Perimeter of the parallelogram: " + Perimeter);
    }
}
