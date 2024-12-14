class Solution {
    public int nextGreaterElement(int n) {
        char digits[] = Integer.toString(n).toCharArray();
        int l = digits.length;

        int j = l - 2;
        while(j >= 0 && digits[j]>=digits[j+1]){
            j--;
        }
        if (j < 0) {
            return -1;
        }
        int i = l - 1;
        while(digits[i]<=digits[j]){
            i--;
        }
        swap(digits, i, j);
        reverse(digits, j+1, l-1);

        long result = Long.parseLong(new String(digits));

        return (result > Integer.MAX_VALUE) ? -1 : (int) result;
    }

    private void swap(char[] digits, int i, int j) {
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;
    }

    private void reverse(char[] digits, int start, int end) {
        while (start < end) {
            swap(digits, start, end);
            start++;
            end--;
        }
    }
}