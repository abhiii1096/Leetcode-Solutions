class Solution {
    public String convert(String s, int numRows) {
        
        if(numRows == 1){
            return s;
        }
        
        int interval = (numRows - 1) * 2;
        int interval2 = 0;
        int maxInterval = interval;
        
        int intervalToUse = interval;
        
        char[] res = new char[s.length()];
        int index = 0;
        
        
        for(int i = 0; i < numRows; i++){
            for(int j = i; j < s.length() && index < s.length(); j += intervalToUse){
                res[index] = s.charAt(j);
                index++;
                
                if(interval == maxInterval || interval2 == maxInterval){
                    intervalToUse = maxInterval;
                }
                else if(intervalToUse == interval){
                    intervalToUse = interval2;
                }
                else{
                    intervalToUse = interval;
                }
                
            }
            interval -= 2;
            interval2 += 2;
            intervalToUse = interval2;
        } 
        
        return String.valueOf(res);
    }
}