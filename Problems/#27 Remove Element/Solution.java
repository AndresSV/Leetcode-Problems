class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length > 1) {
            int length = nums.length;
            for (int i = 0, j = 0; i < nums.length; i++) {
                if (nums[i] != val ) {
                    nums[j++]=nums[i];
                }
                else {
                    length--;
                }
            }
            return length;
        } else {
            if (nums.length == 0) {
                return nums.length;
            }
            else if (nums[0] != val) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}