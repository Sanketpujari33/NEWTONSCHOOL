package DSA.Mock.DSA1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapis {

  public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<>();
    map.put("India", 120);
    map.put("US", 30);
    map.put("China", 150);
    //        if(map.containsKey("China")){
    //            System.out.println("Ture");
    //        }else{
    //            System.out.println("False");
    //        }
    //        System.out.println(map.get("China"));
    //        System.out.println(map.get("Indionsia"));

    for (Map.Entry<String, Integer> e : map.entrySet()) {
      System.out.print("{" + e.getKey() + " ");
      System.out.print(e.getValue() + "}" + " ");
    }
    System.out.println();
    map.remove("China");
    Set<String> keys = map.keySet();
    for (String key : keys) {
      System.out.print(key + " " + map.get(key) + " ");
    }
  }
}
