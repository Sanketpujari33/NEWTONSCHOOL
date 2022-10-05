package DSA.Arana.ControlStructures;

import java.util.Scanner; // contains Collections framework

//Checking a Number
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Write a program to check whether a number is positive, negative or zero using switch case.
//        Input
//        The first line of the input contains the number
//
//        Constraints
//        -1e9 <= n <= 1e9
//        Output
//        Print the single line wether it's "Positive", "Negative" or "Zero"
//        Example
//        Sample Input :
//        13
//
//        Sample Output :
//        Positive
//
//        Sample Input :
//        -13
//
//        Sample Output :
//        Negative

// don't change the name of this class
// you can add inner classes if needed
public class CheckingANumber {
    public static int positive(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return 2;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        while (true) {
            int number = sc.nextInt();
            int caseID = positive(number);
            switch (caseID) {
                case 2:
                    System.out.print("Negative");
                    break;
                case 1:
                    System.out.print("Positive");
                    break;
                default:
                    System.out.print("Zero");
                    break;
            }
            return;
        }
    }
}