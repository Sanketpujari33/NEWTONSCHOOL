package DSA.Playground.Arrays.OneDArray;

public class negetivePostive {

  public static void negitive(int arr[], int size) {
    int Temp[] = new int[size];
    int j = 0;
    for (int i = 0; i < size; i++) if (arr[i] >= 0) Temp[j++] = arr[i];

    //  if(j==size||j==0)return;

    for (int i = 0; i < size; i++) if (arr[i] < 0) Temp[j++] = arr[i];

    for (int i = 0; i < size; i++) arr[i] = Temp[i];
  }

  public static void main(String[] args) {
    int arr[] = { 1, -1, -3, -2, 7, 5, 11, 6 };
    int size = arr.length;
    negitive(arr, size);
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
