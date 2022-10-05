package DSA.DSAMock.DSA1;

import java.util.Vector;

public class PasitiveNegativePair {

  public static void printPairs(int arr[], int size) {
    Vector<Integer> ve = new Vector<>();
    for (int i = 0; i < size; i++) for (int j = i + 1; j < size; j++) if (
      Math.abs(arr[i]) == Math.abs(arr[j])
    ) ve.add(Math.abs(arr[i]));
    if (ve.size() == 0) return;
    for (int i = 0; i < ve.size(); i++) {
      System.out.print(-ve.get(i) + " " + ve.get(i) + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = { 4, 8, 9, -4, 1, -1, -8, -9 };
    int size = arr.length;
    printPairs(arr, size);
  }
}
