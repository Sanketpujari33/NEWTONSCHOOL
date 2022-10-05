package DSA.DSAMock.DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Sum of Two
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Given an array of integers, find two numbers such that they add up to a specific
//        target number k.
//        Output the indices of the elements that add up to the sum (array is 1 indexed).
//        If multiple solutions exist, output the one where index2 is minimum. If there are
//        multiple solutions with the minimum index2, choose the one with minimum
//        index1 out of them.
//        For example:
//        array A[] = 1 1 3 2 2
//        k = 3
//
//        Output: 1 4
//        Explanation: pair of indices which give target k are: (1, 4), (1, 5), (2, 4), (2, 5).
//        Among all such pairs (1, 4) satisfies the above condition.
//        Input
//        The first line contains integers N and k, the number of elements in the array and
//        the target sum.
//        The second line of the input contains N singly spaced integers.
//
//        Constraints:-
//        2 <= N <= 100000
//        1 <= A[i] <= 1000000000
//        1 <= k <= 2000000000
//        Output
//        Output two integers the indices of the two elements.
//        It is guaranteed that the ans will always exist
//        Example
//        Sample Input
//        5 3
//        1 1 3 2 2
//        Sample Output
//        1 4
//        Explanation: The satisfying pairs are (1, 4), (2, 4), (1, 5), (2, 5).
//        Sample Input:
//        2 2
//        1 1
//        Sample Output:
//        1 2
public class TwoSum {

  public static void main(String[] args) {
    int arr[] = { 1, 1, 3, 2, 2 };
    int size = 5;
    int K = 3;
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        //compare with K
        if (arr[i] + arr[j] == K) {
          System.out.println("K found at location (" + j + ", " + i + ")");
        }
      }
    }
  }
}
