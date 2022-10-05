package DSA.Arana.ControlStructures;
import java.util.*; // contains Collections framework

//Max Integer
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Given three integers your task is to calculate the maximum integer among the given integers.
//        Input
//        The input contains three integers a, b, and c
//
//        Constraint:
//        1<=integers<=10000
//        Output
//        Print the maximum integer among the given integers.
//        Example
//        Sample Input:-
//        2 6 3
//
//        Sample Output:-
//        6
//
//        Sample Input:-
//        48 100 100
//
//        Sample Output:
//        100


// don't change the name of this class
// you can add inner classes if needed
public class MaxInteger {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 =sc.nextInt();
        if (num1 >= num2 && num1 >= num3)
            System.out.println( num1 );
        else if (num2 >= num1 && num2 >= num3)
            System.out.println( num2 );
        else
            System.out.println( num3 );
    }
}