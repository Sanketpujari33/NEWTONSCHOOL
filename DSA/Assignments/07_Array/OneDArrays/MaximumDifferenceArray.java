package DSA.Assignments.Array.OneDArrays;

//Problem Statement
//        Given an array of integers of size N, your task is to find the maximum parity index of this array.
//        Parity Index is the maximum difference
//        between two indices i and j (1 <= i <= j <= N) of an array A such that Ai < Aj.
//        Input
//        First line of contains a single integer N,
//        next line contains N space separated integers depicting the values of array.
//
//        Constraints:-
//        1 < = N < = 100000
//        1 < = Arr[i] < = 100000
//        Output
//        Print the maximum value of j- i under the given condition, if no pair satisfies the condition print -1.
//        Example
//        Sample Input:-
//        5
//        1 2 3 4 5
//
//        Sample Output:-
//        4
//
//        Explanation:
//        The maximum difference of jth - ith index is 4:(4th - 0th), also arr[4] > arr[0]
//
//
//        Sample Input:-
//        5
//        5 4 3 2 1
//
//        Sample Output:-
//        -1
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class MaximumDifferenceArray {

  static int getDifference(int a[]) {
    int n = a.length;
    int Lmin[] = new int[n];
    int Rmax[] = new int[n];

    Lmin[0] = a[0];
    for (int i = 1; i < n; i++) {
      Lmin[i] = Math.min(Lmin[i - 1], a[i]);
    }
    Rmax[n - 1] = a[n - 1];
    for (int i = n - 2; i >= 0; i--) {
      Rmax[i] = Math.max(a[i], Rmax[i + 1]);
    }
    int i = 0, j = 0, maxDiff = -1;
    while (i < n && j < n) {
      if (Lmin[i] < Rmax[j]) {
        maxDiff = Math.max(maxDiff, j - i);
        j++;
      } else {
        i++;
      }
    }
    return maxDiff;
  }

  public static void main(String[] args) {
    // Your code here
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int a[] = new int[N];
    int i = 0;
    while (N > 0) {
      a[i] = sc.nextInt();
      i++;
      N--;
    }
    int num = getDifference(a);
    System.out.println(num);
  }
}
