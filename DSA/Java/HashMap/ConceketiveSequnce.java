package DSA.Java.HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class ConceketiveSequnce {

  public static ArrayList<Integer> LCS(int arr[]) {
    HashMap<Integer, Boolean> map = new HashMap<>();

    //Strong all the Start of the sequnce
    for (int i = 0; i < arr.length; i++) {
      //check if n-1 is present in the hashing
      //if it doese, the current element cantain be a start of the
      //hashing

      int nm1 = arr[i] - 1;
      if (map.containsKey(nm1)) {
        map.put(arr[i], false);
      } else {
        map.put(arr[i], true);
      }

      //if the current no is a start of a sequnce
      //than n+1 canot be a start of the sequnce
      int np1 = arr[i] + 1;
      if (map.containsKey(np1)) {
        map.put(arr[i], false);
      }
    }
    ArrayList<Integer> kesys = new ArrayList<>();
    int maxlength = Integer.MIN_VALUE;
    int maxStartLenghat = 0;
    for (int key : kesys) {
      int presenIndex = key;
      int count = 0;
      while (map.containsKey(presenIndex + count)) {
        count++;

        if (count > maxlength) {
          maxlength = count;
          maxStartLenghat = presenIndex;
        }
      }
    }
    ArrayList<Integer> mp = new ArrayList<>();
    for (int i = 0; i < maxlength; i++) {
      mp.add(maxStartLenghat + i);
    }
    return mp;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 5, 6, 4, 8, 0, 9, 3, 4, 3, 2, 7 };
  }
}
