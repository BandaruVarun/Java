import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the runs: ");
        int r = sc.nextInt();
        System.out.println("Enter the out times: ");
        int o = sc.nextInt();

        int average = r / o;

        System.out.println("Calculate Batting Average is " + average);
    }
}
