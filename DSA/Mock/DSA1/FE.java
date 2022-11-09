package DSA.Mock.DSA1;

//How to find the frequency of elements in an array
//Write a code to print the frequency of each element in a array in O(n) time complexity and in same order.
//        Example - arr = {2,9,7,2,9,2}.
//        Output -
//        2->3
//        9->2
//        7->1
public class FE {

  public static void frequencyOfElements(int arr[]) {
    int newArrr[] = new int[arr.length];
    int vist = -1;
    for (int i = 0; i < arr.length; i++) {
      int count = 0;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          count++;
          newArrr[j] = vist;
        }
      }
      if (newArrr[i] != vist) {
        newArrr[i] = count;
      }
    }
    for (int i = 0; i < newArrr.length; i++) {
      if (newArrr[i] != vist) {
        System.out.println(arr[i] + " : " + newArrr[i]);
      }
    }
  }

  public static void main(String[] args) {
    int arr[] = { 5, 3, 6, 1, 2, 9, 4, 3, 1, 2, 4, 7, 8, 2, 3, 5 };
    frequencyOfElements(arr);
  }
}
