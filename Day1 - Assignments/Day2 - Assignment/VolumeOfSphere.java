import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int r = sc.nextInt();

        double Volume = (4.0 / 3) * (Math.PI) * r * r * r;
        System.out.println("Volume Of Sphere is " + Volume);
    }
}
