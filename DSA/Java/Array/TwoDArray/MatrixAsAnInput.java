package DSA.Java.Array.TwoDArray;

import java.util.*;

//Taking a matrix as an input and printing its elements.

public class MatrixAsAnInput {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int cols = sc.nextInt();

    int[][] numbers = new int[rows][cols];

    //input
    //rows
    for (int i = 0; i < rows; i++) {
      //columns
      for (int j = 0; j < cols; j++) {
        numbers[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(numbers[i][j] + " ");
      }
      System.out.println();
    }
  }
}
