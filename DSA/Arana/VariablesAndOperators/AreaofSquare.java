package DSA.Arana.VariablesAndOperators;
import java.util.*; // contains Collections framework

//Area of Square
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Given a side of a square, your task is to calculate its area.
//        Input
//        The first line of the input contains the side of the square.
//
//        Constraints:
//        1 <= side <=100
//        Output
//        You just have to print the area of a square
//        Example
//        Sample Input:-
//        3
//
//        Sample Output:-
//        9
//
//        Sample Input:-
//        6
//
//        Sample Output:-
//        36

// don't change the name of this class
// you can add inner classes if needed
public class AreaofSquare {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int N = S * S;
        System.out.print(N);

    }
}