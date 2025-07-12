import java.util.Scanner;

public class Currencyconverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Inr amount: ");
        double Inr = sc.nextDouble();

        double exchangeRate = 83.50;
        double Usd = Inr / exchangeRate;

        System.out.println("The converted amount in $ is: " + Usd);
    }
}

/*
In case if the amount want to convert from dollars $ to rupees then use this formula (NR=USD×83.50)
 */
