class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        int i = s.length()-1;
        int j = t.length()-1;
        int c = 0;
        while(true){
            c = 0;
            while(i>=0 && (s.charAt(i) == '#' || c>0)){
                c += s.charAt(i) == '#' ? 1 : -1;
                i--;
            }
            c = 0;
            while(j>=0 && (t.charAt(j) == '#' || c>0)){
                c += t.charAt(j) == '#' ? 1 : -1;
                j--;
            }
            if(i>=0 && j>=0 && s.charAt(i) == t.charAt(j)){
                i--;
                j--;
            }else{
                break;
            }
        }
        return i==-1 && j==-1;
    }
}