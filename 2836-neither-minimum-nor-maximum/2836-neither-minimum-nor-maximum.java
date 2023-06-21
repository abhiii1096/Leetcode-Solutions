class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int a = nums[0];
        int b = nums[n - 1];
        
        if (a == b) {
            return -1;
        }
        
        for (int i = 0; i < n; i++) {
            if (nums[i] != a && nums[i] != b) {
                return nums[i];
            }
        }
        
        return -1;
    }
}

