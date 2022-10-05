package DSA.Assignments.Array.OneDAndTwoDArrays;

import java.util.*; // contains Collections framework

//Chess Board
//        hint
//        Hint
//
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Tom loves Chess boards. He admires its symmetry and how the black and white colours are placed adjacently along both the axis.
//
//        More formally, a chessboard like coloring implies that no two adjacent cells have the same color and all the cells are painted either white or black.
//
//        On his birthday, Tom has been gifted a board which is in the form of a N*N grid. Every cell is painted either black or white. Since Tom loves the placement of colours in a chessboard, he will try to convert the board that has been gifted to him, identical to a chessboard. He has both black and white colours available to him. Help him find out the minimum number of the cell he will have to recolour to paint his board similar to chessboard.
//        Input
//        First line contains an integer N, denoting the size of the board
//        Each of the next N lines contains N space separated integers and each integer being either '0' or '1'
//        '1' represent black cell
//        '0' represents white cell
//
//        Constraints
//        1 <= N <= 1000
//        Output
//        A single integer that is the minimum number of cells that Tom will have to re-color in his board to convert the given board to a chess board like coloring.
//        Example
//        Input:
//        3
//        1 1 1
//        1 1 1
//        1 1 1
//
//        Output:
//        4
//
//        Explanation:
//        Convert to
//        1 0 1
//        0 1 0
//        1 0 1
//        Thus we will have to colour 4 cells.
//
//        Input:
//        3
//        0 1 0
//        1 0 1
//        0 1 0
//
//        Output:
//        0
//        It already has a chess board like coloring.
// don't change the name of this class
// you can add inner classes if needed
public class ChessBoard {

  public static void main(String[] args) {
    // Your code here
    Scanner sc = new Scanner(System.in);
    int array_size = sc.nextInt();
    //int N[][] = new int[array_size][array_size];
    int k = 0;
    int count = 0;
    int count2 = 0;
    for (int i = 0; i < array_size; i++) {
      for (int j = 0; j < array_size; j++) {
        k = sc.nextInt();
        //N[i][j] = sc.nextInt();
        if ((i + j) % 2 == 0) {
          if (k == 0) {
            count++;
          }
        } else {
          if (k == 1) {
            count++;
          }
        }
        if ((i + j) % 2 == 0) {
          if (k == 1) {
            count2++;
          }
        } else {
          if (k == 0) {
            count2++;
          }
        }
      }
      if (i % 5 == 0) {
        System.gc();
      }
    }
    if (count < count2) System.out.println(count); else System.out.println(
      count2
    );

    sc.close();
  }
}
