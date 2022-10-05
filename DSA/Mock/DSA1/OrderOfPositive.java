package DSA.DSAMock.DSA1;

//Given an unsorted array of both positive and negative integer. The task is to place
//all neative element at the end of array without changing the order of positive element and negative elements.
// (Input = {1, -1, 3, 2, -7, -5, 11, 6};
// Output = {1 3 2 11 6  -1 -7 -5})
public class OrderOfPositive {

  public static void segmenteElement(int arr[], int size) {
    int Tem[] = new int[size];
    int j = 0;
    for (int i = 0; i < size; i++) if (arr[i] >= 0) Tem[j++] = arr[i];
    if (j == size || j == 0) return;
    for (int i = 0; i < size; i++) if (arr[i] <= 0) Tem[j++] = arr[i];
    for (int i = 0; i < size; i++) arr[i] = Tem[i];
  }

  public static void main(String[] args) {
    int arr[] = { 1, -1, 3, 2, -7, -5, 11, 6 };
    int size = arr.length;
    segmenteElement(arr, size);
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
