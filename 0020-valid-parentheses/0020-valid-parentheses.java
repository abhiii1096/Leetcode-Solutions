import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] a = s.toCharArray();
        int n = a.length;
        
        for (int i = 0; i < n; i++) {
            char cur = a[i];
            
            if (cur == '{' || cur == '(' || cur == '[') {
                stack.push(cur);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char pop = stack.pop(); 
                if (cur == '}' && pop != '{') {
                    return false;
                } else if (cur == ')' && pop != '(') {
                    return false;
                } else if (cur == ']' && pop != '[') {
                    return false;
                }
            }
        }
        
        
        return stack.isEmpty();
    }
}
