package DSA.DSAMock.DSA1;

public class SearchMatrix {

  public static void searchMatrix(int matrix[][], int n, int x) {
    int i = 0;
    int j = n - 1;
    while (i < n && i >= 0) {
      if (matrix[i][j] == x) {
        System.out.print(i + " " + j);
        return;
      }
      if (matrix[i][j] > x) {
        j--;
      } else {
        i++;
      }
    }
    System.out.print("not Found");
  }

  public static void main(String[] args) {
    int arr[][] = {
      { 10, 20, 30, 40 },
      { 15, 25, 35, 45 },
      { 27, 29, 37, 48 },
      { 32, 33, 98, 51 },
    };
    int n = 4;
    int x = 32;
    searchMatrix(arr, n, x);
  }
}
