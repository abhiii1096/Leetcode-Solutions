class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
        {
            return false;
        }
        String t=s+s;
        if(t.indexOf(goal) !=-1)
        {
            return true;
        }
        else
        return false;
    }
}