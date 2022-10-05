package DSA.DSAMock.DSA1;

//Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the
// sum of elements at higher indexes. For example, in an array A:
//
//        Example :
//        Input: A[] = {-7, 1, 5, 2, -4, 3, 0}
//        Output: 3
//        3 is an equilibrium index, because:
//        A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
//
//        Input: A[] = {1, 2, 3}
//        Output: -1
//        Time Complexity: O(n)
//
//        Auxiliary Space: O(1)
public class EquilibriumIndexOfAnArray {

  public static int equilibriumIndexOfAnArray(int arr[], int size) {
    int sum = 0; // initialize sum of whole array
    int leftsum = 0; // initialize leftsum
    /* Find sum of the whole array */
    for (int i = 0; i < size; ++i) sum += arr[i];

    for (int i = 0; i < size; ++i) {
      sum -= arr[i]; // sum is now right sum for index i

      if (leftsum == sum) return i;

      leftsum += arr[i];
    }

    /* If no equilibrium index found, then return 0 */
    return -1;
  }

  public static void main(String[] args) {
    int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
    int size = arr.length;
    System.out.println(
      "First equilibrium index is " + equilibriumIndexOfAnArray(arr, size)
    );
  }
}
