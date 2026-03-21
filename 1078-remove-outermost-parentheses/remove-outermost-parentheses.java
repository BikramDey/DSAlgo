class Solution {
    public String removeOuterParentheses(String s) {
        if(s.length() == 0)
            return "";

        int l = s.length();
        int index = 0, c = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<l; i++){
            char ch = s.charAt(i);
            if(ch == '(')
                c++;
            if(ch == ')')
                c--;

            if(c==0){
                sb.append(s.substring(index+1, i));
                index = i+1;
            }
        }
        return sb.toString();
    }
}