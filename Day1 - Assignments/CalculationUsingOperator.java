import java.util.Scanner;

public class CalculationUsingOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double a = sc.nextDouble();

        System.out.println("Enter b number: ");
        double b = sc.nextDouble();

        System.out.println("Enter operator (+ , -, * , /): ");
        char operator = sc.next().charAt(0);

        double result = 0;
        boolean valid = true;

        if(operator == '+') {
            result = a + b;
        }
        else if(operator == '-') {
            result = a - b;
        }
        else if(operator == '*') {
            result = a * b;
        }
        else if(operator == '/') {
            if(b != 0) {
                result = a / b;
            }
            else {
                System.out.println("Will not be divide with zero");
                valid = false;
            }
        }
        else {
            System.out.println("Invalid operator!");
            valid = false;
        }
        if(valid == true) {
            System.out.println("Result: " + result);
        }
    }
}