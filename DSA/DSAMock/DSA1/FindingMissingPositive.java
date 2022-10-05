package DSA.DSAMock.DSA1;

//Approach:
//The smallest positive integer is 1. First we will check if 1
// is present in the array or not. If it is not present then 1 is the answer.
// If present then, again traverse the array. The largest possible answer
// is N+1 where N is the size of array. This will happen when array have all
// the elements from 1 to N. When we are traversing the array, if we
// find any number less than 1 or greater than N, then we will change it to 1.
// This will not change anything as answer will always between 1 to N+1.
// Now our array has elements from 1 to N.
// Now, for every ith number, increase arr[ (arr[i]-1) ] by N.
// But this will increase the value more than N. So, we will access
//  the array by arr[(arr[i]-1)%N]. What we have done is for each
//  value we have increased value at that index by N.
//  We will find now which index has value less than N+1.
// Then i+1 will be our answer.
public class FindingMissingPositive {

  //    function for finding the first
  //     missing positive number.

  static int firstMissingPositive(int arr[], int n) {
    int ptr = 0;

    // Check if 1 is present in array or not
    for (int i = 0; i < n; i++) {
      if (arr[i] == 1) {
        ptr = 1;
        break;
      }
    }

    // If 1 is not present
    if (ptr == 0) return (1);

    // Changing values to 1
    for (int i = 0; i < n; i++) if (arr[i] <= 0 || arr[i] > n) arr[i] = 1;

    // Updating indices according to values
    for (int i = 0; i < n; i++) arr[(arr[i] - 1) % n] += n;

    // Finding which index has value less than n
    for (int i = 0; i < n; i++) if (arr[i] <= n) return (i + 1);

    // If array has values from 1 to n
    return (n + 1);
  }

  public static void main(String[] args) {
    int arr[] = { 2, 3, -7, 6, 8, 1, -10, 15 };
    int size = arr.length;
    int ans = firstMissingPositive(arr, size);
    System.out.println(ans);
  }
}
