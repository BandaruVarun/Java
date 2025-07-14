import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the SalesAmount: ");
        int salesAmount = sc.nextInt();

        System.out.println("Enter the CommissionPercentage (%): ");
        int commissionPercentage = sc.nextInt();

        double Commission = (salesAmount * commissionPercentage) / 100;

        System.out.println("Calculate Commission Percentage is " + Commission);
    }
}
