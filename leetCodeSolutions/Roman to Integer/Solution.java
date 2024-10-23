import java.util.*;

class Solution {
    public int romanToInt(String s) {
        char[] input = s.toCharArray();
        int result = 0;

        Map<Character, Integer> romanToDecimal = new HashMap<Character, Integer>();
        romanToDecimal.put('I', 1);
        romanToDecimal.put('V', 5);
        romanToDecimal.put('X', 10);
        romanToDecimal.put('L', 50);
        romanToDecimal.put('C', 100);
        romanToDecimal.put('D', 500);
        romanToDecimal.put('M', 1000);

        for (int i = 0; i < input.length; ++i) {
            if (i == input.length - 1) {
                result += romanToDecimal.get(input[i]);
            } else if (romanToDecimal.get(input[i + 1]) > romanToDecimal.get(input[i])) {
                if (input[i] == 'I' && input[i + 1] == 'V') {
                    result += 4;
                    ++i;
                } else if (input[i] == 'I' && input[i + 1] == 'X') {
                    result += 9;
                    ++i;
                } else if (input[i] == 'X' && input[i + 1] == 'L') {
                    result += 40;
                    ++i;
                } else if (input[i] == 'X' && input[i + 1] == 'C') {
                    result += 90;
                    ++i;
                } else if (input[i] == 'C' && input[i + 1] == 'D') {
                    result += 400;
                    ++i;
                } else if (input[i] == 'C' && input[i + 1] == 'M') {
                    result += 900;
                    ++i;
                }
            } else {
                result += romanToDecimal.get(input[i]);
            }
        }

        return result;
    }

	public static void main(String [] args){
		String s = "III";
        Solution sol = new Solution();

        System.out.println(sol.romanToInt(s));
	}
}