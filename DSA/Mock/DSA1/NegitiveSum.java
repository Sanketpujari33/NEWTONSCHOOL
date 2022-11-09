package DSA.Mock.DSA1;

//.print the sum of all the +ve integers from an array A={12,34,-20,44,-10,56,-2,86,12}.
public class NegitiveSum {

  public static void main(String[] args) {
    int[] A = { 12, 34, -20, 44, -10, 56, -2, 86, 12 };
    int size = A.length;
    int sumPositive = 0;
    int sumNegetive = 0;
    int countPositive = 0;
    int countNegetive = 0;
    for (int i = 0; i < size; i++) {
      if (A[i] > 0) {
        countPositive++;
        sumPositive += A[i];
      }
      if (A[i] < 0) {
        countNegetive++;
        sumNegetive += A[i];
      }
    }
    System.out.println(sumPositive);
    //        System.out.println(sumNegetive);
    //        System.out.println("Positive element Present :- "+countPositive+"\n"+"Negetive element Present:-"+countNegetive);
  }
}
