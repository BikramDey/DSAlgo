class Solution {
    public int findDuplicate(int[] arr) {
        int i, repeat = -1;
        for (i = 0; i < arr.length; i++) {
            int abs_val = Math.abs(arr[i]);
            if (arr[abs_val - 1] > 0)
                arr[abs_val - 1] = -arr[abs_val - 1];
            else{
                repeat = abs_val;
            }
        }
        return repeat;
    }
}