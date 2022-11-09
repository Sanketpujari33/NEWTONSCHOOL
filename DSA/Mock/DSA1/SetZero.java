package DSA.Mock.DSA1;

//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
//
//        You must do it in place.
//
//        Input: matrix = [[1,1,1],
//                          [1,0,1],
//                           [1,1,1]]
//
//        Output: [[1,0,1],
//                  [0,0,0],
//                  [1,0,1]]

//1 1 1
//1 0 1
//1 1 1
public class SetZero {

  //    public void setZeroess(int[][] matrix) {
  //        int col0=1; int row=matrix.length; int cols=matrix[0].length;
  //        for(int i=0; i<row; i++){
  //            if(matrix[i][0]==0) cols=0;
  //            for(int j=1; j<cols; j++)
  //                if(matrix[i][j]==0)
  //                    matrix[i][0]=matrix[0][j]=0;
  //        }
  //        for(int i=row-1; i>=0; i--){
  //            for(int j=cols-1; j>=1; j--)
  //                if(matrix[i][0]==0 || matrix[0][j]==0)
  //                    matrix[i][j]=0;
  //            if(col0==0) matrix[i][0]=0;
  //        }
  //    }
  public void setZeroes(int[][] matrix) {
    Boolean isCol = false;
    int R = matrix.length;
    int C = matrix[0].length;
    for (int i = 0; i < R; i++) {
      if (matrix[i][0] == 0) {
        isCol = true;
      }
      for (int j = 1; j < C; j++) {
        if (matrix[i][j] == 0) {
          matrix[0][j] = 0;
          matrix[i][0] = 0;
        }
      }
    }
    for (int i = 1; i < R; i++) {
      for (int j = 1; j < C; j++) {
        if (matrix[i][0] == 0 || matrix[0][j] == 0) {
          matrix[i][j] = 0;
        }
      }
    }
    if (matrix[0][0] == 0) {
      for (int j = 0; j < C; j++) {
        matrix[0][j] = 0;
      }
    }

    if (isCol) {
      for (int i = 0; i < R; i++) {
        matrix[i][0] = 0;
      }
    }
  }

  public static void main(String[] args) {
    int matrix[][] = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
    int n = 3;
    int m = 3;
    SetZero set = new SetZero();
    set.setZeroes(matrix);

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void set(int matrix[][]) {}
}
