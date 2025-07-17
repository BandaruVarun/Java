import java.util.Scanner;

public class GradesAccordingToMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int n = sc.nextInt();

        if(n < 0 || n > 100){
            System.out.println("Enter the valid marks (0 to 100) ");
        }
        else{
            GradePoints(n);
        }

    }
    static void GradePoints(int n){
        if(n >= 91 && n <= 100){
            System.out.println("You secured in Grade AA");
        } else if (n >= 81 && n <= 90) {
            System.out.println("You secured in Grade AB");
        }
        else if(n >= 71 && n <= 80){
            System.out.println("You secured in Grade BB");
        }
        else if(n >= 61 && n <= 70){
            System.out.println("You secured in Grade BC");
        }
        else if(n >= 51 && n <= 60){
            System.out.println("You secured in Grade CD");
        }
        else if(n >= 41 && n <= 50){
            System.out.println("You secured in Grade DD");
        }
        else{
            System.out.println("You are Fail!");
        }

    }
}
