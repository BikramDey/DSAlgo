class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int l1 = nums1.length, l2 = nums2.length;
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        map.put(nums2[l2-1], -1);
        stack.push(nums2[l2-1]);
        for(int i = l2-2; i>=0;i--){
            while(!stack.isEmpty() && nums2[i]>stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                map.put(nums2[i], -1);
            }else{
                map.put(nums2[i], stack.peek());
            }
            stack.push(nums2[i]);
        }
        for(int i = l1-1; i>=0;i--){
            nums1[i] = map.get(nums1[i]);
        }
        return nums1;

    }
}