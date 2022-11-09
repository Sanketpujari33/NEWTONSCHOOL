import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class IncreasingFrequencySort {
    public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        // count frequency of each number
        Arrays.stream(nums).forEach(n -> map.put(n, map.getOrDefault(n, 0) + 1));
        // custom sort
        return Arrays.stream(nums).boxed()
                .sorted((a, b) -> map.get(a) != map.get(b) ? map.get(a) - map.get(b) : b - a)
                .mapToInt(n -> n)
                .toArray();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int A[] = frequencySort(nums);
        for (int j = 0; j < A.length; j++) {
            System.out.print(A[j] + " ");
        }
    }
}