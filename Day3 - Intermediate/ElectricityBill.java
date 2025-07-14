import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Units: ");
        int units = sc.nextInt();

        double bill = 0;
        double fixedCharge = 50;

        if(units <= 100) {
            bill = units * 1.5;
        }
        else if(units <= 200) {
            bill = (100 * 1.5) + (units - 100) * 2.5;
        }
        else{
            bill = (100 * 1.5) + (200 * 2.5) + (units - 300) * 3.5;
        }
        System.out.println("The amount of electricity bill is " + bill);
    }
}
