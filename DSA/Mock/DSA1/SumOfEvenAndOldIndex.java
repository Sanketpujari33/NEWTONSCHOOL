package DSA.Mock.DSA1;

public class SumOfEvenAndOldIndex {

  public static void sumOfEvenOdd(int arr[], int size) {
    int mOddIndexSum = 0, mEvenIndexSum = 0;
    // int oddtotal = 0;
    for (int i = 0; i < size; i++) {
      if (i % 2 == 0) {
        mEvenIndexSum += arr[i];
      } else {
        mOddIndexSum += arr[i];
      }
    }
    System.out.print("Odd:- " + mOddIndexSum + " " + "Even:- " + mEvenIndexSum);
  }

  public static void mOddEvenIndex(int array[]) {
    int mOddIndexSum = 0, mEvenIndexSum = 0;
    int oddtotal = 0;
    // int size = array.length;
    // int[] oddarry = new int[size];
    for (int i = 0; i < array.length; i++) {
      if (i % 2 == 0) {
        mEvenIndexSum = mEvenIndexSum + array[i];
        System.out.println("Even: " + mEvenIndexSum + " Index : " + i);
      }/*from ww w.  j  av  a 2  s  .c  o m*/
      if (i % 2 != 0) {
        mOddIndexSum = mOddIndexSum + array[i];
        System.out.println("ODD: " + mOddIndexSum + " Index : " + i);
      }
    }
    System.out.println("Total ODD: " + mOddIndexSum);
    System.out.println("Total Even: " + mEvenIndexSum);
    if (mEvenIndexSum > mOddIndexSum) {
      int eventotal = mEvenIndexSum - mOddIndexSum;
      System.out.println("Total Greter Even: " + eventotal);
    }

    if (mOddIndexSum > mEvenIndexSum) {
      oddtotal = mOddIndexSum - mEvenIndexSum;
      System.out.println("Total Greter Odd: " + oddtotal);
    }
  }

  public static void main(String[] args) {
    int arr[] = { 2, 6, 8, 9, 8, 5, 7, 4, 5, 98, 4, 2, 3, 4, 2, 1 };
    int size = arr.length;
    sumOfEvenOdd(arr, size);
    //        mOddEvenIndex(arr);
  }
}
