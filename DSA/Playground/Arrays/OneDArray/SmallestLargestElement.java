package DSA.Playground.Arrays.OneDArray;

public class SmallestLargestElement {

  public static int largestElement(int arr[], int size) {
    int laegest = arr[0];
    for (int i = 0; i < size; i++) {
      if (arr[i] > laegest) laegest = arr[i];
    }
    return laegest;
  }

  public static int smalestElement(int arr[], int size) {
    int smalest = arr[0];
    for (int i = 0; i < size; i++) {
      if (arr[i] < smalest) smalest = arr[i];
    }
    return smalest;
  }

  public static void main(String[] args) {
    int arr[] = { 12, 45, 78, 96, 32, 5, 66, 45, 1 };
    int size = arr.length;
    int largest = largestElement(arr, size);
    int smallest = smalestElement(arr, size);
    System.out.println(largest + " " + smallest);
  }
}
