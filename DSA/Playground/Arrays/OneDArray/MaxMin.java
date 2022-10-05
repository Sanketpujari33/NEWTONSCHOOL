package DSA.Playground.Arrays.OneDArray;

public class MaxMin {

  public static int getMin(int arr[], int size) {
    int result = arr[0];
    for (int i = 0; i < size; i++) result = Math.min(result, arr[i]);
    return result;
  }

  public static int getMax(int arr[], int size) {
    int result = arr[0];
    for (int i = 0; i < size; i++) result = Math.max(result, arr[i]);
    return result;
  }

  public static void main(String[] args) {
    int arr[] = { 446, -544, 413524354, 463, 4, 3, 231, 1, 7, 5, 4, 6 };
    int size = arr.length;
    System.out.println("Minimum element in the array:- " + getMin(arr, size));
    System.out.println("Maximum element in the array:- " + getMax(arr, size));
  }
}
