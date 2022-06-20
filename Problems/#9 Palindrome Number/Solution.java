class Solution {
    public boolean isPalindrome(int x) {
        String string = Integer.toString(x);
        char tmp1 = ' ';
        char tmp2 = ' ';
        for (int i = 0; i < string.length(); i++) {
            tmp1 = string.charAt(i);
            tmp2 = string.charAt(string.length() - i - 1);
            if (tmp1 != tmp2) {
                return false;
            }
        }
        return true;
    }
}