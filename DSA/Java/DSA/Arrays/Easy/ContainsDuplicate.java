package DSA.Java.DSA.Arrays.Easy;

//Given an integer array nums, return true if any value appears at least twice in the array,
//        and return false if every element is distinct.
//        Example 1:
//        Input: nums = [1,2,3,1]
//        Output: true
//
//        Example 2:
//        Input: nums = [1,2,3,4]
//        Output: false
//
//        Example 3:
//        Input: nums = [1,1,1,3,3,4,3,2,4,2]
//        Output: true

import java.util.HashSet;

public class ContainsDuplicate {

  public static boolean duplicateCantains(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) return true;
      }
    }
    return false;
  }

  public static boolean containsDuplicate(int arr[]) {
    HashSet<Integer> set = new HashSet<>();
    for (int i : arr) if (!set.add(i)) return true;
    return false;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 9 };
    System.out.println(containsDuplicate(arr));
    System.out.print(duplicateCantains(arr));
  }
}
