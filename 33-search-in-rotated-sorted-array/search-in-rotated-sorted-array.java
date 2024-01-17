class Solution {
    public int search(int[] a, int target) {
        
        int n=a.length;
        int p=pivotIndex(a, 0, n - 1);
        int z=-1;
        if(p==-1){
            z = bsearch(a,0,n-1,target);
        }
        else{
            int x = bsearch(a,0,p,target);
            int y = bsearch(a,p+1,n-1,target);
            z = Math.max(x,y);
        }
        return z;
    }
    static int pivotIndex(int arr[], int l, int r)
    {
        if (l>r)
            return -1;
        if (l==r)
            return l;
 
        int mid = (l + r)/2;
        if (mid < r && arr[mid] > arr[mid + 1])
            return mid;
        if (mid > l && arr[mid] < arr[mid - 1])
            return (mid - 1);
        if (arr[l] >= arr[mid])
            return pivotIndex(arr, l, mid - 1);
        return pivotIndex(arr, mid + 1, r);
    }
    public static int bsearch(int a[], int l, int r, int k){
        if(l>r){
            return -1;
        }
        int mid=(l+r)/2;
        if(a[mid]==k)
            return mid;
        
        if(a[mid]<k)
            return bsearch(a,mid+1,r,k);

        return bsearch(a,l,mid-1,k);
    }
}