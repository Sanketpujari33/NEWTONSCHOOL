import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Pair {

  int x;
  int y;

  public Pair(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

class SortFreq implements Comparator<Pair> {

  public int compare(Pair p1, Pair p2) {
    if (p2.y == p1.y) {
      return p2.x - p1.x;
    }
    return p2.y - p1.y;
  }
}

public class GroupofNumbers {

  public static void main(String[] args) {
    // Your code here
    int n;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
    HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
    for (int i = 0; i < n; i++) {
      if (freq.containsKey(arr[i])) {
        freq.put(arr[i], freq.get(arr[i]) + 1);
      } else {
        freq.put(arr[i], +1);
      }
    }
    Pair[] freq_arr = new Pair[freq.size()];
    int i = 0;
    for (int key : freq.keySet()) {
      freq_arr[i++] = new Pair(key, freq.get(key));
    }
    Arrays.sort(freq_arr, new SortFreq());
    for (i = 0; i < freq_arr.length; i++) {
      System.out.print(freq_arr[i].x + " ");
    }
  }
}
