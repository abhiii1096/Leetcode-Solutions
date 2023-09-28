class Solution {
    public int largestPalindrome(int n) {
        if (n == 1) {
            return 9;
        }
        
        int upperLimit = (int) Math.pow(10, n) - 1;
        int lowerLimit = upperLimit / 10;
        long maxPalindrome = 0;

        for (int i = upperLimit; i > lowerLimit; i--) {
            long palindrome = buildPalindrome(i);
            for (long j = upperLimit; j * j >= palindrome; j--) {
                if (palindrome % j == 0) {
                    return (int) (palindrome % 1337);
                }
            }
        }

        return (int) (maxPalindrome % 1337);
    }

    private long buildPalindrome(int num) {
        StringBuilder sb = new StringBuilder(Long.toString(num));
        sb.reverse();
        return Long.parseLong(num + sb.toString());
    }
}
