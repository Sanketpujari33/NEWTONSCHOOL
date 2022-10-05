package DSA.DSAMock.DSA1;

import java.util.HashSet;

//You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
// Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
//        Letters are case sensitive, so "a" is considered a different type of stone from "A".
//
//
//
//        Example 1:
//
//        Input: jewels = "aA", stones = "aAAbbbb"
//        Output: 3
//        Example 2:
//
//        Input: jewels = "z", stones = "ZZ"
//        Output: 0You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
//        Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
//
//        Letters are case sensitive, so "a" is considered a different type of stone from "A".
//
//
//
//        Example 1:
//
//        Input: jewels = "aA", stones = "aAAbbbb"
//        Output: 3
//        Example 2:
//
//        Input: jewels = "z", stones = "ZZ"
//        Output: 0You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
//
//        Letters are case sensitive, so "a" is considered a different type of stone from "A".
//
//
//
//        Example 1:
//
//        Input: jewels = "aA", stones = "aAAbbbb"
//        Output: 3
//        Example 2:
//
//        Input: jewels = "z", stones = "ZZ"
//        Output: 0
//var ventureCity = {
//        flat1: "bhagyashree",
//        flat2: "raunak",
//        flat3: "raj",
//        };
//        var centerCity = ventureCity;
//        centerCity.flat2 = "Gautam";
//
//        console.log(centerCity);
//        console.log(ventureCity);

public class JewelsAndStones {

  public static int StonesAndJewels(String jewels, String stones) {
    HashSet<Character> set = new HashSet<>();
    for (int i = 0; i < jewels.length(); i++) {
      set.add(jewels.charAt(i));
    }
    int count = 0;
    for (int j = 0; j < stones.length(); j++) {
      if (set.contains(stones.charAt(j))) {
        count++;
      }
    }
    return count;
  }

  public static int jewelsAndStones(String jewels, String stones) {
    int count = 0;
    for (int i = 0; i < jewels.length(); i++) {
      for (int j = 0; j < stones.length(); j++) {
        if (jewels.charAt(i) == (stones.charAt(j))) {
          count++;
        }
      }
    }
    return count;
  }

  public static void main(String[] args) {
    String jewelss = "aA";
    String stoness = "aAAbbbb";
    int R = StonesAndJewels(jewelss, stoness);
    System.out.println(R);
    String jewels = "z";
    String stones = "ZZ";
    int result = jewelsAndStones(jewels, stones);
    System.out.println(result);
  }
}
