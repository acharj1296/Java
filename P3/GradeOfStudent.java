import java.util.Scanner;
class GradeOfStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks obtained by the student: ");
        int marks = scanner.nextInt();
        char grade;

        if (marks >= 90 ) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else if (marks >= 50 ) {
            grade = 'E';
        } else if (marks >= 0 ) {
            grade = 'F';
        } else {
            System.out.println("Invalid marks entered.");
            scanner.close();
            return;
        }

        System.out.println("The grade of the student is: " + grade);
        scanner.close();
    }
}