class Solution {
    public boolean isPalindrome(int x) {
        char[] input = Integer.toString(x).toCharArray();
        char[] tupni = Integer.toString(x).toCharArray();

        for (int i = 0; i < tupni.length / 2 ; ++i) {
            char tmp = tupni[i];
            tupni[i] = tupni[tupni.length - 1 - i];
            tupni[tupni.length - 1 - i] = tmp;
        }

        for (int i = 0; i < tupni.length; ++i) {
            if (tupni[i] != input [i]) {
                return false;
            }
        }

        return true;
    }
	
	public static void main(String [] args){
		int x = 121;
        Solution sol = new Solution();

        System.out.println(sol.isPalindrome(x));
	}
}