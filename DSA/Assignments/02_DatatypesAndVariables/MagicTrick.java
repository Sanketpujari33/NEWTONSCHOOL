package DSA.Assignments.DatatypesAndVariables;

//Problem Statement
//        Sara is trying a new magic trick on you, The magic trick goes in 6 steps:-
//        1. Think of a number X(don't tell Sara)
//        2. Add A(Given by Sara) to it.
//        3. Double the sum in your mind.
//        4. Add an even number B(Given by Sara) to it.
//        5. Half the amount
//        6. Subtract the initial number which you had taken from the sum
//        After this Sara will tell the resulting amount without knowing the initial number, can you print the result for her?
//        Input
//        Input Contains two integers A and B separated by spaces.
//
//        Constraints:-
//        1 <= A, B <= 1000
//        Output
//        Print the resulting amount
//        Example
//        Sample Input:-
//        3 4
//
//        Sample Output:-
//        5
//
//        Sample Input:-
//        8 4
//
//        Sample Output:-
//        10
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class MagicTrick {

  public static void main(String[] args) {
    // Your code here
    Scanner sc = new Scanner(System.in);
    //Think of a number X(don't tell Sara)
    int x = 5;
    int y = x;
    //two integers A and B separated by spaces.
    int A = sc.nextInt();
    int B = sc.nextInt();
    //2. Add A(Given by Sara) to it.
    x = x + A;
    //3. Double the sum in your mind.
    x = 2 * x;
    //4. Add an even number B(Given by Sara) to it.
    x = x + B;
    //5. Half the amount
    x = x / 2;
    //6. Subtract the initial number
    //which you had taken from the sum
    x = x - y;
    // can you print the result for her?
    System.out.println(x);
  }
}
