import java.util.Scanner;

public class AreaAndCircumferenceOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double r = sc.nextDouble();

        double Area = AreaOfCircle(r);
        double Cir = Circumference(r);
        System.out.println("Area of the Circle is " + Area);
        System.out.println("Area of the Circumference is " + Cir);

    }
    static double AreaOfCircle(double r) {
        double Area = Math.PI * r * r;
        return Area;
    }

    static double Circumference(double r) {
        double Cir = 2 * Math.PI * r;
        return Cir;
    }
}
