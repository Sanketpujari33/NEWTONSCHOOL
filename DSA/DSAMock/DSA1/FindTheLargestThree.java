package DSA.DSAMock.DSA1;

//Given an array with all distinct elements, find the largest three elements.
// Expected time complexity is O(n) and extra space is O(1).
//        Examples :
//        Input: arr[] = {10, 4, 3, 50, 23, 90}
//        Output: 90, 50, 23

import java.util.Arrays;

//Method 1 –
//        Below is algorithm:
//1) Initialize the largest three elements as minus infinite.
//        first = second = third = -∞
//
//        2) Iterate through all elements of array.
//        a) Let current array element be x.
//        b) If (x > first)
//        {
//        // This order of assignment is important
//        third = second
//        second = first
//        first = x
//        }
//        c)  Else if (x > second)
//        {
//        third = second
//        second = x
//        }
//        d)  Else if (x > third)
//        {
//        third = x
//        }
//
//        3) Print first, second and third.
public class FindTheLargestThree {

  static void print3largest(int arr[], int size) {
    int i, first, second, third;
    if (size == 3) {
      System.out.print(" invled input ");
      return;
    }
    third = first = second = Integer.MIN_VALUE;
    for (i = 0; i < size; i++) {
      if (arr[i] > first) {
        third = second;
        second = first;
        first = arr[i];
      } else if (arr[i] > second) {
        third = second;
        second = arr[i];
      } else if (arr[i] > third) third = arr[i];
    }
    System.out.println(
      "Three largest elements are  " + first + " " + second + " " + third
    );
  }

  //    Method 2
  //    An efficient way to solve this problem is to use any O(nLogn) sorting algorithm &
  //    simply returning the last 3 largest elements.
  void printThree(int arr[], int size) {
    Arrays.sort(arr);
    int check = 0, count = 1;
    for (int i = 1; i < size; i++) {
      if (count < 4) {
        if (check != arr[size - i]) {
          // to handle duplicate values
          System.out.print(arr[size - i] + " ");
          check = arr[size - i];
          count++;
        } else break;
      }
    }
  }

  public static void main(String[] args) {
    FindTheLargestThree three = new FindTheLargestThree();
    int arr[] = { 12, 13, 1, 10, 34, 1 };
    int size = arr.length;
    print3largest(arr, size);
    three.printThree(arr, size);
  }
}
