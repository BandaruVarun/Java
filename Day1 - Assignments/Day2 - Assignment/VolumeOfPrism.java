import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length: ");
        int l = sc.nextInt();

        System.out.println("Enter the width: ");
        int b = sc.nextInt();

        System.out.println("Enter the height: ");
        int h = sc.nextInt();

        double Volume = l * b * h;

        System.out.println("Volume Of Prism is " + Volume);
    }
}
