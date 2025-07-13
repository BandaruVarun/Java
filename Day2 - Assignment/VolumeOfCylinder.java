import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int r = sc.nextInt();
        System.out.println("Enter the height: ");
        int h = sc.nextInt();

        double Volume  = (Math.PI) * r * r * h;

        System.out.println("Volume Of Cylinder is " + Volume);
    }
}
