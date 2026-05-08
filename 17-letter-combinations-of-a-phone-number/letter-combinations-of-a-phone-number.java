class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        StringBuilder sb = new StringBuilder("");
        allSubsets(0, digits, map, sb, ans);
        return ans;
    }
    private void allSubsets(int index, String digits, Map<Integer, String> map, StringBuilder sb, List<String> ans) {
        if(index == digits.length()){
            ans.add(sb.toString());
            return;
        }
        String str = map.get(digits.charAt(index) - '0');

        for (char ch : str.toCharArray()) {
            sb.append(ch);
            allSubsets(index+1, digits, map, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}