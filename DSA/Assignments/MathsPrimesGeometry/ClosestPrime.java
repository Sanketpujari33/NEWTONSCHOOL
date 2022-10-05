package DSA.Assignments.MathsPrimesGeometry;

import java.util.*; // contains Collections framework

//Closest Prime (Contest)
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Given an integer N, find the closest prime number to N. If there are multiple print the smaller one.
//        Input
//        The input contains a single integer N.
//
//        Constraints:
//        1 <= N <= 1000000000
//        Output
//        Print the closest prime to N.
//        Example
//        Sample Input 1
//        12
//
//        Sample Output 1
//        11
//
//        Explanation: Closest prime to 12 is 11 and 13 smaller of which is 11.
//
//        Sample Input 2
//        17
//
//        Sample Output 2
//        17
//
//        Explanation: Closest prime to 17 is 17
// don't change the name of this class
// you can add inner classes if needed
public class ClosestPrime {

  // public static void main (String[] args) {
  //       Scanner sc=new Scanner(System.in);
  //       int n=sc.nextInt();
  //      int below=0, above=0;
  //       for( int i=n; i>0; i--){
  //           below=i;
  //          if (isPrime(i)){

  //           break;
  //         }
  //       }
  //       for(int j=n; j<Integer.MAX_VALUE; j++){
  //         above=j;
  //        if (isPrime(j)){

  //           break;
  //           }
  //       } if(below>1){
  //       if((n-below)<=(above-n)) {
  //           System.out.print(below);
  //       }else if((n-below)>(above-n)) {
  //          System.out.print(above);
  //       } }
  //       else{
  //            System.out.print(above);
  //       }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int N = s.nextInt();
    int i = 0;
    while (getPrime(N - i) == false && getPrime(N + i) == false) {
      i++;
    }
    if (N == 1) System.out.println(N + 1); else if (
      getPrime(N - i) == true
    ) System.out.println(N - i); else System.out.println(N + i);
  }

  static boolean getPrime(int N) {
    boolean flag = false;
    for (int i = 2; i <= Math.sqrt(N); i++) {
      if (N % i == 0) {
        flag = true;
        break;
      }
    }
    if (!flag) return true; else return false;
  }
}
