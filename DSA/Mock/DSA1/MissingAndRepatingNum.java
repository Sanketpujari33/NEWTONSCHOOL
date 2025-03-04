package DSA.Mock.DSA1;

public class MissingAndRepatingNum {

  public static void findTwoElement(int arr[], int size) {
    int i;
    System.out.print("The repeating element is ");
    for (i = 0; i < size; i++) {
      int abs_val = Math.abs(arr[i]);
      if (arr[abs_val - 1] > 0) arr[abs_val - 1] =
        -arr[abs_val - 1]; else System.out.println(abs_val);
    }

    System.out.print("And the missing element is ");
    for (i = 0; i < size; i++) {
      if (arr[i] > 0) System.out.println(i + 1);
    }
  }

  public static void main(String[] args) {
    int arr[] = { 2, 2 };
    int size = arr.length;
    findTwoElement(arr, size);
  }
}
