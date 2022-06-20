class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 2) {
            return strs[0];
        } else {
            String tmp = strs[0];
            for (String string : strs) {
                for (int i = 0; i < strs.length; i++) {
                    
                }
            }
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] arr = {"dog","racecar","car"};
        System.out.println("ANS:" + solution.longestCommonPrefix(arr));
        String[] arr2 = {"flower","flow","flight"};
        System.out.println("ANS:" + solution.longestCommonPrefix(arr2));
        String[] arr3 = {"a"};
        System.out.println("ANS:" + solution.longestCommonPrefix(arr3));
        String[] arr4 = {"a", "ab"};
        System.out.println("ANS:" + solution.longestCommonPrefix(arr4));
        String[] arr5 = {""};
        System.out.println("ANS:" + solution.longestCommonPrefix(arr5));
        String[] arr6 = null;
        System.out.println("ANS:" + solution.longestCommonPrefix(arr6));
    }
}