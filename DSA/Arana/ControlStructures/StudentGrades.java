package DSA.Arana.ControlStructures;
import java.util.*; // contains Collections framework

//Student Grades
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Given marks of a student in 5 subjects(any). You need to find the grade he/she would get on the basis of percentage obtained. Grades computed are as follows:
//
//        If the percentage of marks is >= 80 then print Grade ‘A’
//        If the percentage is <80 and >=60 then print Grade ‘B’
//        If the percentage is <60 and >=40 then print Grade ‘C’
//        else prins Grade ‘D’
//        Input
//        The input contains 5 integers separated by spaces.
//
//        Constraints:
//        1 <= marks <= 100
//        Output
//        You need to print the grade obtained by him/her.
//        Example
//        Sample Input:
//        75 70 80 90 100
//
//        Sample Output:
//        A


// don't change the name of this class
// you can add inner classes if needed
public class StudentGrades {
    private static Scanner sc;
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        //Please Enter the Five Subjects Marks :
        int english = sc.nextInt();
        int chemistry = sc.nextInt();
        int computers = sc.nextInt();
        int physics = sc.nextInt();
        int maths = sc.nextInt();
        float total,Percentage;
        //  Total Marks =  " + total
        total = english + chemistry + computers + physics + maths;

        // Marks Percentage =  " + Percentage
        Percentage = (total / 500) * 100;

        // marks for Subjects
        if(Percentage >= 80)
        {
            System.out.println("A");
        }
        else if(Percentage >= 60)
        {
            System.out.println("B");
        }
        else if(Percentage >= 40)
        {
            System.out.println("C");
        }
        else
        {
            System.out.println("D");
        }

    }
}