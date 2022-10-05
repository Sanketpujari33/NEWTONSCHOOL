package DSA.DSAMock.DSA1;

import java.util.HashSet;
import java.util.Iterator;

public class hashsets {

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 1, 2, 3 };
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      set.add(arr[i]);
    }

    //        set.add(1);
    //        set.add(2);
    //        set.add(3);

    //        if(set.contains(1)){
    //            System.out.println("yes");
    //        }
    //        set.remove(1);
    //        if(!set.contains(1)){
    //            System.out.println("remove");
    //        }
    //        System.out.println(set.size());
    //        System.out.println(set);

    Iterator it = set.iterator();
    //hashNext,; Next it two method
    while (it.hasNext()) {
      System.out.print(it.next() + " ");
    }
  }
}
