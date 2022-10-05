package DSA.Java.DSA1;

public class RemoveDuplicateElements {

  public static int removeDuplicates(int arr[], int size) {
    if (size == 0 || size == 1) {
      return size;
    }
    int j = 0;
    for (int i = 0; i < size - 1; i++) {
      if (arr[i] != arr[i + 1]) {
        arr[j++] = arr[i];
      }
    }
    arr[j++] = arr[size - 1];
    return j;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 2, 45, 9, 8, 5, 4, 5, 3, 3, 4, 4, 4, 5, 5, 6 };
    int size = arr.length;
    int j = 0;
    j = removeDuplicates(arr, size);
    for (int i = 0; i < j; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
