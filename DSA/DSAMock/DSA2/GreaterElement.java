package DSA.DSAMock.DSA2;
import java.util.Stack;

//Given an array of Integer for each element int the array,find its next greater element in the array.
//The next greater element is the first element towards right,which is greater then the current element
//input arr={4,7,3,4,8,1};
//output arr={7,8,4,8,-1,-1};

public class GreaterElement {
        public static int[] greaterElement(int[]arr) {
            int result[] = new int[arr.length];
            Stack<Integer> stack = new Stack<>();
            for (int i = arr.length - 1; i >= 0; i--) {
                if (!stack.empty()) {
                while (!stack.empty() && stack.peek() <= arr[i]) {
                        stack.pop();
                    }
                }
                if (stack.empty()) {
                    result[i] = -1;
                } else {
                    result[i] = stack.peek();
                }
                stack.push(arr[i]);
            }
            return result;
        }
    public static void main(String[] args) {
            int arr[]={4,7,3,4,8,1};
            int result[]=greaterElement(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}