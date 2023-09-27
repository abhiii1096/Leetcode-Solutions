class Solution {
    public String decodeAtIndex(String s, int k) {
        long decodedLength = 0;
        
    
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (Character.isDigit(currentChar)) {
                int digit = currentChar - '0';
                decodedLength *= digit;
            } else {
                decodedLength++;
            }
        }
        
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            k %= decodedLength;
            
            if (k == 0 && Character.isAlphabetic(currentChar)) {
                return String.valueOf(currentChar);
            }
            
            if (Character.isDigit(currentChar)) {
                int digit = currentChar - '0';
                decodedLength /= digit;
            } else {
                decodedLength--;
            }
        }
        
        return null;
    }
}
