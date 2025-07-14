import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        int r = sc.nextInt();

        System.out.println("Enter the height ");
        int h = sc.nextInt();

        double CSA = 2 * (Math.PI) * r * h;

        System.out.println("Curved Surface Area Of Cylinder is " + CSA);

        sc.close();
    }
}
