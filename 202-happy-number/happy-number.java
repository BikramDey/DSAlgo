class Solution {
    public boolean isHappy(int n) {
        if(n==1)
            return true;
        
        Set<Integer> nums = new HashSet<>();
        int sum=0;
        while(sum!=1 && !nums.contains(n)){
            
            nums.add(n);
            sum=0;
            
            while(n!=0){
                int digit= n%10;
                sum+=digit*digit;
                n=n/10;
            }
            n=sum;
        }
        
        return n==1;
    }
}