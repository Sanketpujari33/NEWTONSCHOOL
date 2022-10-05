package DSA.DSAMock.DSA2;
import java.util.Stack;
/* Given a string s, containing just the characters ‘(’, ‘)’, ‘[’, ‘]’, ‘{’ and ‘}’,
 determine if the input string is valid.
 An input string is valid if:
 Open brackets must be closed by same type of brackets.
 Open brackets must be closed in correct order.
 Example –
         Input: str = “{()}”  Output: true
         Input: str = “{]” Output: false
         Input: str = “{()” Output: false*/

public class Parenthesis {

 public static int isMaxLen(String str) {
    int size = str.length();
    Stack<Integer> stk = new Stack<>();
    stk.push(-1);
    int result = 0;
    for (int i = 0; i < size; i++) {
      if (str.charAt(i) == '(') stk.push(i); else {
        if (!stk.empty()) stk.pop();
        if (!stk.empty()) result =
          Math.max(result, i - stk.peek()); else stk.push(i);
      }
    }
    return result;
  }

public static boolean isVolid(String str){
  Stack<Character>stack=new Stack<>();
  for (char c: str.toCharArray()){
    if(c=='(' || c== '{' || c=='['){
      stack.push(c);
    }else{
      if (stack.empty()){
        return false;
      }else{
        char top=stack.peek();
        if((c==')'&& top=='(')|| (c=='}'&& top=='{')|| (c==']'&& top=='[')){
            stack.pop();
        }else {
            return false;
        }
      }
    }
  }
  return stack.empty();
}
  public static void main(String[] args) {
    String str = "((()()))";
    System.out.println(isMaxLen(str));
      System.out.println(isVolid(str));
  }
}
