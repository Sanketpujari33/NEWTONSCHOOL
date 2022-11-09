package DSA.Assignments.StringBasics;

import java.util.*; // contains Collections framework

//Special Number (contest)
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Given a number N, find out whether it is divisible by 3.
//        Input
//        The first and the only line of input contains the number N.
//
//        Constraints
//        1 <= N <= 10^100000 (N may consist of 100001 digits).
//
//
//        No usual datatype will be able to input such large number.
//        Output
//        Output "Yes" if the number is divisible by 3, else output "No".
//        Example
//        Sample Input 1
//        14
//
//        Sample Output 1
//        No
//
//        Sample Input 2
//        1234567890123456789012345678901234567890
//
//        Sample Output 2
//        Yes
//
//        Explanation: In the first sample case, the number is not divisible by 3,
//        while in the second sample case, it is divisible by 3.
//        (We know how weird this explanation is, but ok)
// don't change the name of this class
// you can add inner classes if needed
public class SpecialNumber {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String number = in.next(); // 99

    int sum = 0;
    for (int i = 0; i < number.length(); i++) {
      sum += number.charAt(i) - '0';
    }

    if (sum % 3 == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
//    public static void main (String[] args) {
//        // Your code here
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        int sum =0;
//        char[] ch = new char[str.length()];
//
//        for (int i = 0; i < str.length(); i++) {
//            ch[i] = str.charAt(i);
//            sum += Character.getNumericValue(str.charAt(i));
//        }
//        if(sum%3 == 0){
//            System.out.print("Yes");
//        }
//        else{
//            System.out.print("No");
//        }
//    }
//}
