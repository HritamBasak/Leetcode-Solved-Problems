class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=searchFirst(nums,target);
        int last=searchLast(nums,target);
        return new int[]{first,last};
    }
    public int searchFirst(int nums[],int target)
    {
        int l=0,r=nums.length-1;
        int ans=-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(nums[mid]==target)
            {
                ans=mid;
                r=mid-1;
            }
            else if(nums[mid]<target)
            l=mid+1;

            else
            r=mid-1;
        }
        return ans;
    }
    public int searchLast(int nums[],int target)
    {
        int l=0,r=nums.length-1;
        int ans=-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(nums[mid]==target)
            {
                ans=mid;
                l=mid+1;
            }
            else if(nums[mid]<target)
            l=mid+1;

            else
            r=mid-1;
        }
        return ans;
    }
}