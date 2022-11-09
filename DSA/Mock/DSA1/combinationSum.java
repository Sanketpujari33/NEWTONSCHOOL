package DSA.Mock.DSA1;

import java.util.ArrayList;
import java.util.List;

public class combinationSum {
    public static  List<List<Integer>> combi(int condidates[], int target){
        List<List<Integer>> comb=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        genreteComb(0, condidates, current, comb, target);
        return comb;
    }
    static void genreteComb(int start, int []arr, List<Integer> current,List <List<Integer>> comb, int target){
        if(target==0){
            comb.add(new ArrayList<>());
        }if(target<0){
            return;
        }
        for (int i = start; i < arr.length; i++) {
            current.add(arr[i]);
            genreteComb(i, arr, current, comb, target-arr[i]);
            current.remove(current.size()-1);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,6,7};
        int targete=7;
        // List<List<Integer>> result=;
        System.out.println(combi(arr, targete));
        
    }
}
//tc -O(k*2^n)
//sc -O(k*2^n)