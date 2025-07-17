import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers from: ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        PrintPrimeInRange(start, end);


    }
    static void PrintPrimeInRange(int start, int end){
        for(int i = start; i <= end; i++){
            if(isPrime(i)){
                System.out.println(i + " ");
            }
        }

        System.out.println();
    }

    static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
