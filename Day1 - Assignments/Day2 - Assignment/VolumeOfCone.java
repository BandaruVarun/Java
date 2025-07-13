import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int r = sc.nextInt();

        System.out.println("Enter the height: ");
        int h = sc.nextInt();

        double Volume = (1.0 / 3) * (Math.PI) * r * r * h;

        System.out.println("Volume Of Cone is " + Volume);
    }
}
