class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int s=0;
        for(int i=0;i<n;i++)
        {
            s=s+nums[i];
        }
        int as=(n*(n+1))/2;
        int missing=as-s;
        return missing;
    }
}