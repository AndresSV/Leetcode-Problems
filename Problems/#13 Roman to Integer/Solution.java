class Solution {
    public int romanToInt(String s) {
        int num = 0;
        for (int i = 0, j = i + 1; i < s.length(); i++, j++) {
            if ( j < s.length() && charToInt(s.charAt(i)) < charToInt(s.charAt(j)) ) {
                num += (charToInt(s.charAt(j)) - charToInt(s.charAt(i)));
                i++;
                j = i + 1;
            } else {
                num += charToInt(s.charAt(i));
            }
        }
        return num;
    }

    private int charToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}