class Solution {
    public boolean increasingTriplet(int[] nums) {
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        right[0]=0;
        left[0]=0;
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]<min)
            {
                min=nums[i-1];
                left[i]=min;
            }
            else
            {
                left[i]=min;
            }
        }
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i+1]>max)
            {
                max=nums[i+1];
                right[i]=max;
            }
            else
            {
                right[i]=max;
            }
        }
        for(int i=1;i<nums.length-1;i++)
        {
            if(nums[i]>left[i] && nums[i]<right[i])
            return true;
        }
        return false;
    }
}