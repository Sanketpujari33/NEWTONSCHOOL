package DSA.Playground.Searching.Linner;

public class LinnerSearch {

  public static int linnerSearch(int arr[], int size, int sum) {
    for (int i = 0; i < size; i++) {
      if (arr[i] == sum) return i;
    }
    return -1;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 4, 0, 1, 5, 9 };
    int size = arr.length;
    int X = 10;
    int result = linnerSearch(arr, size, X);
    if (result == -1) System.out.println("Not found"); else System.out.println(
      "found at index of element" + result
    );
  }
}
