package DSA.Java.DSA1;

public class moveZore {

  public static void moveZeroElement(int arr[]) {
    int j = 0;
    for (int i = 0; i < arr.length; i++) {
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
    int arr[] = { 1, 2, 0, 1, 2, 0, 1, 0, 2, 0, 1, 2, 0, 2, 1, 2, 1, 0 };
    moveZeroElement(arr);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
