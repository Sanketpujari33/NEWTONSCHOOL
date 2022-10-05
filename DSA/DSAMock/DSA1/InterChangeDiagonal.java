package DSA.DSAMock.DSA1;

public class InterChangeDiagonal {

  public static void main(String[] args) {
    int matrix[][] = {
      { 1, 2, 3, 4, 5 },
      { 6, 7, 8, 9, 10 },
      { 11, 12, 13, 14, 15 },
      { 16, 17, 18, 19, 20 },
      { 21, 22, 23, 24, 25 },
    };
    int n = 5;
    int m = 5;
    for (int i = 0; i < n; i++) {
      int temp = matrix[i][i];
      matrix[i][i] = matrix[i][n - i - 1];
      matrix[i][n - i - 1] = temp;
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(matrix[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
