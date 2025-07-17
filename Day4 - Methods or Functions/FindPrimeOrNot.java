import java.util.Scanner;

public class FindPrimeOrNot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Integer n: ");
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.println("It is a Prime Number ");
        }
        else{
            System.out.println("It is not a Prime number");
        }
    }
    static boolean isPrime(int n){
        if(n <= 1) {
            return false;
        }

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % 2 == 0){
                return false;
            }
        }
        return true;
    }
}