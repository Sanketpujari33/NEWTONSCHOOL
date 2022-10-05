package DSA.Java.DSA.Arrays.Easy;

//Given an integer array nums, find the contiguous subarray (containing at least one number)
//        which has the largest sum and return its sum.
//        A subarray is a contiguous part of an array.
//
//         Example 1:
//        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//        Output: 6
//        Explanation: [4,-1,2,1] has the largest sum = 6.

//        Example 2:
//        Input: nums = [1]
//        Output: 1

//        Example 3:
//        Input: nums = [5,4,-1,7,8]
//        Output: 23
//

public class MaximumSubarray {

  static int maxSubarray(int arr[]) {
    int ans = Integer.MIN_VALUE;
    int currSum = 0;
    for (int i : arr) {
      currSum += i;
      ans = Math.max(currSum, ans);
      if (currSum < 0) {
        currSum = 0;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    int result = maxSubarray(arr);
    System.out.print(result);
  }
  //    public static void main (String[] args) {
  //        Scanner sc = new Scanner(System.in);
  //        int n = sc.nextInt();
  //        int m = sc.nextInt();
  //        int[][] mat = new int[n][m];
  //        for(int i=0; i<n ; i++){
  //            for(int j=0; j<m;j++){
  //                mat[i][j] = sc.nextInt();
  //            }
  //        }
  //        long q = sc.nextLong();
  //        while(q>0){
  //            q--;
  //            int a = sc.nextInt();
  //            int b = sc.nextInt();
  //            int c = sc.nextInt();
  //            int d = sc.nextInt();
  //            int sum=0;
  //            for(int i=a-1; i<=c-1 ; i++){
  //                for(int j=b-1; j<=d-1;j++){
  //                    sum += mat[i][j];
  //                }
  //            }
  //
  //            System.out.println(sum);
  //    }
  //}
}
