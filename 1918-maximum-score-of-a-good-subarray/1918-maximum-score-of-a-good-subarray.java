public class Solution {
    public int maximumScore(int[] nums, int k) {
        int mini = nums[k];
        int ans = mini;

        int i = k;
        int j = k;

        while (i > 0 || j < nums.length - 1) {
            if (i == 0 || (j + 1 < nums.length && nums[i - 1] <= nums[j + 1])) {
                j++;
                mini = Math.min(mini, nums[j]);
                ans = Math.max(ans, mini * (j - i + 1));
            } else {
                i--;
                mini = Math.min(mini, nums[i]);
                ans = Math.max(ans, mini * (j - i + 1));
            }
        }

        return ans;
    }
}
