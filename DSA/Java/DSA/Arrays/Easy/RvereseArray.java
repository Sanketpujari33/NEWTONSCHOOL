package DSA.Java.DSA.Arrays.Easy;

//Write a program to reverse an array or string
public class RvereseArray {

  public static void reverseArrayRec(int arr[], int start, int end) {
    int temp;
    if (start <= end) return;
    temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    reverseArrayRec(arr, start + 1, end - 1);
  }

  public static void rvereseArray(int arr[], int start, int end) {
    int temp;
    while (start < end) {
      temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6 };
    int size = arr.length;
    System.out.println("Input Array");
    printArray(arr);
    System.out.println("RvereseArray");
    rvereseArray(arr, 0, size - 1);
    printArray(arr);
    System.out.println("RvereseArray using recrsion");
    reverseArrayRec(arr, 0, size - 1);
    printArray(arr);
  }
}
