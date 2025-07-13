import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int l = sc.nextInt();

        System.out.println("Enter the width: ");
        int b = sc.nextInt();

        System.out.println("Enter the height: ");
        int h = sc.nextInt();

        double Volume = (1.0 / 3) * l * b * h;

        System.out.println("Volume Of Pyramid is " + Volume);
    }
}
