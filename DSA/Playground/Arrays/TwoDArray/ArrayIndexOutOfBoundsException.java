package DSA.Playground.Arrays.TwoDArray;

public class ArrayIndexOutOfBoundsException {

  public static void main(String[] args) {
    int[] arr = new int[2];
    arr[0] = 10;
    arr[1] = 20;

    for (int i = 0; i <= arr.length; i++) System.out.println(arr[i]);
  }
}
