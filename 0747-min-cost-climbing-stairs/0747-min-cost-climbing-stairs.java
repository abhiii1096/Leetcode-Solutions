class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int a[]= new int[n+1];
        for(int i=2;i<=n;i++)
        {
            a[i]=Math.min(a[i-1]+cost[i-1],a[i-2]+cost[i-2]);
        }
        return a[n];
    }
}