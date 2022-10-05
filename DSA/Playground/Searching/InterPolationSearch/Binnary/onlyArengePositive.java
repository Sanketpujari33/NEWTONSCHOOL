package DSA.Playground.Searching.InterPolationSearch.Binnary;

public class onlyArengePositive {

  public static void peirofSum(int[] arr, int X, int size) {
    for (int i = 0; i < (size - 1); i++) {
      for (int j = (i + 1); j < size; j++) {
        if ((arr[i] + arr[j]) == X) {
          System.out.print("paire is present " + i + " " + j + "\n");
        }
      }
    }
    System.out.println("peir not Exist");
  }

  public static void main(String[] args) {
    int arr[] = { 9, 5, 7, 4, 6, 1, 3, 8, 2, 11, 12, 13 };
    int size = arr.length;
    int sum = 11;
    peirofSum(arr, size, sum);
  }
}
