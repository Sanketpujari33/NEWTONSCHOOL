package DSA.Assignments.Sorting;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Whostolethedragons {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();                  // Your code here
        int strength[]=new int[N];
        for(int i=0;i<N;i++){
            strength[i]=sc.nextInt();
        }
        ArrayList<Integer> l=new ArrayList<Integer>();
        Arrays.sort(strength);
        for(int i=0;i<N;i++){
            l.add(strength[i]+strength[N-1-i]);
        }
        System.out.println(Collections.max(l)-Collections.min(l));
        }
    }