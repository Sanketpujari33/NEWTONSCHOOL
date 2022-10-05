package DSA.Java.StringBuilder;

//Print Length of String

public class PrintLength {

  public static void main(String args[]) {
    StringBuilder sb = new StringBuilder("Tony");
    sb.append(" Stark");
    System.out.println(sb);

    System.out.println(sb.length());
  }
}
