package DSA.Mock.DSA1;

public class MoveToZero {

  public static void moveZero(int arr[], int size) {
    int j = 0;
    for (int i = 0; i < size; i++) {
      if (arr[j] == 0 && arr[i] != 0) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
      if (arr[j] != 0) {
        j++;
      }
    }
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 0, 1, 0, 2, 0, 8, 9, 6, 0, 9, 4, 1, 5, 8, 2, 0, 0 };
    moveZero(arr, arr.length);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
