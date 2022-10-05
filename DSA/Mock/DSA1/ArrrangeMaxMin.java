package DSA.DSAMock.DSA1;

public class ArrrangeMaxMin {

  public static void arrangeMaxMin(int arr[]) {
    int maxid = arr.length - 1;
    int minIdx = 0;
    int max = arr[maxid] + 1;
    for (int i = 0; i < arr.length; i++) {
      if (i % 2 == 0) {
        arr[i] = arr[i] + (arr[maxid] % max) * max;
        maxid--;
      } else {
        arr[i] = arr[i] + (arr[minIdx] % max) * max;
        minIdx++;
      }
    }
    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i] / max;
    }
  }

  public static void main(String[] args) {
    int arr[] = { 2, 3, 5, 6, 8, 9 };
    rearenge(arr);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  public static void rearenge(int arr[]) {
    int maxidx = arr.length - 1;
    int minidx = 0;
    int max = arr[maxidx] + 1;
    for (int i = 0; i < arr.length; i++) {
      if (i % 2 == 0) {
        arr[i] += (arr[maxidx] % max) * max;
        maxidx--;
      } else {
        arr[i] += (arr[minidx] % max) * max;
        minidx++;
      }
    }
    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i] / max;
    }
  }
}
