package DSA.Arana.ControlStructures;
import java.util.*; // contains Collections framework

//FizzBuzz
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Given a number N for each i (1 < = i < = N), you have to print the number except :-
//        For each multiple of 3, print "Fizz" instead of the number.
//        For each multiple of 5, print "Buzz" instead of the number.
//        For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.
//        Input
//        Input contains a single integer N.
//
//        Constraints:-
//        1 < = N < = 1000
//        Output
//        Print N space separated number or Fizz buzz according to the condition.
//        Example
//        Sample Input:-
//        3
//
//        Sample Output:-
//        1 2 Fizz
//
//        Sample Input:-
//        5
//
//        Sample Output:-
//        1 2 Fizz 4 Buzz


// don't change the name of this class
// you can add inner classes if needed
public class FizzBuzz {
    public static int fizzbuzz(int N) {
        int i;
        //Enter your code here
        for ( i = 0; i <= N; i++) {
            if (i % 15 == 0) {
                System.out.print("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            }
        }
        return i;
    }
        public static void main (String[]args){
            try (// Your code here
            Scanner sc = new Scanner(System.in)) {
                int X = sc.nextInt();
                System.out.print(X);
            }
        }
}