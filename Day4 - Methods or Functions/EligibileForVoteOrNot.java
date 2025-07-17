import java.util.Scanner;

public class EligibileForVoteOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int a = sc.nextInt();

        if(isVote(a)){
            System.out.println("Eligible for Vote");
        }
        else{
            System.out.println("Not Eligible for vote!");
        }

    }
    static boolean isVote(int a) {
        return a >= 18;
    }
}
