package DSA.DSAMock.DSA2;

 /*Generate Binary numbers from 1 to n using a Queue.
         Example –
         Input: n = 3
         Output: result = {“1”, “10”, “11”}
         Input: n = 5
         Output: result = {“1”, “10”, “11”, “100”, “101”}*/

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumber {
    public static String [] genersteBinary(int n){
        String [] result=new String[n];
        Queue<String>que=new LinkedList<>();
        que.offer("1");
        for (int i=0; i<n; i++){
            result[i]= que.poll();
            String n1=result[i]+ "0";
            String n2=result[i]+ "1";
            que.offer(n1);
            que.offer(n2);
        }
        return result;
    }
    public static void main(String[] args) {
        int N=5;
        String binaryStr[]=genersteBinary(N);
        for (int i = 0; i < binaryStr.length; i++) {
            System.out.print(binaryStr[i]+" ");
        }
    }
}
