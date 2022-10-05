package DSA.DSAMock.DSA1;

public class AddElement {

  public static int[] addx(int arr[], int n, int x) { //O(1)
    int i;
    int newArr[] = new int[n + 1];
    for (i = 0; i < n; i++) {
      newArr[i] = arr[i];
      newArr[n] = x;
    }
    return newArr;
  }

  public static int contains(int arr[], int size, int x) {
    for (int i = 0; i < size; i++) {
      if (arr[i] == x) {
        return i;
      }
    }
    return -1;
  }

  public static int[] removeElement(int arr[], int size, int x) { //O(n)
    int newArr[] = new int[size - 1];
    for (int i = 0, k = 0; i < size; i++) {
      if (arr[i] != x) {
        newArr[k] = arr[i];
        k++;
      }
    }
    return newArr;
  }

  public static void main(String[] args) {}
}
