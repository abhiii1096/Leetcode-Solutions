class Solution {
    public int longestValidParentheses(String s) {
        int i,m=0;
        Stack<Integer> stk = new Stack<Integer>();
         m=0;
        char c;
        stk.push(-1);
        int j=0;
        i=0;
        for(i=0 ;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            stk.push(i);
            else
            {
                stk.pop();
                if(stk.isEmpty())
                stk.push(i);
                m=Math.max(m,i-stk.peek());
            }

        }
        if(m<0)
            m=0;
        return m;
    }
}