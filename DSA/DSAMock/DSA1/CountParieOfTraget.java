package DSA.DSAMock.DSA1;

import java.util.HashMap;

public class CountParieOfTraget {

  public static int frequnce(int arr[], int size, int k) {
    int count = 0; //cantain my Answer
    //Declear HasshMap <freq,element>
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < size; i++) {
      int ai = k - arr[i];
      int preFre = map.getOrDefault(ai, 0);
      count += preFre;
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }
    return count;
  }

  public static void count(int arr[], int size, int k) {
    int count = 0;
    for (int i = 1; i < size; i++) {
      for (int j = 0; j < i; j++) {
        if (arr[i] + arr[j] == k) {
          count++;
        }
      }
    }
    System.out.println(count);
  }

  public static void main(String[] args) {
    int arr[] = { 1, 5, 7, -1, 1 };
    int size = arr.length;
    int k = 6;
    count(arr, size, k);
    System.out.print(frequnce(arr, size, k));
  }
}
