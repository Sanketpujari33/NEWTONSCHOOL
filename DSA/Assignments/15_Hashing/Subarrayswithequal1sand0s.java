import java.util.HashMap; 
import java.util.Map; 
import java.util.*;

public class Subarrayswithequal1sand0s {
    static long countSubarr(long[] arr, int n) { 
        Map<Long, Integer> myMap = new HashMap<>(); 
        long sum = 0; 
        long count = 0; 
        for (int i = 0; i < n; i++) { 
            if (arr[i] == 0) 
                arr[i] = -1; 
            sum += arr[i];  
            if (sum == 0) 
                count++; 
            if (myMap.containsKey(sum)) 
                count += myMap.get(sum); 
  
            if (!myMap.containsKey(sum)) 
                myMap.put(sum, 1); 
            else
                myMap.put(sum, myMap.get(sum) + 1); 
        } 
        return count; 
    }  
    public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
        long arr[] = new long[size];
       for(int i=0; i<size; i++){
		   arr[i]=sc.nextLong();
	   }
        System.out.println(countSubarr(arr, size)); 
  
    } 
  
}