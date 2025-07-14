import java.util.Scanner;

public class AverageOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers do you want? ");
        double n = sc.nextDouble();

        double sum = 0;
        System.out.println("Enter the " + n + " terms ");
        for(int i = 0; i < n; i++){
            double num = sc.nextDouble();
            sum += num;
        }
        double average =  sum / n;

        System.out.println("Calculate Average Of N Numbers is " + average);
    }
}
