import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> inputStack = new Stack<>();
        char[] input = s.toCharArray();

        for (char i : input) {
            if (i == '(') {
                inputStack.push(')');
            } else if (i == '{') {
                inputStack.push('}');
            } else if (i == '[') {
                inputStack.push(']');
            } else if (inputStack.isEmpty() || inputStack.pop() != i) {
                return false;
            }
        }

        return inputStack.isEmpty();
    }

	public static void main(String [] args){
		String s = "()";
        Solution sol = new Solution();

        System.out.println(sol.isValid(s));
	}
}