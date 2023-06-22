class Solution {
    public int trailingZeroes(int n) {
     int no = 0;
        while(n>0){
            no+=n/5;
            n=n/5;
        }
        return no;
    }
}