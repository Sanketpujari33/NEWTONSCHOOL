package DSA.DSAMock.DSA1;

import java.util.Arrays;

public class addElementArray {

  public static void addElementAtIdx(int arr[], int size, int E, int idx) {
    int newArray[] = new int[size];
    int j = 0;
    for (int i = 0; i < size; i++) {
      if (arr[i] == idx) {
        continue;
      } else {
        newArray[i] = arr[j + 1];
        j++;
      }
    }
    //        newArray[size]=arr[size-1];
    System.out.println(Arrays.toString(newArray));
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 6, 7, 8, 9 };
    int size = arr.length;
    int idx = 4;
    int E = 5;
    addElementAtIdx(arr, size, E, idx);
  }
}
