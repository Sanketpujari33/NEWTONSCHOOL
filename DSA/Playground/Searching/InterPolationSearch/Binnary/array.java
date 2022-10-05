package DSA.Playground.Searching.InterPolationSearch.Binnary;

//input array  3 1 2 1 1
public class array {

  public static void main(String[] args) {
    int arr[] = { 3, 1, 2, 1, 1 };
    int size = arr.length;
    int count = 0;
    for (int i = 0; i < size; i++) {
      if (arr[i] == 1) {
        System.out.print(i + " ");
        count++;
      }
    }
    System.out.println("\n" + count);
  }
}
