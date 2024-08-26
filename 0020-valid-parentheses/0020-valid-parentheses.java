import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c=='('||c=='{'||c=='[') stack.push(c);

            else if(c==')'||c=='}'||c==']')
            {
                if(stack.isEmpty()) return false;
                char popped = stack.pop();
                if(c=='}' && popped!='{' || c==')' && popped!='(' || c==']' && popped!='[') return false;
            }
        }

        if(stack.isEmpty()) return true;

        return false; 
    }
}