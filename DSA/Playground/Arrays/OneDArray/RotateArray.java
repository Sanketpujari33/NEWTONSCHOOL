package DSA.Playground.Arrays.OneDArray;

public class RotateArray {

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };
    int size = arr.length;
    int k = 66;
    int newArr[] = new int[size];
    for (int i = 0; i < size; i++) {
      newArr[(i + k + size) % size] = arr[i];
    }
    for (int i = 0; i < size; i++) {
      System.out.print(newArr[i] + " ");
    }
  }
}
