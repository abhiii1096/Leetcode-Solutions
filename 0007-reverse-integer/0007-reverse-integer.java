class Solution 
{
  public int reverse(int x) 
  {
    int reversed = 0;

        for (; x != 0; x /= 10) 
        {
            int digit = x % 10;
            if (reversed > 0 && reversed > (Integer.MAX_VALUE - digit) / 10) {
                return 0;
            }
            if (reversed < 0 && reversed < (Integer.MIN_VALUE - digit) / 10) {
                return 0;
            }
            reversed = reversed * 10 + digit;
        }

        return reversed;
    }
}