package DSA.DSAMock.DSA;

//        Time Limit: 2 sec
//        Memory Limit: 128000 kB
//
//        Problem Statement
//        You are given an array of size n containing distinct integers, where n is odd. Find
//        the element which has the same number of lesser elements and the same number
//        of greater elements in the array.
//        Input
//        First line of the input contains an integer, N, which denotes the length of the array.
//        Next N inputs are elements of the array.
//        Constraints
//        1 <= N <= 20
//        -10000 <= Arr[i] <= 10000
//
//        Output
//        Single integer n which has the same number of lesser elements and the same
//        number of greater elements.
//
//        Example
//        Input:
//        3
//        3 1 2
//        Output:
//        2
//        Explanation:-
//        2 has one greater element 3 and one smaller element 1
//        Input:
//        5
//        2 3 4 9 1
//
//        Output:
//        3
public class MeInMIddle {

  public static int[] selectionSort(int arr[]) {
    int size = arr.length;
    for (int i = 0; i < size; i++) {
      int smallest = i;
      for (int j = i + 1; j < size; j++) {
        if (arr[smallest] > arr[j]) {
          smallest = j;
        }
      }
      int temp = arr[smallest];
      arr[smallest] = arr[i];
      arr[i] = temp;
    }
    return arr;
  }

  public static int binnarS(int Arr[], int low, int high) {
    selectionSort(Arr);
    while (high > low) {
      int mid = low + (high - low) / 2;
      return mid;
    }
    return 0;
  }

  public static void main(String[] args) {
    int Arr[] = { 2, 3, 4, 9, 1 };
    int size = Arr.length;
    selectionSort(Arr);
    int mid = binnarS(Arr, 0, size + 1);
    System.out.println(mid);
  }
}
