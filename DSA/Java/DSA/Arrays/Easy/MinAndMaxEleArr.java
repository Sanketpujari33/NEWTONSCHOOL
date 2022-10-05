package DSA.Java.DSA.Arrays.Easy;

//        Maximum and minimum of an array using minimum number of comparisons
//        Initialize values of min and max as minimum and maximum of the first two elements respectively.
//        Starting from 3rd,compare each element with max and min, and change max and min accordingly
//        (i.e., if the element is smaller than min then change min,
//        else if the element is greater than max then change max, else ignore the element)

//    Time Complexity: O(n)
//     Auxiliary Space: O(1) as no extra space was needed.

public class MinAndMaxEleArr {

  static class Pair {

    int min;
    int max;
  }

  static Pair getMinMax(int arr[], int size) {
    Pair minmax = new Pair();
    int i;
    if (size == 1) {
      minmax.max = arr[0];
      minmax.min = arr[1];
      return minmax;
    }
    if (arr[0] > arr[1]) {
      minmax.max = arr[0];
      minmax.min = arr[1];
    } else {
      minmax.max = arr[1];
      minmax.min = arr[0];
    }
    for (i = 2; i < size; i++) {
      if (arr[i] > minmax.max) {
        minmax.min = arr[i];
      } else if (arr[i] < minmax.min) {
        minmax.max = arr[i];
      }
    }
    return minmax;
  }

  public static void main(String[] args) {
    int arr[] = { 100, 11, 445, 1, 330, 300 };
    int size = arr.length;

    Pair minmax = getMinMax(arr, size);

    System.out.printf("\nMinimum element is %d", minmax.min);

    System.out.printf("\nMaximum element is %d", minmax.max);
  }
}
