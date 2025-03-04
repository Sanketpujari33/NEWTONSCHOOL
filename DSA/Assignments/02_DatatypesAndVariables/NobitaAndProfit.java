package DSA.Assignments.DatatypesAndVariables;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
//Problem Statement
//        Nobita wants to become rich so he came up with some ideas.
//        Nobita buys some gadgets from the future at a price of C and sells them at a price of S to his friends.
//        Now Nobita wants to know how much he gains by selling 1 gadget.
//        As we all know Nobita is weak in maths help him to find the profit he gets
//        Input
//        The input contains two integer C and S separated by spaces.
//
//        Constraints:-
//        1 <= C <= S <= 1000
//        Output
//        Print the profit Nobita gets from selling one gadget.
//        Example
//        Sample Input:-
//        3 5
//
//        Sample Output:-
//        2
//
//        Sample Input:-
//        9 15
//
//        Sample Output:-
//        6

public class NobitaAndProfit {

  public static void main(String[] args) {
    // Your code here
    int C, S, P;
    Scanner sc = new Scanner(System.in);
    C = sc.nextInt();
    S = sc.nextInt();
    P = S - C;
    System.out.println(P);
  }
}
