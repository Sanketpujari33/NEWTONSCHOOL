package DSA.Mock.DSA1;

public class FindProduct {

  public static int[] findProduct(int arr[]) {
    int temp = 1;
    int result[] = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      result[i] = temp;
      temp *= arr[i];
    }
    temp = 1;
    for (int i = arr.length - 1; i >= 0; i--) {
      result[i] *= temp;
      temp *= arr[i];
    }
    return result;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
    int result[] = findProducts(arr);
    for (int i : result) {
      System.out.print(i + " ");
    }
  }

  public static int[] findProducts(int arr[]) {
    int temp = 1;
    int result[] = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      result[i] = temp;
      temp *= arr[i];
    }
    temp = 1;
    for (int i = arr.length - 1; i >= 0; i--) {
      result[i] *= temp;
      temp *= arr[i];
    }
    return result;
  }
}
