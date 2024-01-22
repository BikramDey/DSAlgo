class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int i,c=0;
        int l[]=new int[n];
        int r[]=new int[n];
        l[0]=height[0];
        r[n-1]=height[n-1];
        for(i=1;i<n;i++){
            if(height[i]>l[i-1])
                l[i]=height[i];
            else
                l[i]=l[i-1];
        }
        for(i=n-2;i>=0;i--){
            if(height[i]>r[i+1])
                r[i]=height[i];
            else
                r[i]=r[i+1];
        }
        for(i=1;i<n-1;i++){
            c+=(Math.min(l[i], r[i])- height[i]);
        }
        return c;
    }
}