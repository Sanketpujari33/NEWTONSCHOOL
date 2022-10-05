package DSA.Playground.Hashing;

import java.util.HashMap;
import java.util.Set;

public class FreqOfChar {

  private static char maxCharInStr(String str) {
    HashMap<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < str.length(); i++) {
      char Ch = str.charAt(i);
      if (map.containsKey(Ch)) {
        int vel = map.get(Ch);
        map.put(Ch, vel + 1);
      } else {
        map.put(Ch, 1);
      }
    }
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
    String str = "uhigcfdshughu";
    System.out.println(maxCharInStr(str));
  }
}
