package DSA.Contests.November2019;

import java.util.*; // contains Collections framework

//Two lines (Public Contest: November)
//        Time Limit: 1 sec
//        Memory Limit: 128000 kB
//        Problem Statement
//        Two lines of students are standing next to each other. One contains boys and the other contains girls. Now you have to select some boys(maybe zero) and some girls(maybe zero) and arrange them in such a way that their heights are in strictly increasing order. While arranging the selected students :
//        > No boy should stand behind a boy who was behind him earlier (here behind does not mean immediately behind)
//        > No Girl should stand behind a girl who was behind her earlier (here behind does not mean immediately behind)
//        You have to find the maximum number of students you can select.
//        Relative ordering of boys and girls should be same
//        Input
//        Input:
//        First-line contains two integers N (size of boys line) and M (size of girls line)
//        Second-line contains the heights of the boys in the order they are standing, N space-separated integers
//        Third-line contains the heights of the girls in the order they are standing, M space-separated integers
//
//        Constraints :
//        1 <= N <= 100
//        1 <= M <= 100
//        1<= Arr[i] <= 1000000000
//        Output
//        Output:
//        Print a single integer,the maximum number of students you can select.
//        Example
//        Sample Test Case 1
//
//        Input:
//        5 3
//        2 3 14 15 16
//        13 13 13
//
//        Output:
//        6
//
//        Explanation
//        Elements selected from array 1 : 2 3 14 15 16
//        Elements selected from array 2: 13
//        Final series: 2 3 13 14 15 16

// don't change the name of this class
// you can add inner classes if needed
public class TwoLines {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int b = sc.nextInt();
    int g = sc.nextInt();
    ArrayList<Long> result = new ArrayList<>();
    long maxb = 0, maxg = 0;
    long[] arrBoys = new long[b];
    for (int i = 0; i < b; i++) {
      arrBoys[i] = sc.nextLong();
      if (arrBoys[i] > maxb) {
        result.add(arrBoys[i]);
        maxb = arrBoys[i];
      }
    }
    long[] arrGirls = new long[g];
    for (int i = 0; i < g; i++) {
      arrGirls[i] = sc.nextLong();
      if (arrGirls[i] > maxg) {
        result.add(arrGirls[i]);
        maxg = arrGirls[i];
      }
    }
    System.out.println(result.size());
  }
}
