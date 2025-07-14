import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Price: ");
        int price = sc.nextInt();

        System.out.println("Enter the discount (%) : ");
        double discount = sc.nextDouble();

        double discountAmount = (price * discount) / 100;

        double FinalAmount = (price - discountAmount);

        System.out.println("The Discount Amount is " + discountAmount);

        System.out.println("The Final Amount is " + FinalAmount);
    }
}
