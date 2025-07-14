import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal Amount: ");
        int p = sc.nextInt();

        System.out.println("Enter the Rate os interest(%): ");
        double r = sc.nextDouble();

        System.out.println("Enter the time in years: ");
        int T = sc.nextInt();

        double FinalAmount = p * (Math.pow(1 + (r / 100), T));
        double CompoundInterest = FinalAmount - p;

        System.out.println("Compound Interest Java Program is " + CompoundInterest);
        System.out.println("Total amount " + T + " years: " + FinalAmount);
    }
}
