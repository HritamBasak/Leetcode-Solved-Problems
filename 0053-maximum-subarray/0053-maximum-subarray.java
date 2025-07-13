class Solution {
    public int maxSubArray(int[] nums) {
        /*USiNG O(N^2)
        if(nums.length==1)
        return nums[0];
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length-1;i++)
        {
            sum=nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
                sum=sum+nums[j];
                if(sum>=max)
                {
                    max=sum;
                }
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=max)
            max=nums[i];
        }
        return max;*/
        //USING O(N)
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            max=Math.max(sum,max);
            if(sum<0)
            {
                sum=0;
            }
        }
        return max;
    }
}