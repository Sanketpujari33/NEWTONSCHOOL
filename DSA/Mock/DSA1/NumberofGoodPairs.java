package DSA.Mock.DSA1;

//Given an array of integers nums, return the number of good pairs.
//        A pair (i, j) is called good if nums[i] == nums[j] and i < j.

//        Example 1:
//        Input: nums = [1,2,3,1,1,3]
//        Output: 4
//        Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
//        Example 2:

//        Input: nums = [1,1,1,1]
//        Output: 6
//        Explanation: Each pair in the array are good.
//        Example 3:
//
//        Input: nums = [1,2,3]
//        Output: 0

public class NumberofGoodPairs {

  public static int goodPair(int nums[]) {
    int pair = 0;
    int freq[] = new int[101];
    for (int i = 0; i < nums.length; i++) {
      freq[nums[i]]++;
    }
    for (int j = 0; j < freq.length; j++) {
      pair += (freq[j] * (freq[j] - 1)) / 2;
    }
    return pair;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 1, 1, 3 };
    int result = goodPair(arr);
    System.out.print(result);
  }
}
