class Solution {
    public boolean isValid(String s) {
        Stack<Character> stck=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                stck.push(ch);
            }
            else{
                if(stck.empty()){
                    return false;
                }
                char top=stck.peek();
                if(ch==')' && top=='('){
                    stck.pop();
                }
                else if(ch=='}' && top=='{'){
                    stck.pop();
                }
                else if(ch==']' && top=='['){
                    stck.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stck.size()==0;
    }
}