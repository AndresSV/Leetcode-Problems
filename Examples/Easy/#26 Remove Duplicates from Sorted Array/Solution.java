class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length > 1) {
            int i      = 0, 
                j      = 1,
                length = 1;
            while(i < nums.length && j < nums.length) {
                if (nums[i]==nums[j]) {
                    j++;
                }
                else{
                    nums[++i]=nums[j];
                    length++;
                }
            }
            return length;
        } else {
            return nums.length;
        }
    }
}