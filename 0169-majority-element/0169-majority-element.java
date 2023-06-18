class Solution {
    public int majorityElement(int[] nums) {
        int c=1;
        int e=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==e)
            {
                c++;

            }
            else
            {
                c--;
            }
            if(c==0)
            {
                e=nums[i];
                c=1;
            }

        }
        return e;
    }
}