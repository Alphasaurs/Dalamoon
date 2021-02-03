https://practice.geeksforgeeks.org/problems/k-largest-elements4206/1

class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
        PriorityQueue<Integer> mn=new PriorityQueue<Integer>();
        for(int i=0;i<n;i++)
        {
            mn.add(arr[i]);
            if(mn.size()>k)
            {
                mn.poll();    
            }
        }
        int ans[]=new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i]=mn.peek();
            mn.poll();
        }
        
       return reverse(ans);
        
  }
}
