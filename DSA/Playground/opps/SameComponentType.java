package DSA.Playground.opps;

public class SameComponentType {

  public static void main(String[] args) {
    int R = 0;
    // array of Integer
    int[] intArry = new int[R];

    // array of Byte
    byte[] bytesArry = new byte[R];

    // array of Short
    short[] shortsArry = new short[R];

    // array of Strings
    String[] stringsArry = new String[R];
    //        class [I
    //        class java.lang.Object
    //        class [B
    //        class [S
    //        class [Ljava.lang.String
    System.out.println(intArry.getClass());
    System.out.println(intArry.getClass().getSuperclass());
    System.out.println(bytesArry.getClass());
    System.out.println(shortsArry.getClass());
    System.out.println(stringsArry.getClass());
  }
}
