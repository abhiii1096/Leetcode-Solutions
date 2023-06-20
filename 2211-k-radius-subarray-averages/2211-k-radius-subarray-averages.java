class Solution 
{
    public int[] getAverages(int[] nums, int k) 
    {
        int l=nums.length;
        long sum[]=new long[l];
        sum[0]=nums[0];
        if(k==0)
        {
            return nums;
        }
        for(int i=1;i<l;i++)
        {
            sum[i]=sum[i-1]+nums[i];

        }
        int[] result= new int[l];
        Arrays.fill(result, -1);
        for (int i=k; i<l-k; i++)
        {
            long avg =(sum[i+k]-sum[i-k]+nums[i-k])/(k*2+1);
            result [i]= (int)avg;
        }
        return result;
}
}
