package DSA.Playground.Arrays.OneDArray;

public class DuplicEtelementFqe {

  public static void freqOfDuplicate(int arr[]) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) max = arr[i];
    }
    int newArr[] = new int[max + 1];
    for (int j = 0; j < arr.length; j++) {
      newArr[arr[j]]++;
    }
    for (int k = 0; k <= max; k++) {
      if (newArr[k] > 1) {
        System.out.println(k + " " + newArr[k]);
      }
    }
  }

  public static void main(String[] args) {
    int A[] = { 1, 6, 4, 6, 4, 8, 2, 4, 1, 1 };
    freqOfDuplicate(A);
  }
}
