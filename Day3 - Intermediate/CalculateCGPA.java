import java.util.Scanner;

public class CalculateCGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int n = sc.nextInt();

        double totalGradePoints = 0;

        // Input grade points for each subject
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter grade point for subject " + i + ": ");
            double grade = sc.nextDouble();

            // Optional: validate grade is between 0 and 10
            if (grade < 0 || grade > 10) {
                System.out.println("Invalid grade point. Please enter between 0 and 10.");
                i--; // retry the same subject
                continue;
            }

            totalGradePoints += grade;
        }

        double cgpa = totalGradePoints / n;

        System.out.println("Your CGPA is: " + cgpa);
    }
}
