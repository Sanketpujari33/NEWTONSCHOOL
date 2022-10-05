package DSA.Java.Array.TwoDArray;

import java.util.Scanner;

//It is similar to 2D matrices that we studied in 11th and 12th class.
public class CreatingA2DArray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int col = sc.nextInt();
    int row = sc.nextInt();
    int[][] marks = new int[col][row];
    for (int i = 0; i < col; i++) {
      for (int j = 0; j < row; j++) {
        marks[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < col; i++) {
      for (int j = 0; j < row; j++) {
        System.out.print(marks[i][j] + " ");
      }
      System.out.println();
    }
  }
}
