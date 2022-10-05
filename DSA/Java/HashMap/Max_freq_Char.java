package DSA.Java.HashMap;

import java.util.HashMap;
import java.util.Set;

public class Max_freq_Char {

  private static char maxfreqChar(String str) {
    HashMap<Character, Integer> map = new HashMap<>();

    //strore the frequncy of the Character int the string
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (map.containsKey(i)) {
        int val = map.get(ch);
        map.put(ch, val + 1);
      } else {
        map.put(ch, 1);
      }
    }
    // The keySet basically given you all the keys present hashmap and store it in a set
    Set<Character> set = map.keySet();
    int maxFreq = Integer.MIN_VALUE;
    char maxChar = ' ';
    for (char key : set) {
      if (map.get(key) > maxFreq) {
        maxFreq = map.get(key);
        maxChar = key;
      }
    }
    return maxChar;
  }

  public static void main(String[] args) {
    String str = "bhdkogkndhdfjvhfbfjhf";
    System.out.print(maxfreqChar(str));
  }
}
