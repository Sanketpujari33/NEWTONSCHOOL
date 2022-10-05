package DSA.DSAMock.DSA2;

public class IsPalindrome {

  public static boolean isPlalindrom(String str) {
    int start = 0;
    int end = str.length() - 1;
    while (start < end) {
      if (str.charAt(start) != str.charAt(end)) {
        return false;
      }
      start++;
      end--;
    }
    return true;
  }

  //    public static boolean isPalindrom(String str){
  //        char arr[]=str.toCharArray();
  //        int first=0;
  //        int last=arr.length-1;
  //        while (first<=last){
  //            if(arr[first]!=arr[last]){
  //                return false;
  //            }
  //            first++;
  //            last--;
  //        }
  //        return true;
  //    }
  public static void main(String[] args) {
    String str = "SANKEEKNA";
    if (isPlalindrom(str)) {
      System.out.print("YES");
    } else {
      System.out.print("NO");
    }
  }
}
