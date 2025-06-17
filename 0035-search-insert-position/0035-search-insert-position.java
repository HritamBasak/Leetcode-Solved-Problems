class Solution {
    public int searchInsert(int[] nums, int target) {
        // ArrayList<Integer> list=new ArrayList<>();
        // int max=0,min=Integer.MAX_VALUE;
        // for(int i=0;i<nums.length;i++)
        // {
        //     list.add(nums[i]);
        //     if(nums[i]>max)
        //     {
        //         max=nums[i];
        //     }
        //     if(nums[i]<min)
        //     {
        //         min=nums[i];
        //     }
        // }
        // if(target>max)
        // return nums.length;
        // if(target<min)
        // return 0;
        // int index=-1;
        // if(list.contains(target))
        // {
        //     for(int i=0;i<list.size();i++)
        //     {
        //         if(target==nums[i])
        //         index=i;
        //     }
        // }
        // else
        // {
        //     for(int i=0;i<list.size()-1;i++)
        //     {
        //         if(target>nums[i] && target<nums[i+1])
        //         index=i+1;
        //     }
        // }
        // return index;
        int l=0;
        int r=nums.length-1;
        int index=-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(nums[mid]==target)
            index=mid;

            if(nums[mid]>target)
            r=mid-1;

            else
            l=mid+1;
        }
        return index!=-1?index:l;
    }
}