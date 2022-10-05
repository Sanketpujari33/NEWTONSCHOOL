package DSA.Arana.VariablesAndOperators;
import java.util.*; // contains Collections framework

//Steps Execution
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Take 4 digit number input from the user, add 8 to it and then divide it by 3(Only take integer part) Now, the modulus of that number is taken with 5 and then multiply the resultant value by 5. Display the final result.
//        Input
//        First line contains 4 digit number
//
//        Constraints
//        1000 <= number <= 9999
//        Output
//        Print the final result
//        Example
//        Sample Input :
//        2345
//
//        Sample Output :
//        20


// don't change the name of this class
// you can add inner classes if needed
public class StepsExecution {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = N + 8;
        int P = x / 3;
        int S = P % 5;
        System.out.print(S * 5);
    }
}