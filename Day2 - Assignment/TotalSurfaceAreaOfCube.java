import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the lenght of side: ");
        int side = sc.nextInt();

        double TSA = 6 * (Math.pow(side, 2));

        System.out.println("Total Surface Area Of Cube is " + TSA);
    }
}
