package DSA.Playground.Sorting.MargeSort;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class InversionArray {

  static void rearrange(int[] arr, int n, int x) {
    TreeMap<Integer, ArrayList<Integer>> m = new TreeMap<>();
    for (int i = 0; i < n; i++) {
      int diff = Math.abs(x - arr[i]);
      if (m.containsKey(diff)) {
        ArrayList<Integer> al = m.get(diff);
        al.add(arr[i]);
        m.put(diff, al);
      } else {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(arr[i]);
        m.put(diff, al);
      }
    }
    int index = 0;
    for (Map.Entry entry : m.entrySet()) {
      ArrayList<Integer> al = m.get(entry.getKey());
      for (int i = 0; i < al.size(); i++) arr[index++] = al.get(i);
    }
  }

  static void printArray(int[] arr, int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    long t = Integer.parseInt(sc.nextLine());
    while (t > 0) {
      int r, c;
      String arr1[] = sc.nextLine().split(" ");
      r = Integer.parseInt(arr1[0]);
      c = Integer.parseInt(arr1[1]);
      int arr[] = new int[r];
      for (int i = 0; i < r; i++) {
        arr[i] = sc.nextInt();
      }
      rearrange(arr, r, c);
      printArray(arr, r);
    }
    t--;
  }
}
