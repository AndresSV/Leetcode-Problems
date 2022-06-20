class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int pos1 = 0, 
            pos2 = 0,
            sum;
            for(int i = 0; i < nums.length; i++) {
                for(int j = i+1; j < nums.length; j++) {
                    sum = nums[i] + nums[j];
                    if (target == sum) {
                        pos1 = i;
                        pos2 = j;
                        
                    }
                }
            }
        return new int[] {pos1, pos2};
    }
}