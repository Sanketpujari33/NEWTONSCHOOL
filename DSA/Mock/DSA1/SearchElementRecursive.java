package DSA.Mock.DSA1;

public class SearchElementRecursive {

  static int arr[] = { 5, 61, 2, 35, 3, 5, 4, 64, 96, 25, 45 };

  public static int searchElement(int arr[], int l, int r, int x) {
    if (r < l) return -1;
    if (arr[l] == x) return l;
    if (arr[r] == x) return r;
    return searchElement(arr, l + 1, r - 1, x);
  }

  public static void main(String[] args) {
    int x = 35;
    int index = searchElement(arr, 0, arr.length - 1, x);
    if (index == -1) {
      System.out.println("Element Not Present");
    } else {
      System.out.println("Element present in:- " + index + " this index");
    }
  }
}
