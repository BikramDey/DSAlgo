class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        int k = 0, c = 1;
        String result = "";
        for(int i = 1; i<n ; i++){
            char ch = s.charAt(i);
            if(ch == ')'){
                c--;
            }
            else
                c++;

            if(c == 0){
                result += s.substring(k+1, i);
                k = i + 1;
            }
        }
        
        return result;
    }
}