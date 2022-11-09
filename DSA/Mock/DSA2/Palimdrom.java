package DSA.Mock.DSA2;

public class Palimdrom {

  public static boolean isPalimdrome(String str) {
    str = str.toLowerCase();
    if (str.isEmpty()) {
      return true;
    }
    int head = 0;
    int tail = str.length() - 1;
    char chead, ctail;
    while (head <= tail) {
      chead = str.charAt(head);
      ctail = str.charAt(tail);
      if (!Character.isLetterOrDigit(chead)) {
        head++;
      } else {
        if (!Character.isLetterOrDigit(ctail)) {
          tail--;
        } else if (
          Character.toLowerCase(chead) != Character.toLowerCase(ctail)
        ) {
          return false;
        }
        head++;
        tail--;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String str = "NKKNAS";
    if (isPalimdrome(str)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
