class Solution {
    public int findPeakElement(int[] nums) {

        if(nums.length==1)
        return 0;

        if(nums[0]<nums[1] && nums[nums.length-2]<nums[nums.length-1])
        return nums.length-1;

        if(nums[0]>nums[1] && nums[nums.length-2]>nums[nums.length-1])
        return 0;

        int l=1;
        int r=nums.length-2;
        while(l<=r)
        {
            int mid=(l+r)/2;
            
            if(mid==nums.length-1)
            return mid;

            if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1])
            return mid;

            else if(nums[mid]<nums[mid+1])
            l=mid+1;

            else
            r=mid-1;
        }
        return nums.length-1;
    }
}