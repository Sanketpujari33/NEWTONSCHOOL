package DSA.Mock.DSA1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class KthLargestElement {

  public static void main(String[] args) {
    int[] arr = { 3, 2, 1, 5, 6, 4 };
    int n = arr.length;
    int k = 2;

    Set<Integer> s = new HashSet<Integer>();
    for (int i = 0; i < n; i++) s.add(arr[i]);

    Iterator<Integer> itr = s.iterator();
    while (k >= -1) {
      itr.next();
      k--;
    } //itr points to the kth element in the set
    System.out.println(itr.next());
  }
}
