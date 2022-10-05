package DSA.Playground.Arrays.OneDArray;

public class remoduplicetin {

  public static int[] remo(int arr[], int size) {
    int t = 1;
    int Temp = arr[0];
    for (int i = 0; i < size; i++) {
      if (arr[t] < arr[i]) {
        arr[t] = arr[i];
        t++;
        Temp = arr[i];
      }
    }
    return arr;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 2, 3, 6, 6, 4, 9, 6, 6, 4, 2, 3 };
    int size = arr.length;
    int[] result = remo(arr, size);
    for (int i = 0; i < size; i++) {
      System.out.print(result[i] + " ");
    }
  }
}
