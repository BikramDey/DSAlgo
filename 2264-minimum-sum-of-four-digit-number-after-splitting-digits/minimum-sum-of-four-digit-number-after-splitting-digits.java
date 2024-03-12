class Solution {
    public int minimumSum(int num) {
        char[] ch = String.valueOf(num).toCharArray();
        Arrays.sort(ch);
        return  ((ch[0] - '0') * 10 + (ch[2] - '0')) + ((ch[1] - '0') * 10 + (ch[3] - '0'));
    }
}