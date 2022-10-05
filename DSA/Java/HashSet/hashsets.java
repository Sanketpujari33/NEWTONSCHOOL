package DSA.Java.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class hashsets {

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 1, 2, 3, 4, 5, 7, 4, 6, 4 };
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      set.add(arr[i]);
    }
    Iterator it = set.iterator();
    while (it.hasNext()) {
      System.out.print(it.next() + " ");
    }
  }
}
