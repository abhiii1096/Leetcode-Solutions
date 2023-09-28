class Solution {
    public int firstMissingPositive(int[] nums) {
         HashSet<Integer> set = new HashSet<>();
        
        
        for (int num : nums) {
            if (num > 0) {
                set.add(num);
            }
        }

        int p = 1;
        while (set.contains(p)) {
            p++;
        }
        
        return p;
    }
}