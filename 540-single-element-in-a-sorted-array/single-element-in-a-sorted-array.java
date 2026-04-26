class Solution {
    public int singleNonDuplicate(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (m > 0 && arr[m] == arr[m - 1]) {
                int leftCount = m - 1 - l;
                if (leftCount % 2 == 1)
                    r = m - 2;
                else
                    l = m + 1;
            } else if (m < arr.length - 1 && arr[m] == arr[m + 1]) {
                int leftCount = m - l;
                if (leftCount % 2 == 1)
                    r = m - 1;
                else
                    l = m + 2;
            } else {
                return arr[m];
            }
        }
        return arr[l];
    }
}