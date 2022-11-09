package DSA.Mock.DSA1;

import java.util.ArrayList;

public class FirstAndLastOccurrencesOfX {

  public static int firs(ArrayList list, int x) {
    return list.indexOf(x);
  }

  public static int last(ArrayList list, int x) {
    return list.lastIndexOf(x);
  }

  public static void main(String[] args) {
    int arr[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125 };
    ArrayList<Integer> clite = new ArrayList<>();
    for (int i : arr) clite.add(i);
    int x = 5;
    System.out.println(firs(clite, x));
    System.out.println(last(clite, x));
    findfirstLasst(arr, 5);
  }

  public static void findfirstLasst(int arr[], int x) {
    int size = arr.length;
    int first = -1;
    int last = -1;
    for (int i = 0; i < size; i++) {
      if (x != arr[i]) continue;
      if (first == -1) {
        first = i;
      }
      last = i;
    }
    if (first != -1) {
      System.out.println(first);
      System.out.println(last);
    } else System.out.println("NOT FOUND");
  }
}
