package Mock.java;
import java.util.HashMap;

public class Solution {
    public static  int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int answer = 0;
        int length = s.length();
        HashMap<Character, Integer> seen = new HashMap<Character, Integer>();
        
        while (left < length && right < length) {
            char current = s.charAt(right);
            if (seen.containsKey(current)) {
                left = Math.max(left, seen.get(current) + 1);
            }
            seen.put(current, right);
            answer = Math.max(answer, right - left + 1);
            right ++;
        }
        return answer;
    }
    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.print(lengthOfLongestSubstring(s));
    }
}
