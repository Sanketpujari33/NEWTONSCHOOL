package DSA.Mock.DSA1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Reversearrayingroups {

  void reverse(ArrayList<Integer> arr, int n, int left, int right) {
    //reversing the sub-array from left index to right index.
    while (left < right) {
      //swapping values at index stored at left and right index.
      int temp = arr.get(left);
      arr.set(left, arr.get(right));
      arr.set(right, temp);

      //updating values of left and right index.
      left += 1;
      right -= 1;
    }
  }

  //Function to reverse every sub-array group of size k.
  public void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
    for (int i = 0; i < n; i += k) {
      //If (ith index +k) is less than total number of elements it means
      //k elements exist from current index so we reverse k elements
      //starting from current index.
      if (i + k < n) {
        //reverse function called to reverse any part of the array.
        reverse(arr, n, i, i + k - 1);
      }
      //Else k elements from current index doesn't exist.
      //In that case we just reverse the remaining elements.
      else {
        //reverse function called to reverse any part of the array.
        reverse(arr, n, i, n - 1);
      }
    }
  }

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt((br.readLine().trim())); //Inputting the testcase
    //while testecase exist
    while (t-- > 0) {
      String inputLine1[] = br.readLine().trim().split(" ");
      int n = Integer.parseInt(inputLine1[0]);
      int k = Integer.parseInt(inputLine1[0]);

      ArrayList<Integer> arr = new ArrayList<>();
      String inputLine2[] = br.readLine().trim().split("");
      for (int i = 0; i < n; i++) {
        arr.add(Integer.parseInt(inputLine2[i]));
      }
      Reversearrayingroups obj = new Reversearrayingroups();
      obj.reverseInGroups(arr, n, k);
      StringBuffer str = new StringBuffer();
      for (int i = 0; i < n; i++) {
        str.append(arr.get(i) + " ");
      }
      System.out.println(str);
    }
  }
}
