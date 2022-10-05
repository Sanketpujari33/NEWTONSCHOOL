package DSA.Assignments.Array.OneDAndTwoDArrays;

import java.io.*; // for handling input/output

//Chessboard Formation
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        An N x N board contains only 0s and 1s. In each move, you can swap any 2 rows with each other, or any 2 columns with each other.
//
//        What is the minimum number of moves to transform the board into a "chessboard" - a board where no 0s and no 1s are 4-directionally adjacent? If the task is impossible, return -1.
//        Input
//        The input line contains T, denoting the number of test cases. Each test case contains two lines. First-line contains N, size of the matrix. Second-line contains N*N elements of binary matrix.
//
//        Constraints:
//        1 <= T <= 100
//        2 <= N <= 50
//        0 <= mat[i][j] <= 1
//        Output
//        For each testcase you need to print the minimum number of swaps required.
//        Example
//        Input:
//        2
//        4
//        0 1 1 0
//        0 1 1 0
//        1 0 0 1
//        1 0 0 1
//        3
//        0 1 0
//        1 0 1
//        1 1 0
//
//        Output:
//        2
//        -1
//
//        Explanation:
//        One potential sequence of moves is shown below, from left to right:
//
//        0110 1010 1010
//        0110 --> 1010 --> 0101
//        1001 0101 1010
//        1001 0101 0101
//
//        The first move swaps the first and second columns.
//        The second move swaps the second and third row.
// don't change the name of this class
// you can add inner classes if needed
public class ChessboardFormation {

  public static void main(String[] args) throws IOException {
    // Your code here
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(read.readLine());
    while (t-- > 0) {
      String str[] = read.readLine().trim().split(" ");
      int N = Integer.parseInt(str[0]);
      //int K = Integer.parseInt(str[1]);
      //`int D = Integer.parseInt(str[1]);
      int arr[][] = new int[N][N];
      for (int i = 0; i < N; i++) {
        str = read.readLine().trim().split(" ");
        for (int j = 0; j < N; j++) arr[i][j] = Integer.parseInt(str[j]);
      }
      //int res[] = moveZeroes(arr);
      //print(res);
      System.out.println(movesToChessboard(arr));
    }
  }

  static void print(int list[]) {
    for (int i = 0; i < list.length; i++) System.out.print(list[i] + " ");
  }

  public static int movesToChessboard(int[][] board) {
    if (board == null || board.length == 0 || board[0].length == 0) {
      return -1;
    }
    int N = board.length;
    for (int i = 0; i < N; ++i) {
      for (int j = 0; j < N; ++j) {
        if ((board[0][0] ^ board[i][0] ^ board[0][j] ^ board[i][j]) == 1) {
          return -1;
        }
      }
    }
    int rowSum = 0;
    int colSum = 0;
    int rowSwap = 0;
    int colSwap = 0;
    for (int i = 0; i < N; ++i) {
      rowSum += board[0][i];
      colSum += board[i][0];
      if (board[i][0] == i % 2) {
        ++rowSwap;
      }
      if (board[0][i] == i % 2) {
        ++colSwap;
      }
    }
    if (
      N / 2 > rowSum ||
      N / 2 > (N - rowSum) ||
      N / 2 > colSum ||
      N / 2 > (N - colSum)
    ) {
      return -1;
    }
    if (N % 2 == 0) {
      rowSwap = Math.min(rowSwap, N - rowSwap);
      colSwap = Math.min(colSwap, N - colSwap);
    } else {
      if (colSwap % 2 == 1) {
        colSwap = N - colSwap;
      }
      if (rowSwap % 2 == 1) {
        rowSwap = N - rowSwap;
      }
    }
    return (rowSwap + colSwap) / 2;
  }
}
