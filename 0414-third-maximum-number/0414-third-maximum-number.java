class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int[] a = new int[3];
        
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (count == 3) {
                break;
            }
            
            if (i == n - 1 || nums[i] != nums[i + 1]) {
                a[count] = nums[i];
                count++;
            }
        }
        
        if (count < 3) {
            return a[0];
        } else {
            return a[2];
        }
    }
}
