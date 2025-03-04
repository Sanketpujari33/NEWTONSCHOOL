package DSA.Arana.PlacementSeries;

public class FindDuplicteNumber {

  public static int findDuplicte(int arr[]) {
    int slow = arr[0];
    int fast = arr[0];
    do {
      slow = arr[slow];
      fast = arr[arr[fast]];
    } while (slow != fast);
    fast = arr[0];
    while (slow != fast) {
      slow = arr[slow];
      fast = arr[fast];
    }
    return slow;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 5, 9, 6, 9, 3, 8, 9, 7, 1 };
    int s = findDuplicte(arr);
    System.out.print(s);
  }
}
