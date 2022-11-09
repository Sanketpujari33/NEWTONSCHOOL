package DSA.Assignments.Primes;

import java.util.*; // contains Collections framework

//Too many rectangles? (Group Contest: April '21)
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Why Geometry?? ?
//
//        You are given 4*N+1 distinct points on the cartesian plane. Out of these points, 4*N points represent the end points of N rectangles (with axis parallel to co-ordinate axis), while one point does not belong to any of the rectangles. Report the coordinates of the point that does not belong to any of the N rectangles.
//        Input
//        The first line of the input contains an integer N.
//        The next 4*N+1 lines contain two integers X and Y, the coordinates of the given points.
//
//        Constraints
//        1 <= N <= 100000
//        0 <= X, Y <= 1000000
//        The given points always represent N rectangles and an extra point
//        Output
//        Output space separated X and Y coordinates of the extra point.
//        Example
//        Samle Input
//        1
//        1 3
//        1 1
//        3 1
//        1 4
//        3 3
//
//        Sample Output
//        1 4
//
//        Explanation: (1, 1), (1, 3), (3, 1), and (3, 3) represent the end of a rectangle, while (1, 4) is the extra point.
// don't change the name of this class
// you can add inner classes if needed
class Pair {

  int x, y;

  Pair(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

public class TooManyRectangles {

  public static void main(String[] args) {
    // Your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int c = 4 * n + 1;
    ArrayList<Pair> a = new ArrayList<>();
    while (c-- > 0) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      a.add(new Pair(x, y));
    }
    Map<Integer, Integer> map1 = new HashMap<>();
    Map<Integer, Integer> map2 = new HashMap<>();
    for (int i = 0; i < a.size(); i++) {
      Pair p = a.get(i);
      int A = p.x;
      int B = p.y;
      if (!map1.containsKey(A)) {
        map1.put(A, 1);
      } else map1.put(A, map1.get(A) + 1);
      if (!map2.containsKey(B)) {
        map2.put(B, 1);
      } else map2.put(B, map2.get(B) + 1);
    }
    int m1 = 0, n1 = 0;
    for (Map.Entry<Integer, Integer> me : map1.entrySet()) {
      if (me.getValue() % 2 != 0) {
        m1 = me.getKey();
        break;
      }
    }
    for (Map.Entry<Integer, Integer> me : map2.entrySet()) {
      if (me.getValue() % 2 != 0) {
        n1 = me.getKey();
        break;
      }
    }
    System.out.println(m1 + " " + n1);
  }
}
