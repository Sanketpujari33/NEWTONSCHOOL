package DSA.Java.DSA1;

public class SpiralMatrix {

  public static void spiralMatrix(int matrix[][], int r, int c) {
    int i, k = 0, l = 0;
    while (k < r && l < c) {
      for (i = l; i < c; i++) {
        System.out.print(matrix[k][i] + "->");
      }
      k++;
      for (i = k; i < r; i++) {
        System.out.print(matrix[i][c - 1] + "->");
      }
      c--;
      for (i = c - 1; i >= l; i--) {
        System.out.print(matrix[r - 1][i] + "->");
      }
      r--;
      for (i = r - 1; i >= k; i--) {
        System.out.print(matrix[i][l] + "->");
      }
      l++;
    }
    System.out.print("NULL");
  }

  public static void main(String[] args) {
    int matrix[][] = {
      { 1, 2, 3, 4 },
      { 5, 6, 7, 8 },
      { 9, 10, 11, 12 },
      { 13, 14, 15, 16 },
    };
    spiralMatrix(matrix, 4, 4);
  }
}
