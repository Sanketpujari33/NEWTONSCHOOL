package DSA.Assignments.GCDRecursion;

//Factorial - Recursion
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Find factorial of a given number N.
//        Input
//        User Task
//        Since this is a functional problem, you don't have to worry about the input. You just have to complete the function Factorial() which contains the given number N.
//
//        Constraints:
//        1 <= N <= 15
//        Output
//        Return the factorial of the given number.
//        Example
//        Sample Input:-
//        5
//
//        Sample Output:-
//        120
//
//        Sample Input:-
//        3
//
//        Sample Output:-
//        6
public class FactorialRecursion {

  static int Factorial(int N) {
    //Enter your code here
    if (N == 1) {
      return 1;
    } else {
      return N * Factorial(N - 1);
    }
  }
}
