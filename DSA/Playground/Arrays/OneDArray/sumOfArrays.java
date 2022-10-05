package DSA.Playground.Arrays.OneDArray;

// Q. print the sum of all the +ve integers from an array
// A={12,34,-20,44,-10,56,-2,86,12}.
//12 34 -20 44 -10 56 -2 86 12
//-20 -10 -2
//-32
//12 34 44 56 86 12
//244
//212
// a=[-2, -3, 4, -1, -2, 1, 5, 3}
//4 1 5 3
//13
//-2 -3 -1 -2
//-8
//10

public class sumOfArrays {

  public static void positveElement(int arr[], int size) {
    for (int i = 0; i < size; i++) {
      if (arr[i] > 0) {
        System.out.print(arr[i] + " ");
      }
    }
    System.out.println();
  }

  public static void sumOfPositiveElement(int arr[], int size) {
    int positivesum = 0;
    for (int i = 0; i < size; i++) {
      if (arr[i] > 0) {
        positivesum += arr[i];
      }
    }
    System.out.print(positivesum);
    System.out.println();
  }

  public static void nigetiveElement(int arr[], int size) {
    for (int i = 0; i < size; i++) {
      if (arr[i] < 0) {
        System.out.print(arr[i] + " ");
      }
    }
    System.out.println();
  }

  public static void sumOfNigetiveElement(int arr[], int size) {
    int Negetivesum = 0;
    for (int i = 0; i < size; i++) {
      if (arr[i] < 0) {
        Negetivesum += arr[i];
      }
    }
    System.out.print(Negetivesum);
    System.out.println();
  }

  public static void subarraysum(int arr[], int size) {
    int max_sum = 0;
    int maximum_ending = 0;
    for (int i = 0; i < size; i++) {
      maximum_ending = maximum_ending + arr[i];
      if (max_sum < maximum_ending) {
        max_sum = maximum_ending;
      }
      if (maximum_ending < 0) {
        maximum_ending = 0;
      }
    }
    System.out.print(max_sum);
  }

  public static void main(String[] args) {
    int arr[] = { 12, 34, -20, 44, -10, 56, -2, 86, 12 };
    //        int arr[]={-2, -3, 4, -1, -2, 1, 5, 3};
    int size = arr.length;
    positveElement(arr, size);
    sumOfPositiveElement(arr, size);
    nigetiveElement(arr, size);
    sumOfNigetiveElement(arr, size);
    subarraysum(arr, size);
  }
}
