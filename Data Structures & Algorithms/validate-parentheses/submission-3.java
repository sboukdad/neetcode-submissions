//import java.util.Stack

class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> openChar = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            char element = s.charAt(i);
            if(element == '(' || element == '{' || element == '[') {
                openChar.push(element);
            } else if (openChar.isEmpty()) {
                return false;
            } else if (element == ')' && openChar.peek() == '(') {
                openChar.pop();
            } else if (element == '}' && openChar.peek() == '{') {
                openChar.pop();
            } else if (element == ']' && openChar.peek() == '[') {
                openChar.pop();
            } else {
                return false;
            }
        }
        return openChar.isEmpty() ? true : false; 
    }
}
