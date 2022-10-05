package DSA.DSAMock.DSA1;

//You are given an unsorted array with both positive and negative elements.
//        You have to find the smallest positive number missing from the array.
//        Input:  {2, 3, 7, 6, 8, -1, -10, 15}
//        Output: 1
//        Input:  { 2, 3, -7, 6, 8, 1, -10, 15 }
//        Output: 4
//        Input: {1, 1, 0, -1, -2}
//        Output: 2

public class Missing {

  public static void bbsort(int arr[], int size) {
    if (size == 1) {
      return;
    }
    for (int i = 0; i < size - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
      }
      bbsort(arr, size - 1);
    }
  }

  public static int Posimissing(int arr[], int size) {
    int Ans = 1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == Ans) Ans++;
    }
    return Ans;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 1, 0, -1, -2 };
    int size = arr.length;
    bbsort(arr, size);
    int result = Posimissing(arr, size);
    System.out.println(result);
  }
}
