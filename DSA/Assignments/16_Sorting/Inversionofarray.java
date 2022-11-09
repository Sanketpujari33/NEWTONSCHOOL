package DSA.Assignments.16_Sorting;
import java.io.*; // for hling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Inversionofarray {
    private static int marge(int[] arr, int l,int m, int r){

        int[] left = Arrays.copyOfRange(arr, l, m + 1);

        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

        int i = 0, j = 0, k = l,temp = 0;

        while (i < left.length && j < right.length) {

            if (left[i] <= right[j])

                arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
            temp += (m + 1) - (l + i);
            }
        }

        while (i < left.length)
            arr[k++] = left[i++];

        while (j < right.length)
            arr[k++] = right[j++];

        return temp;
    }
    private static long mergeCount(int[] arr, int l, int r) {
        long count=0;
        if (l < r) {
            int m = (l + r) / 2;
            
            count += mergeCount(arr, l, m);

            count += mergeCount(arr, m + 1, r);

            count += marge(arr, l, m, r);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
       int arr[]=new int[size];

       for(int i=0; i<size; i++)arr[i]=sc.nextInt();

        long result=mergeCount(arr,0,size-1);

        System.out.print(result);
    }
}