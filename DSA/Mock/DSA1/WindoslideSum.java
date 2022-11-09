package DSA.Mock.DSA1;

public class WindoslideSum {

  public static int sumofWind(int arr[], int size, int k) {
    int start = 0;
    int end = size - 1;
    int maxSum = 0;
    int windoSum = 0;
    while (end < k) {
      windoSum += arr[end++];
    }
    while (end < arr.length) {
      windoSum += arr[end++] - arr[start++];
      maxSum = Math.max(maxSum, windoSum);
    }
    return maxSum;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 5, 9, 6, 4, 2, 47, 3, 2, 4, 6, 12, 65, 2, 13 };
    int k = 4;
    int result = sumofWind(arr, arr.length, k);
    System.out.println(result);
  }
  //    import java.io.*; // for handling input/output
  //import java.util.*; // contains Collections framework
  //
  //    // don't change the name of this class
  //// you can add inner classes if needed
  //    class Main {
  //        private static int solve(Vector<Integer> v) {
  //            int n = v.size();
  //            if(n==0) {
  //                return 0;
  //            }
  //            int mx = v.get(0);
  //            for(int i=1;i<n;i++) {
  //                mx = Math.max(mx, v.get(i));
  //            }
  //            if(mx<=0) {
  //                return 0;
  //            }
  //            int mxSum=0,csum=0;
  //            for(int i=0;i<n;i++) {
  //                csum+=v.get(i);
  //                if(csum<0)
  //                    csum=0;
  //                mxSum = Math.max(csum, mxSum);
  //            }
  //            return mxSum;
  //        }
  //        public static void main (String[] args) {
  //            Scanner sc = new Scanner(System.in);
  //            int n = sc.nextInt();
  //            int price[] = new int[n];
  //            for(int i=0;i<n;i++) {
  //                price[i] = sc.nextInt();
  //            }
  //            Vector<Integer> diff = new Vector<>();
  //            for(int i=n-2;i>=0;i--) {
  //                diff.add(price[i+1]-price[i]);
  //            }
  //            int ans = solve(diff);
  //            if(ans<0) {
  //                System.out.println("NO");
  //            }else {
  //                System.out.println("YES");
  //            }
  //        }
}
