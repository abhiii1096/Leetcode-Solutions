class Solution {
    public int addDigits(int num) {
        int s=0;
        while(num>0)
        {
            int r =num%10;
            s=s+r;
            num = num/10;

        }
        while(s>9)
        {
            s = s-9;
        }
        return s;

        
    }
}