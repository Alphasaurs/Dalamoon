https://leetcode.com/problems/kth-largest-element-in-an-array/


class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
    
        PriorityQueue<Integer> mn = new PriorityQueue<>();
        
        for(int i=0;i<n;i++)
        {
            mn.add(nums[i]);
            
            if(mn.size()>k)
            {
                mn.poll();
            }
        }
        
        return mn.peek();
        
    }
}
