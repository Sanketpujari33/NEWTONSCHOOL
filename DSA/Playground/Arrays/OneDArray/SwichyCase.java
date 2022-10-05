package DSA.Playground.Arrays.OneDArray;

public class SwichyCase {

  public static void sort123(int arr[], int size) {
    int low = 0;
    int high = size - 1;
    int mid = 0;
    int Temp = 0;
    while (mid <= high) {
      switch (arr[mid]) {
        case 1:
          {
            Temp = arr[low];
            arr[low] = arr[mid];
            arr[mid] = Temp;
            low++;
            mid++;
            break;
          }
        case 2:
          {
            mid++;
            break;
          }
        case 3:
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

  public static void print(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int arr[] = {
      1,
      2,
      3,
      3,
      3,
      3,
      2,
      2,
      2,
      1,
      1,
      1,
      1,
      1,
      3,
      3,
      3,
      2,
      3,
      2,
      3,
      2,
      2,
      1,
      1,
      1,
      1,
      3,
      3,
      2,
      2,
      3,
      1,
      3,
      3,
      1,
      3,
      3,
      1,
      3,
      1,
      3,
    };
    int size = arr.length;
    sort123(arr, size);
    print(arr);
  }
}
