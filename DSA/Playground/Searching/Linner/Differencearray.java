package DSA.Playground.Searching.Linner;

import java.util.Scanner;

public class Differencearray {

  //    static int getDiffrance(int arr[]){
  //    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int arr[] = new int[size];
    int i = 0;
    while (size > 0) {
      arr[i] = sc.nextInt();
      i++;
      size--;
    }
    //           int diff=getDiffrance(arr);
    //        System.out.println(Array.String(arr));
  }
}
