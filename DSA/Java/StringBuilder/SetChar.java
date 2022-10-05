package DSA.Java.StringBuilder;

//Set a Character at Index

public class SetChar {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Tony");
    //Get Char
    sb.setCharAt(0, 'P');
    System.out.println(sb);
  }
}
