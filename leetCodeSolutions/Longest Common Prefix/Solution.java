class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        
        for (int i = 0; i < strs.length; ++i) {
            char[] temp = strs[i].toCharArray();

            for (char j : temp) {
                if (strs[i].startsWith(result + j) && strs[strs.length - 1].startsWith(result + j)) {
                    result += j;
                } else {
                    break;
                }
            }
        }

        for (String k : strs) {
            if (!k.startsWith(result)) {
                char[] temp = k.toCharArray();
                result = "";

                for (char n : temp) {
                    if (strs[strs.length - 1].startsWith(result + n)) {
                        result += n;
                    } else {
                        break;
                    }
                }
            }
        }

        return result;
    }

	public static void main(String [] args){
		String[] strs = {"flower","flow","flight"};
        Solution sol = new Solution();

        System.out.println(sol.longestCommonPrefix(strs));
	}
}