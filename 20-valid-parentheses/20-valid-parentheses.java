class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<Character>();
        if(n==1) return false;
        stack.push(s.charAt(0));
        for(int i=1;i<n;i++){
            if(!stack.empty()){
                if((stack.peek()=='(' && s.charAt(i)==')') || (stack.peek()=='{' && s.charAt(i)=='}') || (stack.peek()=='[' && s.charAt(i)==']')) stack.pop();
            else stack.push(s.charAt(i));
            }else stack.push(s.charAt(i));

        }
        if(stack.empty()) return true;
        return false;
    }
}