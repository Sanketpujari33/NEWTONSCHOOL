import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

public class LongestSubArraywithSumK {

    static long lenOfLongSubarr(int[] arr, int n, int k) {
        // HashMap to store (sum, index) tuples
        HashMap<Long, Integer> map = new HashMap<>();
        long sum = 0, maxLen = 0;

        // traverse the given array
        for (int i = 0; i < n; i++) {
            // accumulate sum
            sum += arr[i];

            // when subarray starts from index '0'
            if (sum == k)
                maxLen = i + 1;

            // make an entry for 'sum' if it is
            // not present in 'map'
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }

            // check if 'sum-k' is present in 'map'
            // or not
            if (map.containsKey(sum - k)) {
                // update maxLength
                if (maxLen < (i - map.get(sum - k)))
                    maxLen = i - map.get(sum - k);
            }
        }

        return maxLen;
    }

    // Driver code
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] a1 = new int[2];
        for (int t = 0; t < T; t++) {
            String[] intstring = br.readLine().split(" ");
            for (int i = 0; i < intstring.length; i++) {
                a1[i] = Integer.parseInt(intstring[i]);
            }
            int n = a1[0];
            int k = a1[1];

            int[] arr = new int[n];
            String[] integersInString = br.readLine().split(" ");

            for (int i = 0; i < integersInString.length; i++) {
                arr[i] = Integer.parseInt(integersInString[i]);
            }

            System.out.println(lenOfLongSubarr(arr, n, k));
        }
    }
}
// import java.io.*; // for handling input/output
// import java.util.*; // contains Collections framework
// // don't change the name of this class
// // you can add inner classes if needed
// class Main {
// public static int lenOfLongSubarr(int[] arr, int n, int k )
// {
// HashMap< , Integer> map = new HashMap<>();
// long sum = 0;
// int maxLen = 0;
// for(int i = 0; i < n; i++){
// sum += arr[i];
// if(sum == k){
// maxLen = i + 1;
// }
// if(!map.containsKey(sum)){
// map.put(sum, i);
// }
// if(map.containsKey(sum - k)){
// if(maxLen < (i - map.get(sum - k))){
// maxLen = i - map.get(sum - k);
// }
// }
// }
// return maxLen;
// }
// public static void main (String[] args) {
// // Your code here
// Scanner sc = new Scanner(System.in);
// int t = sc.nextInt();
// while (t > 0) {
// int n = sc.nextInt();
// int k = sc.nextInt();
// int[] arr = new int[n];
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }
// System.out.println(lenOfLongSubarr(arr, n, k));
// t--;
// }
// }
// }
