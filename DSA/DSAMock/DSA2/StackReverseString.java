package DSA.DSAMock.DSA2;

import java.util.Stack;

public class StackReverseString {
    public static String reverseStrStack(String str){
        Stack<Character> Stack=new Stack<>();
        char[] Chars=str.toCharArray();
        for(char c: Chars){
            Stack.push(c);
        }
        for(int i=0; i<str.length(); i++){
            Chars[i]=Stack.pop();
        }
        return  new String(Chars);
    }
    public static void main(String[] args) {
        String str="Sanket";
        System.out.println( reverseStrStack(str));
    }
}
