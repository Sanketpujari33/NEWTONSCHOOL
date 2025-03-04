package DSA.Java.DSA1;

public class ReverseArray {

  public static void reverseArr(int arr[]) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    reverseArr(arr);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
