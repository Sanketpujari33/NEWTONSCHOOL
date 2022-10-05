package DSA.Arana.VariablesAndOperators;
import java.util.*; // contains Collections framework

//Data types
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Some Data types are given below:-
//        Integer
//        Long
//        float
//        Double
//        char
//        Your task is to take input in the given format and print them in the same order.
//        Input
//        The input contains the following values separated by lines:- integer, Long, float, double, char
//        Output
//        Print each element in a new line in the same order as input.
//
//        Note:- Print float round off to two decimal places and double to 4 decimal places.
//        Example
//        Sample Input:-
//        2
//        2312351235
//        1.21
//        543.1321
//        c
//
//        Sample Output:-
//        2
//        2312351235
//        1.21
//        543.1321
//        c

// don't change the name of this class
// you can add inner classes if needed
public class DataTypes  {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
        long b = sc.nextLong();
        System.out.println(b);
        float f = sc.nextFloat();
        System.out.println(f);
        double d = sc.nextDouble();
        System.out.println(d);
        char c = sc.next() .charAt(0);
        System.out.println(c);


    }
}