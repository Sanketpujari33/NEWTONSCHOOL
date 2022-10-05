package DSA.Playground.Searching.ExponentialSearch;

//java program
// find an element X in a
// sorted array using
//Exponential search
import java.util.Arrays;

public class ExponentialSearch { // O(Log n)

  static int exponentialSearch(int arr[], int size, int x) {
    //If X is present at first loction itself
    if (arr[0] == x) return 0;
    //find range for binary search by
    // repeated dounding
    int i = 1;
    while (i < size && arr[i] <= x) i = i * 2;
    //call binarySearch for the found rangw
    return Arrays.binarySearch(arr, i / 2, Math.min(i, size - 1), x);
  }

  public static void main(String[] args) {
    int arr[] = { 2, 3, 4, 10, 40 };
    int size = arr.length;
    int x = 10;
    int result = exponentialSearch(arr, size, x);
    System.out.println(
      (result < 0)
        ? "Element is not present in array"
        : "Element is present at index:- " + result
    );
  }
}
