import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        float a = sc.nextInt();
        System.out.println("Enter b:");
        float b = sc.nextInt();

        float c = a + b;

        System.out.println("Enter d:");
        byte d = (byte) sc.nextInt();
        System.out.println("Enter e:");
        byte e = (byte) sc.nextInt();

        byte f = (byte) (d - e);

        System.out.println(c);
        System.out.println(f);
        sc.close();

    }
}
