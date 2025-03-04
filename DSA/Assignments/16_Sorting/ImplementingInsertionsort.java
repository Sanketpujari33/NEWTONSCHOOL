package DSA.Assignments.16_Sorting;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class ImplementingInsertionsort {
    public static void main(String[] args) {
        // Your code here
        int t;
        int n;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t > 0) {
            n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 1; i < n; i++) {
                int key = a[i];
                int j = i - 1;
                while (j >= 0 && a[j] > key) {
                    a[j + 1] = a[j];
                    j = j - 1;
                }
                a[j + 1] = key;
            }
            t--;
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}