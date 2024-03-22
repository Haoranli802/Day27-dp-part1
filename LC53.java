class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int cur = 0;
        for(int i : nums){
            cur += i;
            max = Math.max(max, cur);
            cur = Math.max(cur, 0);
        }
        return max;
    }
}

// O(N), O(1)
