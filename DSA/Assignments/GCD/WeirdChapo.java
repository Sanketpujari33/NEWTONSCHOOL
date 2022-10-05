package DSA.Assignments.GCD;

import java.util.*; // contains Collections framework

//Weird chapo! (Public Contest: Jan 2021)
//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Rick wants to give Morty a chapo (a super awesome treat :P).
//
//        The only condition for Morty to get a chapo is that he should be able to reach Rick's place. Both Rick and Morty live on the number line at integer points A and B respectively. There are N types of moves M1, M2,. , MN. Morty can only take steps of size Mi (1 <= i <= N) in either of the two directions on the number line (any number of times), while Rick prefers to stay at his place.
//
//        Please let Morty know if he can ever reach Rick's place and get a chapo.
//        Input
//        The first line of the input contains three integers N, A, and B denoting the total number of step sizes, the position of Rick, and the position of Morty.
//        The next line contains N integers Mi denoting the various step sizes that Morty can take.
//
//        Constraints
//        1 <= N <= 200000
//        1 <= Mi <= 109
//        -109 <= A, B <= 109
//        Output
//        Output Yes if Morty can reach Rick's place, else output No
//        Example
//        Sample Input
//        3 19 2
//        3 5 4
//
//        Sample Output
//        Yes
//
//        Explanation: Morty lives at position 2, while Rick lives at position 19. Morty can take the following path to reach Rick's place (there are several other ways as well):
//        Move M2 = 5 to the right.
//        Move M1 = 4 to the right.
//        Move M1 = 4 to the right.
//        Move M1 = 4 to the right.
//
//        Sample Input 2
//        4 10 15
//        10 20 30 40
//
//        Sample Output 2
//        N
// don't change the name of this class
// you can add inner classes if needed
public class WeirdChapo {

  public static int g(int a, int b) {
    if (b == 0) return a; else return g(b, a % b);
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int a = scan.nextInt();
    int b = scan.nextInt();
    int diff = Math.abs(a - b);
    int i;
    int[] A = new int[n];
    for (i = 0; i < n; ++i) A[i] = scan.nextInt();

    int gcd = A[0];
    for (i = 1; i < n; ++i) gcd = g(gcd, A[i]);

    String ans = "No";
    if (diff % gcd == 0) ans = "Yes";
    System.out.println(ans);
  }
}
