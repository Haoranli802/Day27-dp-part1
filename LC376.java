class Solution {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length == 1) return 1;
        int pre = nums[1] - nums[0];
        int count;
        if(pre != 0) count = 2;
        else count = 1;
        for(int i = 2; i < nums.length; i++){
            int cur = nums[i] - nums[i - 1];
            if((pre >= 0 && cur < 0) || (pre <= 0 && cur > 0)){
                count++;
                pre = cur;
            }
        }
        return count;
    }
}
//O(N), O(1)
