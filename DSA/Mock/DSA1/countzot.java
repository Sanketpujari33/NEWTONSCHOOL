package DSA.DSAMock.DSA1;

//        Sort an array of 0s, 1s and 2s
//        1.Given an array A[] consisting 0s, 1s and 2s. The task is to write a function that sorts
//        the given array. The functions should put all 0s first, then all 1s and all 2s in last.

//        Examples:
//        Input: {0, 1, 2, 0, 1, 2}
//        Output: {0, 0, 1, 1, 2, 2}

//        Examples:
//        Input: {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
//        Output: {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}

//        Approach:The problem is similar to our old post Segregate 0s and 1s in an array,
//        and both of these problems are variation of famous Dutch national flag problem.
//        The problem was posed with three colours, here `0′, `1′ and `2′.

//        The array is divided into four sections:
//        a[1..Lo-1] zeroes (red)
//        a[Lo..Mid-1] ones (white)
//        a[Mid..Hi] unknown
//        a[Hi+1..N] twos (blue)
//        If the ith element is 0 then swap the element to the low range,
//        thus shrinking the unknown range.
//        Similarly, if the element is 1 then keep it as it is but shrink the unknown range.
//        If the element is 2 then swap it with an element in high range.
//        2. Given an integer array of 0s, 1s and 2s, sort the array without using count,
//        hash maps, extra space and time complexity should be O(n)

public class countzot {

  // second aproched using switch case condintion
  public static void sort(int arr[]) {
    int low = 0;
    int mid = 0;
    int high = arr.length - 1;
    while (mid <= high) {
      switch (arr[mid]) {
        case 0:
          {
            swop(arr, mid, low);
            mid++;
            low++;
            break;
          }
        case 1:
          mid++;
          break;
        case 2:
          {
            swop(arr, mid, high);
            high--;
            break;
          }
      }
    }
  }

  //1st approche using if else condition
  public static void sort012(int arr[]) {
    int i = 0;
    int j = 0;
    int k = arr.length - 1;
    while (i <= k) {
      if (arr[i] == 0) {
        swop(arr, i, j);
        i++;
        j++;
      } else if (arr[i] == 1) {
        i++;
      } else if (arr[i] == 2) {
        swop(arr, i, k);
        k--;
      }
    }
  }

  public static void swop(int arr[], int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 0, 1, 2, 0, 1, 0, 2, 0, 1, 2, 0, 2, 1, 2, 1, 0 };
    int size = arr.length;
    sort(arr);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
