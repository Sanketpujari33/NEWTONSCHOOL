package DSA.Mock.DSA1;

public class FindMinimumElement {

  public static int findMimiElement(int arr[], int size) {
    int min = arr[0];
    for (int i = 0; i < size; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 5, 2, 8, 6, 3, 1, 0, 12, 3, 4, 31 };
    System.out.println(findMimiElement(arr, arr.length));
  }
}
