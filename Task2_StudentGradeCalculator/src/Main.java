/*********************************Libraries*********************************/
import java.util.Scanner;
/*******************************Main function*******************************/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("/***********************Welcome to Grade calculator*******************/");
        System.out.println("Enter the number of subjects:");
        int NumberOfSubjects = scanner.nextInt();
        int Total = 0;
        for (int i = 1; i <= NumberOfSubjects; i++) {
            System.out.println("Enter the number of marks in subjects" + i + ":");
            int marks = scanner.nextInt();
            Total += marks;

        }
        float Avg = (float) Total / (NumberOfSubjects * 100) * 100;    //Formula that calculate the average percentage of the subjects
        char Grade;
        if (Avg >= 90) {
            Grade = 'A';
        } else if ((Avg < 90) && (Avg >= 80)) {
            Grade = 'B';
        } else if ((Avg < 80) && (Avg >= 70)) {
            Grade = 'C';
        } else if ((Avg < 70) && (Avg >= 60)) {
            Grade = 'D';
        }
        else {
            Grade = 'F';
        }
        System.out.println("Student Report");
        System.out.println("Total marks of student is:"+Total);
        System.out.println("Average percentage of student's Grades:"+Avg);
        System.out.println("The final grade is:"+Grade);

    }
}