package DSA.Java.StringBuilder;

//Insert a Character at Some Index

public class InsertChar {

  public static void main(String args[]) {
    StringBuilder sb = new StringBuilder("tony");
    //Insert char
    sb.insert(0, 'S');
    System.out.println(sb);
  }
}
