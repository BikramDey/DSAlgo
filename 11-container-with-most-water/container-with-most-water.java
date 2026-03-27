class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1, max = 0;
        while(l<r){
            int k = Math.min(height[l], height[r]);
            int val = k * (r-l);
            max = Math.max(val, max);
            if(height[l] < height[r])
                l++;
            else
                r--;
        }
        return max;
    }
}