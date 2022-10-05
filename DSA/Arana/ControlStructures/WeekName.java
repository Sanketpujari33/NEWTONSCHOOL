package DSA.Arana.ControlStructures;
import java.util.*; // contains Collections framework

//Week Name
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Write a program to print day of week name using switch case.
//        Input
//        The first line of the input contains week number
//
//        Constraints
//        1 <= weekNumber <= 7
//        Output
//        Print Week day Name.
//
//        Note Intitals must be capitals
//        Example
//        Sample Input :
//        3
//
//        Sample Output :
//        Wednesday

// don't change the name of this class
// you can add inner classes if needed
public class WeekName {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        if(day<1 || day>7){
            System.out.println("Invalid weekday number.");
            System.exit(0);
        }
        switch (day){
            case 7:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:System.out.println("invaled day");
        }
    }
}