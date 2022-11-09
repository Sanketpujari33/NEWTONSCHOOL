package DSA.Mock.DSA1;

public class LinerSearch {

  public static int linnerSearch(int arr[], int size, int x) {
    for (int i = 0; i < size; i++) {
      if (arr[i] == x) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int size = arr.length;
    int x = 6;
    int result = linnerSearch(arr, size, x);
    if (result == -1) {
      System.out.print("NOT FOUND");
    } else {
      System.out.print(result);
    }
  }
}
