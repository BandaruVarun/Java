import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String a = sc.nextLine();
        System.out.println("Hello " + a + ","+" How are you? ");
    }
}
