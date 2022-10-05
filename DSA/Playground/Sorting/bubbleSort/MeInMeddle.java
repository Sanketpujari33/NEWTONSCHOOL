package DSA.Playground.Sorting.bubbleSort;

public class MeInMeddle {

  public static int[] bubbleSort(int arr[]) {
    int size = arr.length;
    for (int i = 0; i < size - 1; i++) {
      for (int j = 0; j < size - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int Temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = Temp;
        }
      }
    }
    return arr;
  }

  public static int[] selectionSort(int arr[]) {
    int size = arr.length;
    for (int i = 0; i < size - 1; i++) {
      int smallest = i;
      for (int j = i + 1; j < size; j++) {
        if (arr[j] > arr[smallest]) {
          smallest = j;
        }
      }
      int Temp = arr[smallest];
      arr[smallest] = arr[i];
      arr[i] = Temp;
    }
    return arr;
  }

  public static int[] insertionSort(int arr[]) {
    int size = arr.length;
    for (int i = 1; i < size; i++) {
      int current = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > current) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = current;
    }
    return arr;
  }

  public static void maidMe(int arr[], int low, int high) {
    //        Arrays.sort(arr);
    //        bubbleSort(arr);
    //        selectionSort(arr);
    insertionSort(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    while (low <= high) {
      int mid = low + (high - low) / 2;
      System.out.println(arr[mid]);
      break;
    }
  }

  public static void main(String[] args) {
    int arr[] = { 2, 3, 4, 9, 1 };
    int size = arr.length;
    maidMe(arr, 0, size - 1);
  }
}
