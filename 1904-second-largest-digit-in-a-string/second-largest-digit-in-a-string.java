class Solution {
    public int secondHighest(String s) {
        int l = -1;
        int l2 = -1;
        for(char c : s.toCharArray()){
            if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);
                if(digit>l){
                    l2 = l;
                    l = digit;
                }else if(digit>l2 && digit<l){
                    l2 = digit;
                }
            }
        }
        return l2;
    }
}