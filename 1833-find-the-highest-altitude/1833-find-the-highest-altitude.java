class Solution {
    public int largestAltitude(int[] gain) {
        int max=0,temp=0;
        for(int i=0;i<gain.length;i++){
            temp+=gain[i];
            max=Math.max(max,temp);
        }
        return max;
    }
}