package DSA.Assignments.16_Sorting;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class ImplementingBubbleSort {
    public static void printArr(int[]arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void insertionSort(int arr[], int size){
		for(int i=1; i<size; i++){
			int current=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>current){
			arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        printArr(arr);
    }
public static void  bubbleSort(int arr[], int size){
	for(int i=0; i<size-1; i++){
		for(int j=0; j<size-i-1; j++){
			if(arr[j]>arr[j+1]){
				int Temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=Temp;
			}
		}
	}
	printArr(arr);
}
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		// bubbleSort(arr, n);
		insertionSort(arr, n);
		}
	}
}