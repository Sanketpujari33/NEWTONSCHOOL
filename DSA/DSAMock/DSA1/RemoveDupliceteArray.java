package DSA.DSAMock.DSA1;

public class RemoveDupliceteArray {

  public static int removedublicate(int arr[], int size) {
    int j = 0;
    if (size == 0 || size == 1) {
      return size;
    }
    for (int i = 0; i < size - 1; i++) {
      if (arr[i] != arr[i + 1]) {
        arr[j++] = arr[i];
      }
    }
    arr[j++] = arr[size - 1];
    return j;
  }

  public static void main(String[] args) {
    int arr[] = {
      1,
      1,
      2,
      2,
      3,
      3,
      4,
      4,
      5,
      5,
      6,
      6,
      7,
      7,
      8,
      8,
      9,
      9,
      10,
      10,
    };
    int size = arr.length;
    int j = 0;
    j = removedublicate(arr, size);
    for (int i = 0; i < j; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
