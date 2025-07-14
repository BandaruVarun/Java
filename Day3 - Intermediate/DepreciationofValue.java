import java.util.Scanner;

public class DepreciationofValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Cost: ");  // Initial price at cost time
        int cost = sc.nextInt();

        System.out.println("Enter the Salvage: "); // Estimated value at the end of its life
        int salvage = sc.nextInt();

        System.out.println("Enter the Use in Life: ");  // Number of years the asset is expected to last
        int uselife = sc.nextInt();

        int Depriciation = (cost - salvage) / uselife;

        System.out.println("Calculate Depreciation of Value is " + Depriciation);
    }
}
