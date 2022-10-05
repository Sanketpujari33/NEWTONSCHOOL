package DSA.DSAMock.DSA1;

public class SelectionSort {

  public static void selectionSort(int arr[], int size) {
    for (int i = 0; i < size - 1; i++) {
      int select = i;
      for (int j = i + 1; j < size; j++) {
        if (arr[j] < arr[select]) {
          select = j;
        }
      }
      int temp = arr[select];
      arr[select] = arr[i];
      arr[i] = temp;
    }
  }

  public static void main(String[] args) {
    int arr[] = { 8, 5, 6, 3, 2, 1, 4, 7, 9, 0, 10 };
    selectionSort(arr, arr.length);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
