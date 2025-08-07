class Solution {
    public int balancedStringSplit(String s) {
        int i = 0, c = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'R'){
                i++;
            }
            if(ch == 'L'){
                i--;
            }
            if(i==0){
                c++;
            }
        }
        return c;
    }
}