class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        String openBrackets = "{([";
        for(int i=0; i<s.length(); i++){
            Character temp = s.charAt(i);
            if(openBrackets.indexOf(temp)> -1){
                stack.add(temp);
            }else{
                /* handles all cases for close brackets }]) */
                if(stack.isEmpty()){
                    return false;
                }else if(helper(stack.peek())!=temp){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }
        return stack.empty() ? true : false;
    }

    private Character helper(Character left){
        // methode returns what closing bracket should be on comparison with right bracket 
        if(left == '('){
            return ')';
        }else if(left == '{'){
            return '}';
        }else{
            return ']';
        }
    }
}