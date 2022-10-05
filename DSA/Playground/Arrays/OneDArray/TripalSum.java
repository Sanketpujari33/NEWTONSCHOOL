package DSA.Playground.Arrays.OneDArray;

public class TripalSum {

  public static void main(String[] args) {
    int[] arr = new int[] { 1, 5, 3, 4, 8, 9 };
    int target = 21;

    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        for (int t = j; t < arr.length; t++) {
          if (arr[i] + arr[j] + arr[t] == target) {
            System.out.println(i + " " + j + " " + t);
            return;
          }
        }
      }
    }
  }
}
//    changes is sout(arr[i]+"  ");
//
//    O(n log (n))
//
//    Nishant singh
//
//    solution 1:arr= {1,2,3,33,44,55,3,2} ---> unique
//            sum = 6
//for(i=0 i < arr.length; i++){
//        HashSet<Intger> set = new HashSet<Intger>();
//        int current_sum =  sum - arr[i]; 6-1 =5
//
//        for( int j= i+1; j< arr.length; j++){
//
//            if ( newarray.contains( current_sum - arr[j]){
//                arr[i] ,arr[j] , currentsum-arr[j]
//            }    return;
//
//            set.add(arr[j])
//
//        }
//    }
//}
