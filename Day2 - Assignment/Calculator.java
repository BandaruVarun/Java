import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        System.out.print("Enter the 2 number: ");
        int b = sc.nextInt();

        double result = 0;


        while(true){
            System.out.println("Enter the operators like(+,-,/,*,%): ");
            char op = sc.next().trim().charAt(0);

            if(op == 'x' || op == 'X'){
                System.out.println("Calculator Exiting");
                break;
            }

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){

                if(op == '+'){
                    result = a + b;
                }
                if(op == '-'){
                    result = a - b;
                }
                if(op == '*'){
                    result = a * b;
                }
                if(op == '/'){
                    if(b != 0){
                        result = a / b;
                    }
                }
                if(op == '%'){
                    result = a % b;
                }
                System.out.println("The Result is " + result);
            }
            else{
                System.out.println("Invalid operator");
            }
        }
    }
}
