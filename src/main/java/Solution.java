import java.util.Stack;

class Solution {
    /*
    There aren't many sub-optimal solutions for this problem. You could optimize it a bit, but any solution using
    the principle of a "stack" will work well enough, even if a stack data structure is not utilized.

    Each time one of the opening parentheses is encountered, add it to the stack. Each time a closing one is
    encountered, make sure it matches the most recent opening and then remove it. If we ever end up with a mismatch,
    that means the parentheses are not valid.
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            switch(c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                    if(stack.isEmpty() || stack.peek() != '(') {
                        return false;
                    } else {
                        stack.pop();
                    }
                    break;
                case ']':
                    if(stack.isEmpty() || stack.peek() != '[') {
                        return false;
                    } else {
                        stack.pop();
                    }
                    break;
                case '}':
                    if(stack.isEmpty() || stack.peek() != '{') {
                        return false;
                    } else {
                        stack.pop();
                    }
                    break;
            }
        }

        return stack.isEmpty();

    }
}