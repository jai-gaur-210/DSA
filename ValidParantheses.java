import java.util.Stack;

public class ValidParantheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            if(!st.isEmpty()){
                if(s.charAt(i)==')'){
                    if(st.peek() == '('){
                        st.pop();
                        continue;
                    }
                    else{
                        return false;
                    }
                }
                if(s.charAt(i)=='}'){
                    if(st.peek() == '{'){
                        st.pop();
                        continue;
                    }
                    else{
                        return false;
                    }
                }
                if(s.charAt(i)==']'){
                    if(st.peek() == '['){
                        st.pop();
                        continue;
                    }
                    else{
                        return false;
                    }
                }
            }else{
                return false;
            }
            
        }
        if(st.isEmpty()){
            return true;
        }else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        String s = "]";
        ValidParantheses a =new ValidParantheses();
        Boolean ans=a.isValid(s);
        System.out.println(ans);
    }
}
