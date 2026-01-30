import java.util.Scanner;

// Program to calculate total marks, percentage and grade of a student
public class StudentGradeAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking marks input for five subjects
        System.out.print("Enter Hindi marks: ");
        int hindi = sc.nextInt();

        System.out.print("Enter English marks: ");
        int english = sc.nextInt();

        System.out.print("Enter Math marks: ");
        int math = sc.nextInt();

        System.out.print("Enter Physics marks: ");
        int physics = sc.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();

        // Calculating total and percentage
        int totalMarks = hindi + english + math + physics + chemistry;
        double percentage = totalMarks / 5.0;

        // Displaying total and percentage
        System.out.println("\nTotal Marks = " + totalMarks + " / 500");
        System.out.println("Percentage = " + percentage);

        // Determining grade
        if (percentage > 70) {
            System.out.println("Result: Passed with Excellent Grade");
        } 
        else if (percentage > 60) {
            System.out.println("Result: First Grade");
        } 
        else if (percentage > 50) {
            System.out.println("Result: Second Grade");
        } 
        else if (percentage >= 40) {
            System.out.println("Result: Pass");
        } 
        else {
            System.out.println("Result: Fail");
        }

        sc.close();
    }
}