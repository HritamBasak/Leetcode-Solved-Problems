class Solution {
    public int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
        int l=0,r=nums.length-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(nums[l]<=nums[mid])
            {
                if(nums[l]<min)
                min=nums[l];

                l=mid+1;
            }
            else
            {
                if(nums[mid]<min)
                min=nums[mid];

                r=mid-1;;
            }
        }
        return min;
    }
}