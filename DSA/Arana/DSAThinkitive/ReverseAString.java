package DSA.Arana.DSAThinkitive;

//1. Objects of String are immutable.
//        2. String class in Java does not have reverse() method, however StringBuilder class has built in reverse() method.
//        3. StringBuilder class do not have toCharArray() method, while String class does have toCharArray() method.
public class ReverseAString {

  public static void main(String[] args) {
    String str = "Geeks", nstr = "";
    char ch;
    System.out.print("Original word: ");
    System.out.println("Geeks"); //Example word
    for (int i = 0; i < str.length(); i++) {
      ch = str.charAt(i); //extracts each character
      nstr = ch + nstr; //adds each character in front of the existing string
    }
    System.out.println("Reversed word: " + nstr);

    ///////////////////////////////////////////////
    String input = "GeeksforGeeks";
    byte[] strAsByteArray = input.getBytes();
    byte[] result = new byte[strAsByteArray.length];
    for (int i = 0; i < strAsByteArray.length; i++) result[i] =
      strAsByteArray[strAsByteArray.length - i - 1];
    System.out.println(new String(result));
  }
}
