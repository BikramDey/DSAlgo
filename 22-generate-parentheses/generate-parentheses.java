class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> str = new ArrayList();
        
        create(n, n, "", str);
        return str;
    }
    private void create(int i, int j, String s, List<String> str){
        
        if(j == 0 && i == 0){
            str.add(s);
            return;
        }

        if(i>0)
            create(i-1, j, s+"(", str);

        if(i<j)
            create(i, j-1, s+")", str);
    }
}