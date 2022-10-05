package DSA.Playground.Searching.Linner;

public class ZerosandOnes {

  public static void sort012(int arr[], int size) {
    int low = 0;
    int high = size - 1;
    int mid = 0;
    int Temp = 0;
    while (mid <= high) {
      switch (arr[mid]) {
        case 0:
          {
            Temp = arr[low];
            arr[low] = arr[mid];
            arr[mid] = Temp;
            low++;
            mid++;
            break;
          }
        case 1:
          mid++;
          break;
        case 2:
          {
            Temp = arr[mid];
            arr[mid] = arr[high];
            arr[high] = Temp;
            high--;
            break;
          }
      }
    }
  }

  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
    int size = arr.length;
    sort012(arr, size);
    printArray(arr);
  }
}
