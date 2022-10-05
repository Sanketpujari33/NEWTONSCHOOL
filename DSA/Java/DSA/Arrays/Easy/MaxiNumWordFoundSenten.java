package DSA.Java.DSA.Arrays.Easy;

//A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
//You are given an array of strings sentences, where each sentences[i] represents a single sentence.
//Return the maximum number of words that appear in a single sentence.

public class MaxiNumWordFoundSenten {

  public int mostWordsFound(String[] sentences) {
    int max = 0;
    int size = sentences.length;
    for (int i = 0; i < size; i++) {
      max = Math.max(max, sentences[i].split(" ").length);
    }
    return max;
  }

  public static void main(String[] args) {
    String sentences[] = {
      "alice and bob love leetcode",
      "i think so too",
      "this is great thanks very much",
    };
    MaxiNumWordFoundSenten Max = new MaxiNumWordFoundSenten();
    System.out.print(Max.mostWordsFound(sentences));
  }
}
