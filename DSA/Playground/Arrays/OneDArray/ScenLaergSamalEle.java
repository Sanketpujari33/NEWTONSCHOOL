package DSA.Playground.Arrays.OneDArray;

public class ScenLaergSamalEle {

  public static void main(String[] args) {
    int arr[] = { 9, 5, 6, 1, 3, 2, 4, 7, 10, 8, 11, 16, 15, 12, 14, 17, 13 };
    int size = arr.length;
    int Temp;
    for (int i = 0; i < size - 1; i++) {
      for (int j = i + 1; j < size; j++) {
        if (arr[i] > arr[j]) {
          Temp = arr[i];
          arr[i] = arr[j];
          arr[j] = Temp;
        }
      }
    }
    for (int i = 0; i < size; i++) System.out.print(arr[i] + " ");
  }
}
