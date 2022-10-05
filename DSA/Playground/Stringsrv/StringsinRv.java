package DSA.Playground.Stringsrv;

import java.util.Scanner;

public class StringsinRv {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Taking Input
    String name = sc.next();

    //        Declaration String
    String firstname = "Tony";
    String secondName = "stark";

    //        Cancatenation
    String fullName = firstname + " " + secondName;
    System.out.println(fullName);
    //
    //        Print length of string
    System.out.println(fullName.length());

    //        Access characters of a string
    for (int i = 0; i < fullName.length(); i++) {
      System.out.print(fullName.charAt(i));
    }

    //Compare 2 string

    String name1 = "Tony";
    String name2 = "Tony";

    if (name1.equals(name2)) {
      System.out.println("They are the some string");
    } else {
      System.out.println("They are the different String");
    }

    //Do not use = to check for string aquslity
    //GIven correct ansewer hear
    if (name1 == name2) {
      System.out.println("They are the some string");
    } else {
      System.out.println("They are the different String");
    }

    //Given incrorrect answer here
    if (new String("Tony") == new String("Tony")) {
      System.out.println("They are the some string");
    } else {
      System.out.println("They are the different String");
    }

    //Substring
    //The substring of a string is a subpart of it.

    String names = "TonyStark";
    System.out.println(names.substring(0, 4));

    //ParsaInt Method of String class

    int number = 123;
    String str = Integer.toString(number);
    System.out.println(str);

    //Take an array of Strings input from the user & find
    //        the cumulative (combined) length of all those strings.

    int size = sc.nextInt();
    String arr[] = new String[size];
    int toLength = 0;
    for (int i = 0; i < size; i++) {
      arr[i] = sc.next();
      toLength += arr[i].length();
    }
    System.out.println(toLength);

    //        Input a string from the user. Create a new string called ‘result’ in
    //        which you will replace the letter ‘e’ in the original string with letter ‘i’.
    //        Example :
    //        original = “eabcdef’ ; result = “iabcdif”
    //        Original = “xyz” ; result = “xyz”

    String st = sc.next();
    String result = "";

    for (int i = 0; i < st.length(); i++) {
      if (st.charAt(i) == 'e') {
        result += 'i';
      } else {
        result += st.charAt(i);
      }
    }
    System.out.println(result);

    //        Input an email from the user. You have to create a username
    //        from the email by deleting the part that comes
    //    after ‘@’. Display that username to the user.
    //        Example :
    //        email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
    //        email = “helloWorld123@gmail.com”; username = “helloWorld123”

    String Gmail = sc.next();
    String UserName = "";

    for (int i = 0; i < Gmail.length(); i++) {
      if (Gmail.charAt(i) == '@') {
        break;
      } else {
        UserName += Gmail.charAt(i);
      }
    }
    System.out.println(UserName);
  }
}
