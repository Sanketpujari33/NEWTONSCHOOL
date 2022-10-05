package DSA.Java.DSA1;

public class FindAMissingNum {

  public static int findMissing(int arr[]) {
    int size = arr.length + 1;
    int sum = size * (size + 1) / 2;
    for (int i : arr) {
      sum -= i;
    }
    return sum;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 4, 1, 8, 6, 3, 7 };
    System.out.print(findMissing(arr));
  }
}
