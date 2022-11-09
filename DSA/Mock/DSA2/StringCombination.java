package DSA.Mock.DSA2;

import java.util.Scanner;

public class StringCombination {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Word");
    String str = sc.nextLine();
    int size = str.length();

    if (size != 4) {
      System.out.println("Invalid Input !");
      System.out.println("Plase Enter a Fore Letter word");
      return;
    }
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        for (int k = 0; k < size; k++) {
          for (int l = 0; l < size; l++) {
            if (i != j && i != k && i != l && j != k && i != l && k != l) {
              System.out.print(str.charAt(i));
              System.out.print(str.charAt(j));
              System.out.print(str.charAt(k));
              System.out.println(str.charAt(l));
            }
          }
        }
      }
    }
  }
}
