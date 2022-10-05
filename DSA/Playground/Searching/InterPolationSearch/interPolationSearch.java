package DSA.Playground.Searching.InterPolationSearch;

// java program t0 implement interpolation
//search with recursion
import java.util.*;

public class interPolationSearch {

  //If x is present in arr[0..n-1],then returns
  //index of it, else returns -1.
  public static int intrerPolationSearching(
    int arr[],
    int low,
    int high,
    int x
  ) {
    int pos;
    //Since array is sorted, an element
    //present in array must be in range
    // defined by corner
    if (low <= high && x >= arr[low] && x <= arr[high]) {
      // probing the position with keeping
      // uniform distribution in mind.
      pos = low + (((high - low) / (arr[high] - arr[low])) * (x - arr[low]));
      //condition of target found
      if (arr[pos] == x) return pos;
      //if x is larges, x is in right sub array
      if (arr[pos] < x) return intrerPolationSearching(arr, low, pos - 1, x);
    }
    return -1;
  }

  // Driver Code
  public static void main(String[] args) {
    // Array of items on which search will
    // be conducted
    int arr[] = { 10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47 };
    int size = arr.length;
    //Element to be searched
    int X = 21;
    int index = intrerPolationSearching(arr, 0, size - 1, X);
    //If element was found
    if (index != -1) System.out.println(
      "Element Found at Index:- " + index
    ); else System.out.println("Element not found.");
  }
}
