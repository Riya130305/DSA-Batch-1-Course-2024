class Solution {
    public int maxSubArray(int[] nums) {
        //***KADANES ALGORITHIMS***//
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        for(int num:nums)
        {
            sum +=num;
            maxsum = Math.max(maxsum,sum);
                
            if( sum <0)
            {
                sum=0;
            }
        }
        return maxsum;   
    }
}
time complexity O(n)
 space complexity O(i)
