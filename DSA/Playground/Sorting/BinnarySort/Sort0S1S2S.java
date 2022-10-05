package DSA.Playground.Sorting.BinnarySort;

public class Sort0S1S2S { //timeO(N)

  public static void binnarySort(int arr[], int size) {
    int low = 0;
    int high = size - 1;
    int mid = 0;
    int temp = 0;
    while (mid <= high) {
      switch (arr[mid]) {
        case 0:
          {
            temp = arr[low];
            arr[low] = arr[mid];
            arr[mid] = temp;
            low++;
            mid++;
            break;
          }
        case 1:
          mid++;
          break;
        case 2:
          {
            temp = arr[mid];
            arr[mid] = arr[high];
            arr[high] = temp;
            high--;
            break;
          }
      }
    }
  }

  public static void printArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = {
      0,
      2,
      1,
      0,
      0,
      1,
      1,
      2,
      0,
      0,
      0,
      2,
      2,
      1,
      1,
      1,
      1,
      0,
      0,
      0,
      1,
    };
    int size = arr.length;
    binnarySort(arr, size);
    printArr(arr);
  }
}
