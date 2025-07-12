import java.sql.SQLOutput;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the integer:");
        int a = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the name: ");
        String b = sc.nextLine();

        System.out.println("Enter the float number: ");
        float c = sc.nextFloat();

        System.out.println("Enter the double value: ");
        double d = sc.nextDouble();

        System.out.println("Enter the Long value:");
        long e = sc.nextLong();

        System.out.println("Integer: " + a);
        System.out.println("String: "+ b);
        System.out.println("Float: "+ c);
        System.out.println("Double: "+ d);
        System.out.println("Long: "+ e);
    }
}