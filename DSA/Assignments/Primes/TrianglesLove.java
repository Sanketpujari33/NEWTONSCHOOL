package DSA.Assignments.Primes;

import java.util.*; // contains Collections framework

//Triangles love
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Sara loves triangles. Whenever she sees three points she connects them by straight lines to form a triangle. In triangles, her favorite one is a right-angled triangle. If the triangle is not right-angled but it can be converted into one by moving one of the points exactly by distance 1 so, that all the coordinates remain integer, she calls such triangles "Special".
//        Given three points A, B, and C your task is to check if the formed triangle is "Right", "Special" or "Simple".
//        Input
//        The first line of input contains the position of A(Ax, Ay). The second line of input contains the position of B(Bx, By). The third line of input contains the position of C(Cx, Cy).
//
//        Constraints:-
//        |X|, |Y| <= 10^9
//        Output
//        Print "Right" if the triangle is right- angled, print "Special" if the triangle can be formed into a right- angled by moving one of the points exactly by distance 1, else print "Simple".
//        Example
//        Sample Input:-
//        0 0
//        2 0
//        0 1
//
//        Sample Output:-
//        Right
//
//        Sample Input:-
//        -1 0
//        2 0
//        0 1
//
//        Sample Output:-
//        Special
//
//        Sample Input:-
//        -1 0
//        2 0
//        10 10

// don't change the name of this class
// you can add inner classes if needed
public class TrianglesLove {

  // Storing all the possible
  // changes to make the triangle
  // right-angled
  static int dx[] = { -1, 0, 1, 0 };
  static int dy[] = { 0, 1, 0, -1 };

  // Function to check if the triangle
  // is right-angled or not
  static boolean ifRight(int x1, int y1, int x2, int y2, int x3, int y3) {
    int a = ((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2));

    int b = ((x1 - x3) * (x1 - x3)) + ((y1 - y3) * (y1 - y3));

    int c = ((x2 - x3) * (x2 - x3)) + ((y2 - y3) * (y2 - y3));

    if (
      (a == (b + c) && a != 0 && b != 0 && c != 0) ||
      (b == (a + c) && a != 0 && b != 0 && c != 0) ||
      (c == (a + b) && a != 0 && b != 0 && c != 0)
    ) {
      return true;
    }
    return false;
  }

  // Function to check if the triangle
  // can be transformed to right-angled
  static void isValidCombination(
    int x1,
    int y1,
    int x2,
    int y2,
    int x3,
    int y3
  ) {
    int x, y;

    // Boolean variable to
    // return true or false
    boolean possible = false;

    // If it is already right-angled
    if (ifRight(x1, y1, x2, y2, x3, y3)) {
      System.out.print("Right");
      return;
    } else {
      // Applying the changes on the
      // co-ordinates
      for (int i = 0; i < 4; i++) {
        // Applying on the first
        // co-ordinate
        x = dx[i] + x1;
        y = dy[i] + y1;

        if (ifRight(x, y, x2, y2, x3, y3)) {
          System.out.print("Special");
          return;
        }

        // Applying on the second
        // co-ordinate
        x = dx[i] + x2;
        y = dy[i] + y2;

        if (ifRight(x1, y1, x, y, x3, y3)) {
          System.out.print("Special");
          return;
        }

        // Applying on the third
        // co-ordinate
        x = dx[i] + x3;
        y = dy[i] + y3;

        if (ifRight(x1, y1, x2, y2, x, y)) {
          System.out.print("Special");
          return;
        }
      }
    }

    // If can't be transformed
    if (!possible) System.out.println("Simple");
  }

  // Driver Code tried by Rajesh Choudhary
  public static void main(String[] args) {
    Scanner ram = new Scanner(System.in);
    int x1 = ram.nextInt();
    int y1 = ram.nextInt();
    int x2 = ram.nextInt();
    int y2 = ram.nextInt();
    int x3 = ram.nextInt();
    int y3 = ram.nextInt();

    // int x1 = -49, y1 = 0;
    // int x2 = 0, y2 = 50;
    // int x3 = 0, y3 = -50;

    isValidCombination(x1, y1, x2, y2, x3, y3);
  }
}
