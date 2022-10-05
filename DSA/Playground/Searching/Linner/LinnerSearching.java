package DSA.Playground.Searching.Linner;

public class LinnerSearching {

  public static int serch(int arr[], int x) {
    int size = arr.length;
    for (int i = 0; i < size; i++) {
      if (arr[i] == x) return i;
    }
    return -1;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 3, 4, 10, 40 };
    int X = 10;
    int result = serch(arr, X);
    if (result == -1) System.out.println(
      "Element is not present  array"
    ); else System.out.println("Element is  present  at index:- " + result);
  }
}
