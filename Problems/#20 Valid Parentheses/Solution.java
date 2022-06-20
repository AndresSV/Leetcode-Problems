import java.util.Stack;

public class Solution {
    private String closingChar(String s) {
        switch (s) {
            case "[":
                return "]";
            case "{":
                return "}";
            case "(":
                return ")";
            default:
                return "";
        }
    }
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < s.length(); i++) {
            if ( String.valueOf(s.charAt(i)).equals("(") || String.valueOf(s.charAt(i)).equals("[") || String.valueOf(s.charAt(i)).equals("{") ) {
                stack.push(closingChar(String.valueOf(s.charAt(i))));
            } else {
                if ( !stack.empty() && String.valueOf(s.charAt(i)).equals(stack.peek()) ) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}