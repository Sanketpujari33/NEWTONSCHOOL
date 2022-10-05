package DSA.DSAMock.DSA2;

import java.util.Arrays;

public class Prefix {

  public String longestCommPrifix(String[] arr) {
    int size = arr.length;
    if (size == 0) return "";
    if (size == 1) return arr[0];
    Arrays.sort(arr);
    int end = Math.min(arr[0].length(), arr[size - 1].length());
    int i = 0;
    while (i < end && arr[0].charAt(i) == arr[size - 1].charAt(i)) i++;
    String pre = arr[0].substring(0, i);
    return pre;
  }

  public static void main(String[] args) {
    Prefix pre = new Prefix();
    String[] input = { "geeksforgeeks", "geeks", "geek", "geezer" };
    System.out.println(pre.longestCommPrifix(input));
  }
}
