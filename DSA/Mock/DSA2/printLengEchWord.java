package DSA.Mock.DSA2;

import java.util.ArrayList;

public class printLengEchWord {

  public static ArrayList<Integer> getWordLengths(String s) {
    String str = " " + s + " ";
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ') {
        for (int j = i + 1; j < str.length(); j++) {
          if (str.charAt(j) == ' ') {
            list.add(j - i - 1);
            j = str.length();
          }
        }
      }
    }
    return list;
  }

  public static void contWord(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ' ') {
        System.out.println(count);
        count = 0;
      } else {
        count++;
      }
    }
    System.out.println(count);
  }

  public static void main(String[] args) {}
}
