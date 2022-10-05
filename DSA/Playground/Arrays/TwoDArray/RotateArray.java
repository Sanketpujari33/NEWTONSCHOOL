package DSA.Playground.Arrays.TwoDArray;

import java.util.*;

public class RotateArray {

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
    // Your code here

  }

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
}
