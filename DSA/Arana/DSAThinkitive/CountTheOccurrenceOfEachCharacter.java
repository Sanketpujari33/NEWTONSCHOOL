package DSA.Arana.DSAThinkitive;

//Given a string, the task is to write a program in Java which prints
// the number of occurrences of each character in a string.

import java.util.HashMap;
import java.util.Map;

//Input: str = "GeeksForGeeks"
//        Output:
//        r 1
//        s 2
//        e 4
//        F 1
//        G 2
//        k 2
//        o 1
//
//        Input: str = "Ajit"
//        Output:
//        A 1
//        t 1
//        i 1
//        j 1
public class CountTheOccurrenceOfEachCharacter {

  static void characterCount(String inputString) {
    HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
    char[] strArray = inputString.toCharArray();
    for (char c : strArray) {
      if (charCountMap.containsKey(c)) {
        charCountMap.put(c, charCountMap.get(c) + 1);
      } else {
        charCountMap.put(c, 1);
      }
    }
    for (Map.Entry entry : charCountMap.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
  }

  public static void main(String[] args) {
    String str = "Ajit";
    characterCount(str);
  }
}
