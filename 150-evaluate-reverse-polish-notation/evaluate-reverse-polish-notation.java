class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();
        for(String str : tokens){
            if(str.equals("+")){
                int a = Integer.valueOf(st.pop());
                int b = Integer.valueOf(st.pop());
                int c = b + a;
                st.push(String.valueOf(c));
            }
            else if(str.equals("-")){
                int a = Integer.valueOf(st.pop());
                int b = Integer.valueOf(st.pop());
                int c = b - a;
                st.push(String.valueOf(c));
            }
            else if(str.equals("*")){
                int a = Integer.valueOf(st.pop());
                int b = Integer.valueOf(st.pop());
                int c = b * a;
                st.push(String.valueOf(c));
            }
            else if(str.equals("/")){
                int a = Integer.valueOf(st.pop());
                int b = Integer.valueOf(st.pop());
                int c = b / a;
                st.push(String.valueOf(c));
            }else{
                st.push(str);
            }
        }
        return Integer.valueOf(st.pop());
    }
}