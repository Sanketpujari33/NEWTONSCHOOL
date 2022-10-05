package DSA.Arana.ControlStructures;
import java.util.*; // contains Collections framework


//If- Leap year
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Given a year, find if it is a leap year. Leap year is the year that is multiple of 4.
//        But, multiples of 100 which are not multiples of 400 are not leap years.
//        Input
//        The input contains a single integer N
//
//        Constraint:
//        1 <= n <= 5000
//        Output
//        Print "YES" if the year is a leap year else print "NO".
//        Example
//        Sample Input:
//        2000
//
//        Sample Output:
//        YES
//
//        Sample Input:
//        2003
//
//        Sample Output:
//        NO
//
//        Sample Input:
//        1900
//
//        Sample Output:
//        NO


// don't change the name of this class
// you can add inner classes if needed
public class IfLeapYear {
    public static void main (String[] args) {
        // Your code hereimport java.util.Scanner;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LeapYear(n);


    }
    static void LeapYear(int n){
        int p=0;
        if(n%400==0){
            p=1;
        }else if(n%100==0){
            p=0;
        }else if(n%4==0){
            p=1;
        }else{
            p=0;
        }

        if(p==1){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}