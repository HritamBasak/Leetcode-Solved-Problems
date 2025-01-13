class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1)
        return 0;

        int prod=1;
        int c=0;
        int left=0;

        for(int right=0;right<nums.length;right++)
        {
            prod=prod*nums[right];
            while(prod>=k && left<=right)
            {
                prod=prod/nums[left];
                left++;
            }
            c+=(right-left)+1;//Formula for calculating the number of subarrays
        }
        return c;
    }
}
