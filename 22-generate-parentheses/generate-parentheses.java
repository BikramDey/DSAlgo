class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> str = new ArrayList();
        if(n == 1){
            str.add("()");
            return str;
        }
        create(1, 0, n, "(", str);
        return str;
    }
    private void create(int i, int j, int n, String s, List<String> str){
        
        if(j == n && i == n){
            str.add(s);
            return;
        }

        if(i<n)
            create(i+1, j, n, s+"(", str);

        if(j<i && j<n)
            create(i, j+1, n, s+")", str);
    }
}