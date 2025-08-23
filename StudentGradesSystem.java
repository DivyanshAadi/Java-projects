import java.util.Scanner;

public class StudentGradesSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Step 2: Create arrays for names and marks
        String[] names = new String[n];
        int[] marks = new int[n];

        // Step 3: Input student data
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = sc.next();
            
            System.out.print("Enter marks of " + names[i] + ": ");
            marks[i] = sc.nextInt();
        }

        // Step 4: Display student grades
        System.out.println("\n--- Student Grades ---");
        for (int i = 0; i < n; i++) {
            char grade;

            if (marks[i] >= 90) grade = 'A';
            else if (marks[i] >= 75) grade = 'B';
            else if (marks[i] >= 50) grade = 'C';
            else grade = 'F';

            System.out.println("Name: " + names[i] + " | Marks: " + marks[i] + " | Grade: " + grade);
        }

        sc.close();
    }
}
