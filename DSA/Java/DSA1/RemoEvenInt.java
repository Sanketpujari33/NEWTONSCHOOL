package DSA.Java.DSA1;

public class RemoEvenInt {

  public static int[] removeEven(int arr[], int size) {
    int count = 0;
    for (int i = 0; i < size; i++) {
      if (arr[i] % 2 == 0) {
        count++;
      }
    }
    int evenArr[] = new int[count];
    int idx = 0;
    for (int i = 0; i < size; i++) {
      if (arr[i] % 2 == 0) {
        evenArr[idx] = arr[i];
        idx++;
      }
    }
    return evenArr;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int size = arr.length;
    int result[] = removeEven(arr, size);
    for (int i : result) {
      System.out.print(i + " ");
    }
  }
}
