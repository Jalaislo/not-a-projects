class Solution {
    public int lengthOfLastWord(String s) {
        char[] input = s.toCharArray();
        int result = 0;

        for (int i = input.length - 1; i >= 0; --i) {
            result += (input[i] != ' ') ? 1 : 0;
            if (result != 0 && input[i] == ' ') {
                break;
            }
        }

        return result;
    }
}