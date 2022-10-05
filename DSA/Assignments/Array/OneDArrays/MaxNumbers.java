package DSA.Assignments.Array.OneDArrays;

//Problem Statement
//        Given an array A of size N, you need to find its maximum, 2nd maximum and 3rd maximum element.
//
//        Try solving it in O(N) per test case
//        Input
//        The first line of the input contains the number of test cases T.
//
//        For each test case, the first line of the input contains an
//        integer N denoting the number of elements in the array A.
//        The next line contains N (space separated) elements of A.
//
//
//        Constraints:
//        1 <= T <= 100
//        3 <= N <= 10^6
//        1 <= A[i] <= 10^9
//
//        Note:-It is guaranteed that the sum of N over all text cases does not exceed 10^6
//        Output
//        For each test case, output the first, second and third maximum elements in the array.
//        Example
//        Sample Input:
//        3
//        5
//        1 4 2 4 5
//        6
//        1 3 5 7 9 8
//        7
//        11 22 33 44 55 66 77
//
//        Sample Output:
//        5 4 4
//        9 8 7
//        77 66 55
//
//        Explanation(might now be the optimal solution):
//        Testcase 1:
//        [1 4 2 4 5]
//        First max = 5
//        Second max = 4
//        Third max = 4
import java.util.*; // contains Collections framework
import java.util.Arrays;

// don't change the name of this class
// you can add inner classes if needed
public class MaxNumbers {

  public static void main(String[] args) {
    // Your code here
    Scanner sc = new Scanner(System.in);
    long t = sc.nextLong();
    while (t > 0) {
      int n = sc.nextInt();
      long a[] = new long[n];
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
      }
      Arrays.sort(a);
      System.out.println(a[n - 1] + " " + a[n - 2] + " " + a[n - 3]);
      t--;
    }
  }
}
// import java.io.*; // for handling input/output
// import java.util.*; // contains Collections framework
// don't change the name of this class
// you can add inner classes if needed
// class Main {
//method
// public static void maxNumber(){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     long max1=0,max2=0,max3=0;
//     long[] arr = new long[n];
//     for(int i=0;i<n;i++){
//        arr[i]=sc.nextLong();
//         if(arr[i]>max1){
//             max3 = max2;
//             max2 = max1;
//             max1= arr[i];
//         }
//         else if(arr[i]>max2 ){
//             max3= max2;
//             max2 = arr[i];
//         }
//         else if(arr[i]>max3){
//             max3= arr[i];
//         }
//     }
// System.out.println(max1+" "+max2+" "+max3);
// }
// public static void main (String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int t = sc.nextInt();
//     for(int j=0;j<t;j++){
//         maxNumber();
//     }
// }
// 	static void PrintMax(int array[], int n)
//     {
//             int firstmax = Integer.MIN_VALUE;
//             int secmax = Integer.MIN_VALUE;
//             int thirdmax = Integer.MIN_VALUE;
//             for (int i = 0; i < n; i++)
//             {
//                 if (array[i] > firstmax)
//                 {
//                     thirdmax = secmax;
//                     secmax = firstmax;
//                     firstmax = array[i];
//                 }
//                 else if (array[i] > secmax)
//                 {
//                     thirdmax = secmax;
//                     secmax = array[i];
//                 }
//                 else if (array[i] > thirdmax)
//                     thirdmax = array[i];
//             }
//             System.out.println( firstmax +" " + secmax+" " + thirdmax);
// ;
//     }
// 	public static void main (String[] args) {
//         Scanner sc = new Scanner(System.in);
//          int T=sc.nextInt();
//          for(int j=0; j<T; j++){
//         int N = sc.nextInt();
//         if(N>=3){
//         int[] arr = new int[N];
//         for(int i = 0 ; i<N ; i++){
//             arr[i] = sc.nextInt();
//      }
//          int n = arr.length;
//            PrintMax(arr, n);
//          }
//          }
//     }
// }
